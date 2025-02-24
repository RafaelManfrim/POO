package aula05;

import java.util.Scanner;

public class AccountTest {
  public static void main(String[] args) {
    Account account1 = new Account(10);
    Account account2 = new Account(-50);

    System.out.printf("account1 balance: $%.2f%n", account1.getBalance());
    System.out.printf("account2 balance: $%.2f%n", account2.getBalance());

    Scanner scanner = new Scanner(System.in);

    double depositAmount;

    System.out.print("Enter deposit amount for account1: ");
    depositAmount = scanner.nextDouble();
    System.out.printf("%nadding %.2f to account1 balance%n%n", depositAmount);
    account1.credit(depositAmount);

    System.out.printf("account1 balance: $%.2f%n", account1.getBalance());
    System.out.printf("account2 balance: $%.2f%n", account2.getBalance());

    System.out.print("Enter deposit amount for account2: ");
    depositAmount = scanner.nextDouble();
    System.out.printf("%nadding %.2f to account2 balance%n%n", depositAmount);
    account2.credit(depositAmount);

    System.out.printf("account1 balance: $%.2f%n", account1.getBalance());
    System.out.printf("account2 balance: $%.2f%n", account2.getBalance());

    scanner.close();
  }
}
