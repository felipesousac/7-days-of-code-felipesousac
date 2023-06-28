package listaEncadeada;

public class ListaDePacientes {
    private Paciente primeira = null; //primeiro nó se chama head
    private Paciente ultima = null; //último nó se chama tail
    private int totalDeElementos = 0;

    public void adicionaNoComeco(String nome, int numeroIdentificacao, String estadoSaude) {
        Paciente nova = new Paciente(nome, numeroIdentificacao, estadoSaude, this.primeira);
        this.primeira = nova;

        if (this.totalDeElementos == 0) {
            this.ultima = this.primeira;
        }

        this.totalDeElementos++;
    }

    public void adicionaNoFim(String nome, int numeroIdentificacao, String estadoSaude) {
        if (this.totalDeElementos == 0) {
            adicionaNoComeco(nome, numeroIdentificacao, estadoSaude);
        }

        Paciente nova = new Paciente(nome, numeroIdentificacao, estadoSaude, null);
        this.ultima.setProximo(nova);
        this.ultima = nova;

        this.totalDeElementos++;
    }

    public void adiciona(int posicao, String nome, int numeroIdentificacao, String estadoSaude) {

        if (posicao == 0) {
            adicionaNoComeco(nome, numeroIdentificacao, estadoSaude);
        } else if (posicao == this.totalDeElementos) {
            adicionaNoFim(nome, numeroIdentificacao, estadoSaude);
        }

        Paciente anterior = this.pegaCelula(posicao - 1);
        Paciente nova = new Paciente(nome, numeroIdentificacao, estadoSaude, anterior.getProximo());
        anterior.setProximo(nova);

        this.totalDeElementos++;
    }

    private boolean posicaoOcupada(int posicao) {
        return posicao >= 0 && posicao < this.totalDeElementos;
    }

    private Paciente pegaCelula(int posicao) {
        if (!posicaoOcupada(posicao)) {
            throw new IllegalArgumentException("Posição inexistente");
        }

        Paciente atual = this.primeira;

        for (int i = 0; i < posicao; i++) {
            atual = atual.getProximo();
        }

        return atual;
    }

    public String pega(int posicao) {
        return this.pegaCelula(posicao).getNome();
    }

    public void removeDoComeco() {
        if (this.totalDeElementos == 0) {
            throw new IllegalArgumentException("Lista Vazia");
        }

        this.primeira = this.primeira.getProximo();
        this.totalDeElementos--;

        if (this.totalDeElementos == 0) {
            this.ultima = null;
        }
    }

    public void remove(int posicao) {
        Paciente anterior = this.pegaCelula(posicao - 1);
        Paciente atual = anterior.getProximo();
        Paciente proximo = atual.getProximo();

        anterior.setProximo(proximo);

        this.totalDeElementos--;
    }

    public int tamanho() {
        return this.totalDeElementos;
    }

    public boolean contem(Object o) {
        return false;
    }


        @Override
    public String toString() {

        if(this.totalDeElementos == 0) {
            return "Nenhum paciente registrado.";
        }

        Paciente atual = primeira;

        StringBuilder builder = new StringBuilder("");

        for(int i = 0; i < totalDeElementos; i++) {
            builder.append("Nome: " + atual.getNome());
            builder.append(" - ");
            builder.append("Número: " + atual.getNumeroIdentificacao());
            builder.append(" - ");
            builder.append("Estado de saúde: " + atual.getEstadoSaude());
            builder.append("\n");

            atual = atual.getProximo();
        }

        builder.append("");

        return builder.toString();
    }
}
