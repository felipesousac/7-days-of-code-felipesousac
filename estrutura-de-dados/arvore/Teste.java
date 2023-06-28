package arvore;

import java.util.Random;

public class Teste {
    public static void main(String[] args) {
        Random random = new Random();

        Arvore arvore = new Arvore();

        arvore.insert(random.nextInt(50), "Produto1", random.nextInt(100), arvore.root);
        arvore.insert(random.nextInt(50), "Produto2", random.nextInt(100), arvore.root);
        arvore.insert(random.nextInt(50), "Produto3", random.nextInt(100), arvore.root);
        arvore.insert(random.nextInt(50), "Produto4", random.nextInt(100), arvore.root);
        arvore.insert(random.nextInt(50), "Produto5", random.nextInt(100), arvore.root);
        arvore.insert(random.nextInt(50), "Produto6", random.nextInt(100), arvore.root);
        arvore.insert(random.nextInt(50), "Produto7", random.nextInt(100), arvore.root);
        arvore.insert(random.nextInt(50), "Produto8", random.nextInt(100), arvore.root);
        arvore.insert(random.nextInt(50), "Produto9", random.nextInt(100), arvore.root);
        arvore.insert(10, "Produto10", random.nextInt(100), arvore.root);

        arvore.insert(10, "Teste", 100, arvore.root);
        arvore.inOrder(arvore.root);

        arvore.busca(51, arvore.root);
    }
}
