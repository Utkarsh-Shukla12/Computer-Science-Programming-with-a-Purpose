public class RandomWalker    
{
      
    public static void main(String[] args) 
    {
        int r = Integer.parseInt(args[0]);
        int x = 0;
        int y = 0;
        int steps = 0;
        System.out.println("(0, 0)");
        while(Math.abs(x) + Math.abs(y) != r)
        {
            double walker = Math.random();
            if (walker < 0.25) x++;
            else if (walker < 0.50) x--;
            else if (walker < 0.75) y++;
            else y--;
            steps++;
            System.out.println("(" + x + ", " + y + ")");
        }
        System.out.println("steps = "+steps);
    }
}
