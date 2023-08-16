public class MaxOverLoading
{
    public int maximum(int a, int b)
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

    public int maximum(int x, int y, int z)
    {
        if(x>y && x>z)
        {
            return x;
        }
        else if(y>x && y>z)
        {
            return y;
        }
        else
        {
            return z;
        }
    }

    public double maximum(double m, double n)
    {
        if(m>n)
        {
            return m;
        }
        else
        {
            return n;
        }
    }

    public static void main(String[] args)
    {
        MaxOverLoading obj = new MaxOverLoading();

        System.out.println("Two Integer: " + obj.maximum(10, 20));
        System.out.println("Three Integer: " + obj.maximum(10, 20, 30));
        System.out.println("Two Double: " + obj.maximum(10, 20.0));

    }
}
