import java.util.Scanner;

public class Objective6Lab5 {
  public static void main(String []args ) {
    Scanner scanner = new Scanner(System.in);
    int selection;

    while (true) {
      System.out.println("\n______Menu______");
      System.out.println("1: Say Hello");
      System.out.println("2: List My favorite foods");
      System.out.println("3: Exit");
      System.out.println();
        selection = scanner.nextInt();
        if (selection == 1) {
          System.out.println("\nHello Human\n");
        }
        if (selection == 2) {
          System.out.println("\nTacos, Tamales, Manchengo\n");
        }
        if (selection == 3) {
          System.out.println("\nGoodybye\n");
          break;
        }
    }
  }
}
