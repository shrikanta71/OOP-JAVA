import java.util.ArrayList;

public class Employee {

    private String employeeID;
    private String name;
    private double salary;

    public Employee(String employeeID, String name, double salary) {

        this.employeeID = employeeID;
        this.name = name;
        this.salary = salary;

    }

    public String getEmployeeID() {
        return employeeID;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public String toString() {
        return "\nName: " + getName() + "\nEmployee ID: " + getEmployeeID() + "\nSalary: " + getSalary();
    }

    public static double totalSalary(ArrayList<Professor> professors, ArrayList<Administrator> administrators, ArrayList<SupportStaff> supportStaffs) {

        double totalSalary = 0;

        for (Professor professor : professors) {

            totalSalary = totalSalary + professor.getSalary();

        }
        for (Administrator administrator : administrators) {

            totalSalary = totalSalary + administrator.getSalary();

        }
        for (SupportStaff supportStaff : supportStaffs) {

            totalSalary = totalSalary + supportStaff.getSalary();

        }

        return totalSalary;
    }
}











//    public static double totalSalary(ArrayList<Employee> employees) {
//
//        double totalSalary = 0;
//
//        for (Employee employee : employees) {
//
//            totalSalary += employee.getSalary();
//
//        }
//        return totalSalary;
//    }