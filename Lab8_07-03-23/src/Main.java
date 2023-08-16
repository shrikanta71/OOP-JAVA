public class Main {
    public static void main(String[] args) {
        //Address.java and Employee.java
        System.out.println("This output is the code from javapoint website.");
        Address address1 = new Address("Cumilla,", "Chittagong,", "Bangladesh");
        Address address2 = new Address("Savar,", "Dhaka,", "Bangladesh");

        Employee e1 = new Employee(1, "Shrikanta-", address1);
        Employee e2 = new Employee(2, "Paul-", address2);

        e1.display();
        e2.display();


        //InsuranceInfo.java, AddressInfo.java and Employee2.java
        System.out.println("\n\nThis output is the code from 1st Exercise on aggregation.");
        AddressInfo add1 = new AddressInfo("1025-A,", "Savar,", "Dhaka,", "3605");

        InsuranceInfo insurance1 =  new InsuranceInfo("Health-", 23);

        Employee2 e = new Employee2("Shrikanta", insurance1, add1);

        e.dispaly();


        //Engine.java, DashBoard.java, Car.java and Volvo.java
        System.out.println("\n\nThis output is the code from 2nd Exercise on aggregation.");
        Engine engine1 = new Engine(4500);
        DashBoard dashBoard1 = new DashBoard(20);

        Volvo v1 = new Volvo(20000, "1995", "B25W9", engine1, dashBoard1);

        v1.drive();
        v1.stop();
        v1.changeFuel();
        v1.checkBattery();

        v1.model = "B24";
        v1.company = "Volvo";
    }
}