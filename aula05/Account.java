package aula05;

public class Account {
  private double balance;

  public Account(double initialBalance) {
    if (initialBalance > 0.0) {
      this.balance = initialBalance;
    }
  }

  public void credit(double amount) {
    this.balance += amount;
  }

  public double getBalance() {
    return this.balance;
  }
}
