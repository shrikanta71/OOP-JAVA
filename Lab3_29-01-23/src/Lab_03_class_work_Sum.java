public class Lab_03_class_work_Sum
{
    int x = 5;

    void sum()
    {
        x = x + 5;
        System.out.println("This value is from sum() method: " + x);
    }

    void display()
    {
        System.out.println("This value is form display() method: " + x);
    }

    public static void main(String[] args)
    {
        Lab_03_class_work_Sum obj = new Lab_03_class_work_Sum();

        System.out.println("This value is from main() method: " + obj.x);

        obj.sum();
        obj.display();

        //The below code is to make object for Lab_03_class_work_Student class and call the method from main() method.

        System.out.println("\n\nThis is from Lab_03_class_work_Student class.");

        Lab_03_class_work_Student obj1 = new Lab_03_class_work_Student();

        obj1.name = "Shrikanta Paul";
        obj1.age = 21;
        obj1.cgpa = 3.2f;

        obj1.display();
    }
}