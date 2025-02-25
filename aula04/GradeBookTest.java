package aula04;

import java.util.Scanner;

public class GradeBookTest {
  public static void main(String[] args) {
    GradeBook myGradeBook = new GradeBook();
    Scanner scanner = new Scanner(System.in);

    System.out.println("Nome do curso inicial " + myGradeBook.getCourseName());

    System.out.print("Enter the course name: ");
    String courseName = scanner.nextLine();
    myGradeBook.setCourseName(courseName);

    myGradeBook.displayMessage();

    scanner.close();
  }
}
