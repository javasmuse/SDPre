import java.util.Scanner;

public class EnterPin {
	public static void main( String[] args ) {
		Scanner keyboard = new Scanner(System.in);
		int pin, entry, account;

		pin = 12345;

		System.out.println(" ");
		System.out.println("WELCOME TO THE BANK OF JAVA.");
		System.out.print("ENTER YOUR PIN: ");
		entry = keyboard.nextInt();

		while ( entry != pin ) {
		System.out.println("\nINCORRECT PIN. TRY AGAIN. ");
			System.out.print("ENTER YOUR PIN: ");
			entry = keyboard.nextInt();
		}
		account = 0 + (int)( 50000*Math.random() );
		System.out.println("\nPIN ACCEPTED. YOUR ACOUNT BALANCE IS $" + account );
		System.out.println(" ");
	}
}
