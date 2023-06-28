package array;

import java.util.Arrays;

public class ListaDeCompras {
   private String[] itens;
   private int[] quantidades;
   private int tamanho;

   public ListaDeCompras(int capacidade) {
      this.itens = new String[capacidade];
      this.quantidades = new int[capacidade];
      this.tamanho = 0;
   }

   public boolean adicionar_item(String produto, int quantidade) {
      if (this.tamanho < this.itens.length) {
         this.itens[this.tamanho] = produto;
         this.quantidades[this.tamanho] = quantidade;
         this.tamanho++;
         return true;
      }
      return false;
   }

   public void remover_item(String produto) {
      int marcador = 0;

      for (int i = 0; i < this.itens.length; i++) {
         if(this.itens[i] == produto) {
            marcador = i;
            break;
         }
      }

      for (int i = marcador; i < this.tamanho - 1; i++) {
         this.itens[i] = this.itens[i + 1];
         this.quantidades[i] = this.quantidades[i + 1];
      }

      this.tamanho--;
   }

   public void listar_itens() {
      for (int i = 0; i < this.tamanho; i++) {
         System.out.println("Produto: " + this.itens[i] + " - Quantidade: " + this.quantidades[i]);
      }

   }
}
