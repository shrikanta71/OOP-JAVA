public class MethodOverLoading
{
    double h, w, l;
    void display(double h, double w, double l)
    {
        System.out.println("Height: " + h + "\nWidth: " + w + "\nLength: " + l);
    }

    static double area(double h, double w)
    {
        return h * w;
    }

    static double area(double h, double w, double l)
    {
        return h * w * l;
    }
}