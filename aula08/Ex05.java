// • Utilize a classe Scanner para obter entrada do usuário.
// • Peça ao usuário para inserir um número inteiro.
// • Imprima o número inserido na tela.

package aula08;

import java.util.Scanner;

public class Ex05 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Digite um número inteiro: ");
    int n = scanner.nextInt();
    System.out.println("O número digitado foi: " + n);
    scanner.close();
  }
}
