public class AreaOfCircle
{
    public double area(double r)
    {
        return 3.1416*r*r;
    }

    public static void main(String[] args)
    {
        AreaOfCircle obj = new AreaOfCircle();

        System.out.println("Area of a Circle is: " + obj.area(3));
    }
}
