public class Car {
    public String model;

    public Car(){
        System.out.println("Hello.");
    }

    public void display(){
        System.out.println(this.model);
    }
}

class BMW extends Car{

    public BMW(){
        super();
        super.model = "BMW";
        super.display();
    }
    public static void main(String[] args) {
        BMW obj = new BMW();
    }
}
