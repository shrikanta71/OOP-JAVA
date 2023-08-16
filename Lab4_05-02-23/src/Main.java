public class Main
{
    public static void main(String[] args)
    {

        MethodOverLoading obj = new MethodOverLoading();

        obj.h = 10.0;
        obj.w = 20.0;
        obj.l = 30.0;

        obj.display(obj.h, obj.w, obj.l);

        System.out.println("\nArea: " + obj.area(obj.h , obj.w));

        System.out.println("\nVolume: " + obj.area(obj.h, obj.w, obj.l));

    }
}
