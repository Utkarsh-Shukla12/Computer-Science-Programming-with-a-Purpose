public class RandomWalkers     
{
      
    public static void main(String[] args) 
    {
        int r = Integer.parseInt(args[0]);
        int trials = Integer.parseInt(args[0]);
        double trail = trials;
        
        double totalSteps = 0;
        //System.out.println("(0, 0)");
        for (int i = 0; i <= trials; i++)
        {
            int steps = 0;
            int x = 0;
            int y = 0;
            while(Math.abs(x) + Math.abs(y) != r)
            {
                double walker = Math.random();
                if (walker < 0.25) x++;
                else if (walker < 0.50) x--;
                else if (walker < 0.75) y++;
                else y--;
                steps++;
                //System.out.println("(" + x + ", " + y + ")");
        }
        totalSteps += steps;
        }
        double total = totalSteps/trail;
        System.out.println("average number of steps = " + total);
    }
}
