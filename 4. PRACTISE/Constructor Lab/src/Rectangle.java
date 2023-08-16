public class Rectangle
{
    int legth;
    int breadth;

    public Rectangle()
    {
        this.legth = 0;
        this.breadth = 0;
    }

    public Rectangle(int a)
    {
        this.legth = a;
        this.breadth = a;
    }

    public Rectangle(int x, int y)
    {
        this.legth = x;
        this.breadth = y;
    }

    public void area()
    {
        System.out.println(legth*breadth);
    }

    public static void main(String[] args)
    {
        Rectangle obj1 = new Rectangle();
        Rectangle obj2 = new Rectangle(5);
        Rectangle obj3 = new Rectangle(5,6);

        obj1.area();
        obj2.area();
        obj3.area();
    }
}
