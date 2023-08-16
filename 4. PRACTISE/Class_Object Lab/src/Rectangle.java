public class Rectangle {
    public int area(int a, int b) {
        return a * b;

    }

    public static void main(String[] args) {
        Rectangle obj1 = new Rectangle();


        System.out.println(obj1.area(4, 5));
        System.out.println(obj1.area(5, 8));

    }
}
