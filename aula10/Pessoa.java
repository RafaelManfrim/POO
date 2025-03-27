package aula10;

public class Pessoa {
  private String nome;
  private String endereco;
  private String dataNascimento;

  public Pessoa() {
    System.out.println("Construtor de Pessoa");
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getNome() {
    return nome;
  }

  public void setEndereco(String endereco) {
    this.endereco = endereco;
  }

  public String getEndereco() {
    return endereco;
  }

  public void setDataNascimento(String dataNascimento) {
    this.dataNascimento = dataNascimento;
  }

  public String getDataNascimento() {
    return dataNascimento;
  }
}