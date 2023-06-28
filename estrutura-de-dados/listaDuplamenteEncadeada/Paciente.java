package listaDuplamenteEncadeada;

public class Paciente {
    private String nome;
    private int numeroIdentificacao;
    private String estadoSaude;
    private Paciente proximo;
    private Paciente anterior;


    public Paciente(String nome, int numeroIdentificacao, String estadoSaude) {
        this.nome = nome;
        this.estadoSaude = estadoSaude;
        this.numeroIdentificacao = numeroIdentificacao;
        this.proximo = null;
    }

    public Paciente(String nome, int numeroIdentificacao, String estadoSaude, Paciente proximo) {
        this.nome = nome;
        this.estadoSaude = estadoSaude;
        this.numeroIdentificacao = numeroIdentificacao;
        this.proximo = proximo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumeroIdentificacao() {
        return numeroIdentificacao;
    }

    public void setNumeroIdentificacao(int numeroIdentificacao) {
        this.numeroIdentificacao = numeroIdentificacao;
    }

    public String getEstadoSaude() {
        return estadoSaude;
    }

    public void setEstadoSaude(String estadoSaude) {
        this.estadoSaude = estadoSaude;
    }

    public Paciente getProximo() {
        return proximo;
    }

    public void setProximo(Paciente proximo) {
        this.proximo = proximo;
    }

    public Paciente getAnterior() {
        return anterior;
    }

    public void setAnterior(Paciente anterior) {
        this.anterior = anterior;
    }




}
