public class Employee
{
    int id;
    String name;
    Address address;

    public Employee(int id, String name, Address address)
    {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    void display()
    {
        System.out.println(id + " " + name);
        System.out.println(address.city + " " + address.state + " " + address.country);
    }
/*    public static void main(String[] args) {
        Address address1 = new Address("Cumilla,", "Chittagong,", "Bangladesh");
        Address address2 = new Address("Savar,", "Dhaka,", "Bangladesh");

        Employee e1 = new Employee(1, "Shrikanta-", address1);
        Employee e2 = new Employee(2, "Paul-", address2);

        e1.display();
        e2.display();
    }*/
}
