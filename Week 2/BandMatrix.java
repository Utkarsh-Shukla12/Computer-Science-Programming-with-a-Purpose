public class BandMatrix   
{
      
    public static void main(String[] args) 
    {
        int n = Integer.parseInt(args[0]);
        int width = Integer.parseInt(args[1]);
         //  n in this case
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<n; j++)
            {
                if (Math.abs(j-i) > width) System.out.print("0 ");
                else System.out.print("* ");
            }
            System.out.println();
        }
    }
}
