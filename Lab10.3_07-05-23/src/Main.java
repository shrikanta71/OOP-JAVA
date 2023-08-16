public class Main {

    public static void main(String[] args) {

        Apple a = new Apple("\nRED ");
        System.out.print(a.getColor());
        a.display();

        Banana b = new Banana("\nYELLOW ");
        System.out.print(b.getColor());
        b.display();

        Jackfruit j = new Jackfruit("\nGREEN ");
        System.out.print(j.getColor());
        j.display();
    }
}