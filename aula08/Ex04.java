// • Crie um programa que verifique se um número é positivo ou negativo.
// • Utilize uma instrução if para tomar a decisão.
// • Imprima uma mensagem apropriada com o resultado.

package aula08;

public class Ex04 {
  public static void main(String[] args) {
    int n = -10;
    if (n >= 0) {
      System.out.println("O número " + n + " é positivo.");
    } else {
      System.out.println("O número " + n + " é negativo.");
    }
  }
}
