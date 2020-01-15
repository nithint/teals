package app;

public class GreatestCommonDivisor
{
    public static void main(String[] args)
    {
        System.out.println(Greatest(-34, 12));
    }

    public static int Greatest(int a, int b)
    {
        while (b != 0)
        {
            int gcd = a % b;
            a = b;
            b = gcd;
        }

        if (a == 0)
        {
            return Math.abs(b);
        }
        else
        {
            return Math.abs(a);
        }
    }
}

