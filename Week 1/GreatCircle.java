public class GreatCircle 
{
    public static void main(String[] args) 
    {
       
      
      double x1 = Double.parseDouble(args[0]);
      double y1 = Double.parseDouble(args[1]);
      double x2 = Double.parseDouble(args[2]);
      double y2 = Double.parseDouble(args[3]);
      final double r = 6371.0;
      
      // Calculation
      double latDistance = Math.toRadians(x2-x1);
      double lonDistance = Math.toRadians(y2-y1);
      
      double a = Math.sin(latDistance/2) * Math.sin(latDistance/2) + Math.cos(Math.toRadians(x1)) * Math.cos(Math.toRadians(x2)) * Math.sin(lonDistance/2) * Math.sin(lonDistance/2);
      double distance = 2* r * Math.asin(Math.sqrt(a));
      
      // Return Distance 
      System.out.println(distance + " kilometers");
      
      
    }
}
