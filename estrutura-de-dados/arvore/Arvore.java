package arvore;

public class Arvore {
    protected Node root = null;

    public void insert(int id, String nome, int quantidade, Node place) {
        if (place == null) {
            Produto product = new Produto(id, nome, quantidade);
            this.root = new Node(product);
        } else if (id == place.produto.getId()) { //atualiza produtos com mesmo id
            place.produto.setNome(nome);
            place.produto.setQuantidade(quantidade);
        } else if (id < place.produto.getId()) {
            if (place.esq == null) {
                Produto product = new Produto(id, nome, quantidade);
                place.esq = new Node(product);
            } else {
                insert(id, nome, quantidade, place.esq);
            }
        } else if (id > place.produto.getId()) {
            if (place.dir == null) {
                Produto product = new Produto(id, nome, quantidade);
                place.dir = new Node(product);
            } else {
                insert(id, nome, quantidade, place.dir);
            }
        }
    }

    public void preOrder(Node place) {
        System.out.println("ID: " + place.produto.getId() +" - Nome: " + place.produto.getNome());
        if (place.esq != null) {
            preOrder(place.esq);
        }
        if (place.dir != null) {
            preOrder(place.dir);
        }
    }

    public void inOrder(Node place) {
        if (place.esq != null) {
            inOrder(place.esq);
        }
        System.out.println("ID: " + place.produto.getId() +" - Nome: " +place.produto.getNome());

        if (place.dir != null) {
            inOrder(place.dir);
        }
    }

    public void posOrder(Node place) {
        if (place.esq != null) {
           posOrder(place.esq);
        }
        if (place.dir != null) {
           posOrder(place.dir);
        }
        System.out.println("ID: " + place.produto.getId() +" - Nome: " +place.produto.getNome());
    }

    public Node busca(int id, Node raiz) {
        if (raiz == null) {
            System.out.println("Produto não encontrado");
            return raiz;
        }
        if (id == raiz.produto.getId() /*|| raiz == null*/) {
            System.out.println("Id: " + raiz.produto.getId() + " - Nome: " + raiz.produto.getNome() + " - Quantidade: " + raiz.produto.getQuantidade());
            return raiz;
        } else if (id < raiz.produto.getId()) {
            busca(id, raiz.esq);
        } else if (id > raiz.produto.getId()) {
            busca(id, raiz.dir);
        }
        return raiz;
    }
}
