import java.util.*;

public class calculator
{
  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);

    add plus = new add();
    subtract sub = new subtract();
    int result1, result2;

    result1 = plus.combine(40, 32);
    result2 = sub.sub(8, 3);
    System.out.println("result1 = " + result1);
    System.out.println("result2 = " + result2);
  }
}
