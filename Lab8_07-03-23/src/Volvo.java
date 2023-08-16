public class Volvo extends Car
{
    private double price;
    private String productionYear;
    private String registrationNumber;

    Engine engine;
    DashBoard dashBoard;

    public Volvo(double price, String productionYear, String registrationNumber, Engine engine, DashBoard dashBoard)
    {
        this.price = price;
        this.productionYear = productionYear;
        this.registrationNumber = registrationNumber;
        this.engine = engine;
        this.dashBoard = dashBoard;
    }

    public void changeFuel()
    {
        System.out.println("Change the fuel of the car.");
    }

    public void checkBattery()
    {
        System.out.println("Check the Battery.");
    }

    public void drive()
    {
        System.out.println("Drive the car.");
    }

    public void stop()
    {
        System.out.println("Stop the car.");
    }

/*    public static void main(String[] args) {
        Engine engine1 = new Engine(4500);
        DashBoard dashBoard = new DashBoard(20);

        Volvo v1 = new Volvo(20000, "1995", "B25W9", engine1, dashBoard);

        v1.drive();
        v1.stop();
        v1.changeFuel();
        v1.checkBattery();

        v1.model = "B24";
        v1.company = "Volvo";
    }*/
}
