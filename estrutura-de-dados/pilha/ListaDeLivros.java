package pilha;

import java.util.LinkedList;
import java.util.List;

public class ListaDeLivros {

    private List<Livro> livros = new LinkedList<Livro>();
    private int totalDeElementos = 0;

    public void insere(String nome, int paginas) {
        Livro novo = new Livro(nome, paginas);
        livros.add(novo);

        this.totalDeElementos++;
    }

    public void remove() {
        livros.remove(livros.size() - 1);
    }

    public boolean vazia() {
        return livros.isEmpty();
    }

    @Override
    public String toString() {

        if(this.totalDeElementos == 0) {
            return "Nenhum livro na lista.";
        }
        System.out.println("===LIVROS===");
        livros.forEach(livro -> System.out.println("Pedido: " + livro.getNome() + " - " + "Páginas: " + livro.getPaginas()));
        return "============\n";
    }
}
