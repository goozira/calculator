import java.util.*;

public class calculator
{
  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);

    operator compute = new operator();
    int result1, result2;
    double answer1, answer2, total;

    result1 = compute.add(40, 32);
    result2 = compute.subtract(8, 3);
    System.out.println("result1 = " + result1);
    System.out.println("result2 = " + result2);

    answer1 = compute.multiply(11, 5.23);
    answer2 = compute.divide(32, 17);
    total = compute.power(3, 4);
    System.out.println("answer1 = " + answer1);
    System.out.println("answer2 = " + answer2);
    System.out.println("total = " + total);
  }
}
