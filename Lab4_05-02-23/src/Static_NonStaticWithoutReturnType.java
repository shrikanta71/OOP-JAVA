public class Static_NonStaticWithoutReturnType
{
    static void myStatic()
    {
        System.out.println("This is static.");
    }
    void myNonStatic()
    {
        System.out.println("This is Non-Static.");
    }
    public void myPublic()
    {
        System.out.println("This is public.");
    }
    public static void main(String[] args) {

        myStatic();

        Static_NonStaticWithoutReturnType obj = new Static_NonStaticWithoutReturnType();

        obj.myNonStatic();
        obj.myPublic();
    }
}