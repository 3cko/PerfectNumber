//import Math;

public class PerfectNumber
{
    
    public static boolean is_prime(int n)
    {
        if (n % 2 == 0) return false;

        for (int i=3; i*i <= n; i+=2)
        {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args)
    {
        double alg = 0;
        int x = 0;

        while (alg <= 10000)
        {
            if (is_prime(x))
            {
                double f = Math.pow(2, (x - 1));
                double e = Math.pow(2, x);
                alg = f * (e - 1);

                if (alg < 10000) System.out.println(Math.round(alg));
            }
            x++;
        }
    }

}
