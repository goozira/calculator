public class operator
{
    int add(int firstTerm, int secondTerm)
    {
      return firstTerm + secondTerm;
    }

    int subtract(int firstTerm, int secondTerm)
    {
      return firstTerm - secondTerm;
    }

    double multiply(double firstTerm, double secondTerm)
    {
      return firstTerm * secondTerm;
    }

    double divide(double firstTerm, double secondTerm)
    {
      return firstTerm / secondTerm;
    }

    double power(double value, double power)
    {
      return Math.pow(value, power);
    }

    double root(double firstTerm, double secondTerm)
    {
      // hard to implement right now.  Need some research.
      return 0;
    }
}
