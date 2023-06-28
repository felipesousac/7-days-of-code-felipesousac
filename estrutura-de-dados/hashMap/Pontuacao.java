package hashMap;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Pontuacao {
    private HashMap<String, Integer> pontuacao = new HashMap<>();


    public void adiciona(String nome, int pontos) {
        pontuacao.put(nome, pontos);
    }

    public void atualiza(String nome, int pontos) {
        if (!pontuacao.containsKey(nome)) {
            System.out.println("Jogador " + nome + " não encontrado");
        }
        pontuacao.replace(nome, pontos);
    }

    public void remove(String nome) {
        pontuacao.remove(nome);
    }

    public void printaDescrescente() {
        pontuacao.entrySet().stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .forEach(jogador -> System.out.println("Jogador: " + jogador.getKey() + " - " + "Pontuacao: " + jogador.getValue()));
    }

    public void vencedor() {
        int maiorValor = (Collections.max(pontuacao.values()));

        for (Map.Entry<String, Integer> entry : pontuacao.entrySet()) {
            if (entry.getValue() == maiorValor) {
                System.out.println("Jogador vencedor: " + entry.getKey());
            }
        }
    }

    @Override
    public String toString() {
        return "" +
                pontuacao +
                "";
    }
}
