package aula09;

public class CommissionEmployee extends Object {
  private final String firstName;
  private final String lastName;
  private final String socialSecurityNumber;
  private double grossSales;
  private double commissionRate;

  public CommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales, double commissionRate) {
    if (grossSales < 0.0) {
      throw new IllegalArgumentException("Gross sales must be >= 0.0");
    }

    if (commissionRate <= 0.0 || commissionRate > 1.0) {
      throw new IllegalArgumentException("Commission rate must be > 0.0 and < 1.0");
    }

    this.firstName = firstName;
    this.lastName = lastName;
    this.socialSecurityNumber = socialSecurityNumber;
    this.grossSales = grossSales;
    this.commissionRate = commissionRate;
  }

  public String getFirstName() {
    return this.firstName;
  }

  public String getLastName() {
    return this.lastName;
  }

  public String getSocialSecurityNumber() {
    return this.socialSecurityNumber;
  }

  public void setGrossSales(double grossSales) {
    if (grossSales < 0.0) {
      throw new IllegalArgumentException("Gross sales must be >= 0.0");
    }

    this.grossSales = grossSales;
  }

  public double getGrossSales() {
    return this.grossSales;
  }

  public void setCommissionRate(double commissionRate) {
    if (commissionRate <= 0.0 || commissionRate > 1.0) {
      throw new IllegalArgumentException("Commission rate must be > 0.0 and < 1.0");
    }

    this.commissionRate = commissionRate;
  }

  public double getCommissionRate() {
    return this.commissionRate;
  }

  public double earnings() {
    return this.commissionRate * this.grossSales;
  }

  @Override
  public String toString() {
    return String.format(
      "%s: %s %s%n%s: %s%n%s: %.2f%n%s: %.2f", 
      "commission employee", this.firstName, this.lastName,
      "social security number", this.socialSecurityNumber,
      "gross sales", this.grossSales,
      "commission rate", this.commissionRate
    )
  }
}
