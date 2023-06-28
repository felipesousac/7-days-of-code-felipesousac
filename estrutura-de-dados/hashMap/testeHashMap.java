package hashMap;

import java.util.HashMap;

public class testeHashMap {
    public static void main(String[] args) {
        Pontuacao teste = new Pontuacao();

        teste.adiciona("Felipe", 1);
        teste.adiciona("Cloro", 2);
        teste.adiciona("Claudio", 43);



        System.out.println(teste);
        teste.printaDescrescente();
        System.out.println(teste);
        teste.vencedor();

    }
}
