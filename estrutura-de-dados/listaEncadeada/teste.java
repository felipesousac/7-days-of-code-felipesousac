package listaEncadeada;

public class teste {
    public static void main(String[] args) {
        ListaDePacientes lista = new ListaDePacientes();

        System.out.println(lista);
        lista.adicionaNoComeco("Felipe", 123, "Saudavel");


//        System.out.println("Tamamho: " + lista.getTamanho());
//
        lista.adicionaNoComeco("Claudio", 321, "Saudavel");


        lista.adicionaNoFim("Cloro", 321, "Saudavel");


        lista.adiciona(2,"Rica", 321, "Saudavel");
        System.out.println(lista);




//        System.out.println("Tamamho: " + lista.getTamanho());
    }
}
