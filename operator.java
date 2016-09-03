public class operator
{
    double add(double firstTerm, double secondTerm)
    {
      return firstTerm + secondTerm;
    }

    double subtract(double firstTerm, double secondTerm)
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
