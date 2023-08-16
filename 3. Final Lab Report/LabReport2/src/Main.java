import mypack.Point;
public class Main {

    public static void main(String[] args) {

        Point obj = new Point();
        Point obj2 = new Point(10, 20);

        obj2.setX(100);
        obj2.setY(200);
        obj2.setXY(1000, 2000);
    }
}
