import java.util.Scanner;
public class Area
{
    private int length;
    private int breadth;
    public void setDim(int l, int b)
    {
        this.length = l;
        this.breadth = b;
    }

    public int getArea()
    {
        return this.length * this.breadth;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int l = in.nextInt();
        int b = in.nextInt();

        Area obj = new Area();
        obj.setDim(l, b);
        System.out.println(obj.getArea());
    }
}
