package array;

public class TesteListaCompras {
    public static void main(String[] args) {
        ListaDeCompras vetor = new ListaDeCompras(5);

        vetor.adicionar_item("Carne", 3);
        vetor.adicionar_item("Frango", 2);
        vetor.adicionar_item("Ovos", 5);

        vetor.listar_itens();
        vetor.remover_item("Frango");
        System.out.println("======");
        vetor.listar_itens();
    }
}
