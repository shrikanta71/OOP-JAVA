public class Average {
    int a, b, c;

    public void avg(int a, int b, int c) {
        System.out.println("The average of three number is: " + (a + b + c) / 3);
    }

    public static void main(String[] args) {
        Average obj = new Average();

        obj.a = 3;
        obj.b = 4;
        obj.c = 8;

        obj.avg(obj.a, obj.b, obj.c);
    }
}
