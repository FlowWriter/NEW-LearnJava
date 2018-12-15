public class CreatingVariables {
  public static void main( String[] args ) {
    int x, y, age, whole;
    double seconds, e, checking, saving;
    String firstName, lastName, middle, title, phrase;

    x = 10;
    y = 400;
    age = 39;
    whole = 5;

    seconds = 4.71;
    e = 2.71828182845904523536;
    checking = 1.89;
    saving = 56335.24;

    firstName = "Graham";
    lastName = "Mitchell";
    middle = "Peter";
    title = "Mr.";
    phrase = "I'm a smarty pants.";

    System.out.println( "The variable x contains " + x + ". It does not contain " + whole);
    System.out.println( "The value " + y + " is stored in the variable y." );
    System.out.println( "The experiment took " + seconds + " seconds." );
    System.out.println( "A favorite irrational # is Euler's number: " + e );
    System.out.println( "Hopefully you have more than $" + checking + "!" );
    System.out.println( "Actually, I have exactly $" + saving + "!" );
    System.out.println( "My name's " + title + " " + firstName + " "+ middle + lastName + ", " + " and I'm " + age + " years old." );
    System.out.println( phrase );
  }
}
