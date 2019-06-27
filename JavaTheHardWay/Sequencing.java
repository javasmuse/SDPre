import java.util.Scanner;

public class Sequencing {
  public static void main( String[] args) {

    Scanner keyboard = new Scanner(System.in);
    double price, salesTax, total;

    salesTax = 0.0825;
    /* broken until fixed, because variables in Java can't hold formulas - fixed by place the formula after the input and just before the output - it works */
    

    System.out.println("How much is the purchase price?");
    price = keyboard.nextDouble();

    System.out.println("Item price:\t" + price);
    salesTax = price*salesTax;
    System.out.println("Sales tax:\t" + salesTax);
    total = salesTax + price;
    System.out.println("Total cost:\t" + total);

  }
}
