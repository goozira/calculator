import java.util.*;

public class calculator
{
  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);

    add plus = new add();
    subtract sub = new subtract();
    multiply times = new multiply();
    divide cut = new divide();
    exponent num = new exponent();
    int result1, result2;
    double answer1, answer2, total;

    result1 = plus.combine(40, 32);
    result2 = sub.sub(8, 3);
    System.out.println("result1 = " + result1);
    System.out.println("result2 = " + result2);

    answer1 = times.mult(11, 5.23);
    answer2 = cut.div(32, 17);
    total = num.expo(3, 4);
    System.out.println("answer1 = " + answer1);
    System.out.println("answer2 = " + answer2);
    System.out.println("total = " + total);
  }
}
