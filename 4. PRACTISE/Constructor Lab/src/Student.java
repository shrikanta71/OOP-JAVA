public class Student
{
    String name;

    public Student()
    {
        this.name = "Unknown";
        //System.out.println(name);
    }

    public Student(String nam)
    {
        this.name = nam;
        //System.out.println(name);
    }

    public static void main(String[] args)
    {
        Student obj1 = new Student();
        Student obj2 = new Student("Shrikanta");

        System.out.println(obj1.name);
        System.out.println(obj2.name);
    }
}
