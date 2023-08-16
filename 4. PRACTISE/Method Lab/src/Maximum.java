public class Maximum
{
    public static double maxValue(double a, double b)
    {
        if(a>b)
        {
            return a;
        }

        else
        {
            return b;
        }
    }

    public static void main(String[] args)
    {
        System.out.println(maxValue(10,20));
    }
}
