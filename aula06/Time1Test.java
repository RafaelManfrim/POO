package aula06;

public class Time1Test {
  public static void main(String[] args) {
    Time1 time = new Time1();

    System.out.print("The initial universal time is: ");
    System.out.println(time.toUniversalString());
    System.out.print("The initial standard time is: ");
    System.out.println(time.toString());
    System.out.println();

    time.setTime(13, 27, 6);
    System.out.print("Universal time after setTime is: ");
    System.out.println(time.toUniversalString());
    System.out.print("Standard time after setTime is: ");
    System.out.println(time.toString());
    System.out.println();

    time.setTime(99, 99, 99);
    System.out.println("After attempting invalid settings: ");
    System.out.print("Universal time: ");
    System.out.println(time.toUniversalString());
    System.out.print("Standard time: ");
    System.out.println(time.toString());
  }
}
