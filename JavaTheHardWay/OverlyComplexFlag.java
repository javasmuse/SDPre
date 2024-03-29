import static java.lang.System.*;

public class OverlyComplexFlag {
  public static void main( String[] args ) {
    printTopHalf();

    print48Colons();
    print480hs();
    print48Colons();
    print480hs();
    print48Colons();
    print480hs();
    printPledge();
  }

  public static void print48Colons() {
    out.println( "|:::::::::::::::::::::::::::::::::::::::::::::|" );
  }

  public static void print480hs() {
    out.println( "|OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO|");
  }

  public static void print29Colons() {
    out.println( "|:::::::::::::::::::::::::::::::|" );
  }

  public static void printPledge() {
    out.println( "I pledge allegiance to the flag. ");
  }

  public static void print290hs() {
    out.println( "|OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO|" );
  }

  public static void print6Stars() {
    out.print( "| * * * * * * " );
  }

  public static void print5Stars() {
    out.print( "|  * * * * *  " );
  }

  public static void printSixStarLine() {
    print6Stars();
    print290hs();
  }

  public static void printFiveStarLine() {
    print5Stars();
    print29Colons();
  }

  public static void printTopHalf() {
    out.println( " _____________________________________________");
    // the line above ahs 1 space then 48 underscores between the quotes
    printSixStarLine();
    printFiveStarLine();
    printSixStarLine();
    printFiveStarLine();
    printSixStarLine();
    printFiveStarLine();
    printSixStarLine();
  }
}
