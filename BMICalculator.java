import java.util.Scanner;

public class BMICalculator {
  public static void main( String[] args ) {
    Scanner keyboard = new Scanner(System.in);
    double m, kg, bmi, lb, in, totalinches;
    int feet;

    System.out.print( "Your height (feet only): " );
    feet = keyboard.nextInt();
    System.out.print( "Your remaining height in inches: " );
    in = keyboard.nextDouble();

    totalinches = (feet*12) + in;

    System.out.print ( "Your weight in kg: " );
    lb = keyboard.nextDouble();

    m = totalinches * 0.0254;
    kg = lb * 0.453592;

    bmi = kg / (m*m);

    System.out.println( "Your BMI is " + bmi );
  }
}
