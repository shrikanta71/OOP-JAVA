public class Static_NonStaticWithReturnType
{
    static int myStatic(int a)
    {
        return a;
    }
    int myNonStatic(int x)
    {
        return x;
    }
    public int myPublic(int m)
    {
        return m;
    }
    public static void main(String[] args) {

        System.out.println("This is from myStatic() return: " + myStatic(1));

        Static_NonStaticWithReturnType obj = new Static_NonStaticWithReturnType();

        System.out.println("This is from myNonStatic return: " + obj.myNonStatic(2));
        System.out.println("This is from myPublic return: " + obj.myPublic(3));
    }
}