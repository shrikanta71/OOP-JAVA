public class Person {
    String name;
    int age;

    public static void main(String[] args) {
        Person obj1 = new Person();
        Person obj2 = new Person();

        obj1.name = "Shrikanta";
        obj1.age = 21;

        obj2.name = "Paul";
        obj2.age = 22;

        System.out.println("Name: " + obj1.name + " " + obj2.name + "\nAge: " + obj1.age + " " + obj2.age);
    }
}
