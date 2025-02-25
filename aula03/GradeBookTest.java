package aula03;

import java.util.Scanner;

public class GradeBookTest {
  public static void main(String[] args) {
    GradeBook myGradeBook = new GradeBook();
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the course name: ");
    String courseName = scanner.nextLine();
    myGradeBook.displayMessage(courseName);
    scanner.close();
  }
}
