package fila;


public class testeFila {
    public static void main(String[] args) {
        FilaDePedidos fila = new FilaDePedidos();

        fila.adiciona("Teste1", 1);
        fila.adiciona("Teste2", 2);

        System.out.println(fila);
        fila.remove();

        fila.adiciona("Teste3", 3);
        fila.adiciona("Teste4", 4);

        System.out.println(fila);
    }
}
