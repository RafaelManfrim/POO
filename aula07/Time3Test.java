package aula07;

public class Time3Test {
  public static void main(String[] args) {
    Time3 t1 = new Time3();
    Time3 t2 = new Time3(2);
    Time3 t3 = new Time3(21, 34);
    Time3 t4 = new Time3(12, 25, 42);
    Time3 t5 = new Time3(27, 74, 99);
    Time3 t6 = new Time3(t4);

    System.out.println("Constructed with: ");
    System.out.println("t1: all arguments defaulted");
    System.out.printf("   %s\n", t1.toUniversalString());
    System.out.printf("   %s\n", t1.toString());

    System.out.println("t2: hour specified; minute and second defaulted");
    System.out.printf("   %s\n", t2.toUniversalString());
    System.out.printf("   %s\n", t2.toString());

    System.out.println("t3: hour and minute specified; second defaulted");
    System.out.printf("   %s\n", t3.toUniversalString());
    System.out.printf("   %s\n", t3.toString());

    System.out.println("t4: hour, minute, and second specified");
    System.out.printf("   %s\n", t4.toUniversalString());
    System.out.printf("   %s\n", t4.toString());

    System.out.println("t5: all invalid values specified");
    System.out.printf("   %s\n", t5.toUniversalString());
    System.out.printf("   %s\n", t5.toString());

    System.out.println("t6: Time3 object t4 specified");
    System.out.printf("   %s\n", t6.toUniversalString());
    System.out.printf("   %s\n", t6.toString());
  }
}