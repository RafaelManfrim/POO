package aula05;

import java.util.Scanner;

public class GradeBookTest {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter the course name: ");
    String courseName = scanner.nextLine();
    GradeBook myGradeBook = new GradeBook(courseName);

    myGradeBook.displayMessage();

    scanner.close();
  }
}
