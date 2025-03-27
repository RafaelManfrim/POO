package aula10;

public class Funcionario extends Pessoa {
  private float salario;
  private String cargo;

  public Funcionario() {
    System.out.println("Construtor de Funcionario");
  }

  public float getSalario() {
    return salario;
  }

  public void setSalario(float salario) {
    this.salario = salario;
  }

  public String getCargo() {
    return cargo;
  }

  public void setCargo(String cargo) {
    this.cargo = cargo;
  }
}