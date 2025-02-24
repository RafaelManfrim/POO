package aula01;

import java.util.Scanner;

public class Exemplo1 {
  public static class Produto {
    public float valor;
    public String tipo;

    public float valorImposto() {
      float i;

      if (valor < 500) {
        i = (float) (valor * 0.1);
      } else {
        i = (float) (valor * 0.15);
      }

      return i;
    }
  }

  public static void main(String[] args) {
    Scanner dado = new Scanner(System.in);
    Produto p = new Produto();
    float preco, imp;
    String tipo;
    System.out.print("Digite o preco do produto: ");
    preco = dado.nextFloat();
    System.out.print("Digite o tipo do produto: ");
    tipo = dado.next();
    p.valor = preco;
    p.tipo = tipo;
    imp = p.valorImposto();
    System.out.println("Preço do produto " + preco);
    System.out.println("Tipo do produto " + tipo);
    System.out.println("Imposto do produto " + imp);
    dado.close();
  }
}