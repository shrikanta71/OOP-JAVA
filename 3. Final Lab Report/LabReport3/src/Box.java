public class Box {

    double length;
    double breadth;
    double height;
    Box(){
        System.out.println("This is Box.");
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setBreadth(double breadth) {
        this.breadth = breadth;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double area(){
        return this.length * this.height;
    }

    public double volume(){
        return this.length * this.breadth * this.height;
    }
}

class Box3d extends Box{
    double length;
    double breadth;
    double height;
    Box3d(double height, double breadth, double length){
        super.setBreadth(breadth);
        super.setHeight(height);
        super.setLength(length);
        System.out.println("This is Box Area: " + super.area());
        System.out.println("This is Box Volume: " + super.volume());

        System.out.println("\nThis is Box3d.");
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setBreadth(double breadth) {
        this.breadth = breadth;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double area(){
        return this.length * this.height;
    }

    public double volume(){
        return this.length * this.breadth * this.height;
    }
}

class Main{
    public static void main(String[] args) {
        Box3d obj = new Box3d(1, 2, 3);

        obj.setLength(10);
        obj.setBreadth(20);
        obj.setHeight(30);
        System.out.println("This is Box3d Area: " + obj.area());
        System.out.println("This is Box3d Volume: " + obj.volume());
    }
}