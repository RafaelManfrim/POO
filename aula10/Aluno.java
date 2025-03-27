package aula10;

public class Aluno extends Pessoa {
  private String curso;
  private String semestre;

  public Aluno(){
    System.out.println("Construtor de Aluno");
  }

  public void setCurso(String curso){
    this.curso = curso;
  }

  public String getCurso(){
    return curso;
  }

  public void setSemestre(String semestre){
    this.semestre = semestre;
  }

  public String getSemestre(){
    return semestre;
  }
}