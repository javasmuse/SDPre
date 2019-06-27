import java.util.Scanner;

public class AgeMessages {
	public static void main( String[] args ) {
		Scanner keyboard = new Scanner(System.in);
		int age;

		System.out.print( "How old are you? " );
		age = keyboard.nextInt();

		System.out.println( "You are: " );
			if ( age < 13 ) {
				System.out.println( "\ttoo young to create a Facebook account" );
			}
			if ( age > 13 ) {
				System.out.println( "\told enough to create a Facebook account" );
			}
			if ( age < 16 ) {
				System.out.println( "\ttoo young to get a drivers license" );
			}
			if (age > 16 ) {
				System.out.println( "\told enough to drive a car" );
			}
			if ( age < 18 ) {
				System.out.println( "\ttoo young to get a tatoo" );
			}
			if (age > 18 ) {
				System.out.println( "\told enough to vote" );
			}
			if ( age < 21 ) {
				System.out.println( "\ttoo young to drink alcohol" );
			}
			if (age > 21 ) {
				System.out.println( "\told enough for a beer" );
			}
			if ( age < 35 ) {
				System.out.println( "\ttoo young to run for President of the U.S." );
			}
			if ( age == 46 ) {
				System.out.println( "\tyou found the perfect age" );
			}
			if ( age < 60 ) {
				System.out.println( "\ttoo young to collect Reserve Retirement" );
				System.out.println( "\t\t(How sad!)" );
			}
		}
	}
			
