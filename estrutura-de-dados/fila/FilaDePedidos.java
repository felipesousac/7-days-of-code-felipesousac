package fila;


import java.util.LinkedList;
import java.util.List;

public class FilaDePedidos {
    private List<Pedido> pedidos = new LinkedList<Pedido>();
    private int totalDeElementos = 0;

    public void adiciona(String nomePrato, int mesa) {
        Pedido novo = new Pedido(nomePrato, mesa);
        pedidos.add(novo);

        this.totalDeElementos++;
    }

    public void remove() {
        pedidos.remove(0);

        this.totalDeElementos--;
    }

    public boolean vazia() {
        return pedidos.isEmpty();
    }

    @Override
    public String toString() {

        if(this.totalDeElementos == 0) {
            return "Nenhum pedido registrado.";
        }
        System.out.println("===PEDIDOS===");
        pedidos.forEach(pedido -> System.out.println("Pedido: " + pedido.getNomePrato() + " - " + "Mesa: " + pedido.getMesa()));
        return "=============\n";
    }
}
