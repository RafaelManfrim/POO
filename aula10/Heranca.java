package aula10;

public class Heranca {
  public static void main(String[] args) {
    System.out.println("Iniciando o processo de criacao de um objeto Pessoa ");
    Pessoa p = new Pessoa();

    System.out.println("Iniciando o processo de criacao de um objeto Aluno ");
    Aluno a = new Aluno();

    System.out.println("Iniciando o processo de criacao de um objeto Funcionario ");
    Funcionario f = new Funcionario();

    p.setNome("Vanderlei");
    p.setEndereco("Rua 15 novembro,345");
    p.setDataNascimento("12/05/1960");

    a.setNome("Maria");
    a.setEndereco("Rua 26 agosto,1874");
    a.setDataNascimento("31/01/1990");
    a.setCurso("Ciencia da Computacao ");
    a.setSemestre("4");

    f.setNome("Pedro");
    f.setEndereco("Rua 07 de setembro,3875");
    f.setDataNascimento("27/10/1980");
    f.setCargo("Arquiteto de Software");
    f.setSalario(10000);

    System.out.println("\nDados cadastrados no objeto p - do tipo pessoa");
    System.out.println("Nome: "+p.getNome());
    System.out.println("Endereco: "+p.getEndereco());
    System.out.println("Data de Nascimento: "+p.getDataNascimento());

    System.out.println("\nDados cadastrados no objeto a - do tipo aluno");
    System.out.println("Nome: "+a.getNome());
    System.out.println("Endereco: "+a.getEndereco());
    System.out.println("Data de Nascimento: "+a.getDataNascimento());
    System.out.println("Curso: "+a.getCurso());
    System.out.println("Semestre: "+a.getSemestre());

    System.out.println("\nDados cadastrados no objeto f - do tipo funcionario");
    System.out.println("Nome: "+f.getNome());
    System.out.println("Endereco: "+f.getEndereco());
    System.out.println("Data de Nascimento: "+f.getDataNascimento());
    System.out.println("Cargo: "+f.getCargo());
    System.out.println("Salario: "+f.getSalario());
  }
}