package aula06;

public class Time2Test {
  public static void main(String[] args) {
    Time2 time = new Time2();

    displayTime("After time object is created", time);
    System.out.println();

    time.setTime(13, 27, 6);
    displayTime("After calling setTime", time);
    System.out.println();

    try {
      time.setTime(99, 99, 99);
    } catch (IllegalArgumentException e) {
      System.out.printf("Exception: %s%n%n", e.getMessage());
    }

    displayTime("After calling setTime with invalid values", time);
  }

  private static void displayTime(String header, Time2 t) {
    System.out.printf("%s%nUniversal time: %s%nStandard time: %s%n",
        header, t.toUniversalString(), t.toString());
  }
}
