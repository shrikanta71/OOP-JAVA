public class MyClass
{
    public static void main(String[] args)
    {
        Person obj = new Person("Shrikanta", 25);

        obj.setName("Paul");
        obj.serId(50);

        System.out.println(obj.getName());
        System.out.println(obj.getId());
    }
}
