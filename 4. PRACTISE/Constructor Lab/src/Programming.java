public class Programming
{

    String pass;

    public Programming()
    {
        this.pass = "I love programming languages";
        //System.out.println(pass);
    }

    public Programming(String passed)
    {
        this.pass = passed;
        //System.out.println("I love " + pass);
    }

    public static void main(String[] args)
    {
        Programming obj1 = new Programming();
        Programming obj2 = new Programming("Java");

        System.out.println(obj1.pass);
        System.out.println("I love " + obj2.pass);
    }
}
