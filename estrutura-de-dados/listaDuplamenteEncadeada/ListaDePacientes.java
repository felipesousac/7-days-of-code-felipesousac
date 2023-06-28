package listaDuplamenteEncadeada;

public class ListaDePacientes {
    private Paciente primeira = null;
    private Paciente ultima = null;
    private int totalDeElementos = 0;

    public void adicionaNoComeco(String nome, int numeroIdentificacao, String estadoSaude) {
        if (this.totalDeElementos == 0) {
            Paciente nova = new Paciente(nome, numeroIdentificacao, estadoSaude);
            this.primeira = nova;
            this.ultima = nova;
        } else {
            Paciente nova = new Paciente(nome, numeroIdentificacao, estadoSaude, this.primeira);
            this.primeira.setAnterior(nova);
            this.primeira = nova;
        }
        this.totalDeElementos++;
    }

    public void adicionaNoFim(String nome, int numeroIdentificacao, String estadoSaude) {
        if (this.totalDeElementos == 0) {
            adicionaNoComeco(nome, numeroIdentificacao, estadoSaude);
        } else {
            Paciente nova = new Paciente(nome, numeroIdentificacao, estadoSaude);
            this.ultima.setProximo(nova);
            nova.setAnterior(this.ultima);
            this.ultima = nova;

            this.totalDeElementos++;
        }
    }

    public void adiciona(int posicao, String nome, int numeroIdentificacao, String estadoSaude) {

        if (posicao == 0) {
            adicionaNoComeco(nome, numeroIdentificacao, estadoSaude);
        } else if (posicao == this.totalDeElementos) {
            adicionaNoFim(nome, numeroIdentificacao, estadoSaude);
        } else {
            Paciente anterior = this.pegaCelula(posicao - 1);
            Paciente proxima = anterior.getProximo();

            Paciente nova = new Paciente(nome, numeroIdentificacao, estadoSaude, anterior.getProximo());
            nova.setAnterior(anterior);
            anterior.setProximo(nova);
            proxima.setAnterior(nova);
            this.totalDeElementos++;
        }
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

    public void removeDoFim() {
        if (this.totalDeElementos == 1) {
            this.removeDoComeco();
        } else {
            Paciente penultima = this.ultima.getAnterior();
            penultima.setProximo(null);
            this.ultima = penultima;
            this.totalDeElementos--;
        }
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
        if (posicao == 0) {
            this.removeDoComeco();
        } else if (posicao == this.totalDeElementos - 1) {
            this.removeDoFim();
        } else {
            Paciente anterior = this.pegaCelula(posicao - 1);
            Paciente atual = anterior.getProximo();
            Paciente proximo = atual.getProximo();

            anterior.setProximo(proximo);
            proximo.setAnterior(anterior);

            this.totalDeElementos--;
        }

    }

    public int tamanho() {
        return this.totalDeElementos;
    }

    public boolean contem(String nome) {
        Paciente atual = this.primeira;

        while (atual != null) {
            if (atual.getNome().equals(nome)) {
                return true;
            }
            atual = atual.getProximo();
        }
        System.out.println("Item não encontrado no estoque");
        return false;
    }

    void atualizaNome(String nome, String novoNome) {
        Paciente atual = this.primeira;

        while (atual != null) {
            if (atual.getNome() == nome) {
                atual.setNome(novoNome);
            }
        }
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
