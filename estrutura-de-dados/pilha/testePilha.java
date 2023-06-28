package pilha;

public class testePilha {
    public static void main(String[] args) {
        ListaDeLivros livros = new ListaDeLivros();

        livros.insere("Cronica1", 1);
        livros.insere("Cronica2", 2);
        livros.insere("Cronica3", 3);
        livros.insere("Cronica4", 4);

        livros.remove();
        System.out.println(livros);
    }
}
