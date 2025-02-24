package aula05;

public class GradeBook {
  private String courseName;

  public GradeBook(String courseName) {
    this.courseName = courseName;
  }

  public String getCourseName() {
    return this.courseName;
  }

  public void setCourseName(String courseName) {
    this.courseName = courseName;
  }

  public void displayMessage() {
    System.out.println("Welcome to the Grade Book! " + getCourseName());
  }
}
