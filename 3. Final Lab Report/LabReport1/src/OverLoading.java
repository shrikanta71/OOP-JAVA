public class OverLoading {

    public void area(int a){
        System.out.println("Area of Square(in int): " + a*a);
    }

    public void area(int a, int b){
        System.out.println("Area of Rectangle: " + a*b);
    }

    public void area(float a){
        System.out.println("Area of Square(in float): " + a*a);
    }

    public static void main(String[] args) {
        OverLoading obj = new OverLoading();

         obj.area(4);
         obj.area(3.3f);
         obj.area(5, 6);
    }
}
