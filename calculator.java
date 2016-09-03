import java.util.*;

public class calculator
{
/*  private double[] getInput()
  {
    double[] input = new double[2];
    Scanner scan = new Scanner(System.in);
    while()
  }
  */
  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);
    double first, second;
    operator compute = new operator();

    System.out.println("Please enter two numbers to add:");
    first = scan.nextDouble();
    second = scan.nextDouble();
    System.out.println(first + " + " + second + " = " + compute.add(first, second));
  }
}
