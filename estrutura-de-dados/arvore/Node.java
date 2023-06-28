package arvore;

public class Node {
    protected Produto produto;
    protected Node esq, dir;

    Node(Produto produto) {
        this.produto = produto;
        this.esq = null;
        this.dir = null;
    }
}
