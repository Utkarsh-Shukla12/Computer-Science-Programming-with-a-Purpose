public class RightTriangle  
{
    public static void main(String[] args) 
    {
      long a = Long.parseLong(args[0]);
      long b = Long.parseLong(args[1]);
      long c = Long.parseLong(args[2]);
      // Check for positive and Pythagorus Theorum if 
     boolean isNegative = ( a > 0 && b > 0 && c > 0);
     boolean rightTriangle =  ((a * a ) + (b * b) == (c * c) || (a * a ) + (c * c) == (b * b) || (c * c ) + (b * b) == (a * a));
	 System.out.println(isNegative && rightTriangle);
    }
}
