public class Employee
{
    int id;
    String name;

    public Employee(int a, String nam)
    {
        this.id = a;
        this.name = nam;
    }

    public void info()
    {
        System.out.println("\nName: " + this.name + "\nId: " + this.id);
    }
}
