package fila;

public class Pedido {

    private String nomePrato;
    private int mesa;

    public Pedido(String nomePrato, int mesa) {
        this.nomePrato = nomePrato;
        this.mesa = mesa;
    }

    public String getNomePrato() {
        return nomePrato;
    }

    public void setNomePrato(String nomePrato) {
        this.nomePrato = nomePrato;
    }

    public int getMesa() {
        return mesa;
    }

    public void setMesa(int mesa) {
        this.mesa = mesa;
    }

}
