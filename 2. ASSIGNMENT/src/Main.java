import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Professor> professors = new ArrayList<Professor>();
        ArrayList<Administrator> administrators = new ArrayList<Administrator>();
        ArrayList<SupportStaff> supportStaffs = new ArrayList<SupportStaff>();

        System.out.println("\nDo you want to enter Employee Details?(y/n or Y/N)");

        char press = sc.next().charAt(0);

        while (press == 'y' || press == 'Y') {

            System.out.println("\nWhat type of Employee's Details do you want to enter?\n");

            System.out.println("Enter p/P for PROFESSOR.");
            System.out.println("Enter a/A for ADMINISTRATOR.");
            System.out.println("Enter s/S for SUPPORT STAFF.");
            System.out.println("Enter d/D to show the EMPLOYEE DETAILS.");

            char employee = sc.next().charAt(0);

            if (employee == 'p' || employee == 'P') {

                System.out.println("ENTER PROFESSOR DETAILS: (ID, Name, Salary, Subject of Expertise)");

                sc.nextLine();
                String professorID = sc.nextLine();
                String professorName = sc.nextLine();
                double professorSalary = sc.nextDouble();
                sc.nextLine();
                String professorSubject = sc.nextLine();

                Professor professor = new Professor(professorID, professorName, professorSalary, professorSubject);
                professors.add(professor);

            } else if (employee == 'a' || employee == 'A') {

                System.out.println("ENTER ADMINISTRATOR DETAILS: (ID, Name, Salary, Department)");

                sc.nextLine();
                String adminID = sc.nextLine();
                String adminName = sc.nextLine();
                double adminSalary = sc.nextDouble();
                sc.nextLine();
                String adminDept = sc.nextLine();

                Administrator admin = new Administrator(adminID, adminName, adminSalary, adminDept);
                administrators.add(admin);

            } else if (employee == 's' || employee == 'S') {

                System.out.println("ENTER SUPPORT STAFF DETAILS: (ID, Name, Salary, Job Title)");

                sc.nextLine();
                String staffID = sc.nextLine();
                String staffName = sc.nextLine();
                double staffSalary = sc.nextDouble();
                sc.nextLine();
                String staffTitle = sc.nextLine();

                SupportStaff staff = new SupportStaff(staffID, staffName, staffSalary, staffTitle);
                supportStaffs.add(staff);

            } else if (employee == 'd' || employee == 'D') {

                System.out.println("\n\nEMPLOYEE DETAILS:");

                System.out.println("\n\n***PROFESSOR'S DETAILS***");
                int professorNo = 0;
                for (Professor professor : professors) {
                    professorNo++;
                    System.out.print("\nProfessor Number: " + professorNo);
                    System.out.println(professor.toString());
                }

                System.out.println("\n\n***ADMINISTRATOR'S DETAILS***");
                int administratorNo = 0;
                for (Administrator administrator : administrators) {
                    administratorNo++;
                    System.out.print("\nAdministrator Number: " + administratorNo);
                    System.out.println(administrator.toString());
                }

                System.out.println("\n\n***SUPPORT STAFF'S DETAILS***");
                int supportStaffNo = 0;
                for (SupportStaff supportStaff : supportStaffs) {
                    supportStaffNo++;
                    System.out.print("\nSupport Stuff Number: " + supportStaffNo);
                    System.out.println(supportStaff.toString());
                }

                break;

            } else {
                System.out.println("Enter valid choice.\n");
            }
        }

        if (press == 'n' || press == 'N') {

            System.out.println("\nThere is no Employees details found.\n");
        }

        // Calculate total salary
        System.out.println("\n\n\n***TOTAL SALARY***\n" + Employee.totalSalary(professors, administrators, supportStaffs));

    }
}






/*
import java.util.ArrayList;
        import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Employee> employees = new ArrayList<Employee>();

        System.out.println("\nDo you want to enter Employee Details?(y/n or Y/N)");

        char press = sc.next().charAt(0);

        while (press == 'y' || press == 'Y') {

            System.out.println("\nWhat type of Employee's Details do you want to enter?\n");

            System.out.println("Enter p/P for PROFESSOR.");
            System.out.println("Enter a/A for ADMINISTRATOR.");
            System.out.println("Enter s/S for SUPPORT STAFF.");
            System.out.println("Enter d/D to show the EMPLOYEE DETAILS.");

            char employee = sc.next().charAt(0);

            if (employee == 'p' || employee == 'P') {

                System.out.println("ENTER PROFESSOR DETAILS: (ID, Name, Salary, Subject of Expertise)");

                sc.nextLine();
                String professorID = sc.nextLine();
                String professorName = sc.nextLine();
                double professorSalary = sc.nextDouble();
                sc.nextLine();
                String professorSubject = sc.nextLine();

                Professor professor = new Professor(professorID, professorName, professorSalary, professorSubject);
                employees.add(professor);

            } else if (employee == 'a' || employee == 'A') {

                System.out.println("ENTER ADMINISTRATOR DETAILS: (ID, Name, Salary, Department)");

                sc.nextLine();
                String adminID = sc.nextLine();
                String adminName = sc.nextLine();
                double adminSalary = sc.nextDouble();
                sc.nextLine();
                String adminDept = sc.nextLine();

                Administrator admin = new Administrator(adminID, adminName, adminSalary, adminDept);
                employees.add(admin);

            } else if (employee == 's' || employee == 'S') {

                System.out.println("ENTER SUPPORT STAFF DETAILS: (ID, Name, Salary, Job Title)");

                sc.nextLine();
                String staffID = sc.nextLine();
                String staffName = sc.nextLine();
                double staffSalary = sc.nextDouble();
                sc.nextLine();
                String staffTitle = sc.nextLine();

                SupportStaff staff = new SupportStaff(staffID, staffName, staffSalary, staffTitle);
                employees.add(staff);

            } else if (employee == 'd' || employee == 'D') {

                System.out.println("\n\nEMPLOYEE DETAILS:");

                for (int i = 0; i < employees.size(); i++) {

                    System.out.println(employees.toString());

                }
                break;

            } else {
                System.out.println("Enter valid choice.\n");
            }
        }

        if (press == 'n' || press == 'N') {

            System.out.println("\nEmployee details:\n");

            for (int i = 0; i < employees.size(); i++) {

                System.out.println(employees.toString());

            }
        }

        // Calculate total salary
        System.out.println("\n\n\n***TOTAL SALARY***\n" + Employee.totalSalary(employees));

    }
}
*/


/*
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

// Professor's Details
        System.out.println("\n***Enter Professor's Details***");
        System.out.print("Name: ");
        String pName = sc.nextLine();

        System.out.print("ID: ");
        String pId = sc.nextLine();

        System.out.print("Salary: ");
        double pSalary = sc.nextDouble();

        sc.nextLine();
        System.out.print("Subject of Expertise: ");
        String subjectOfExpertise = sc.nextLine();

// Administrator's Details
        System.out.println("\n***Enter Administrator's Details***");
        System.out.print("Name: ");
        String aName = sc.nextLine();

        System.out.print("ID: ");
        String aId = sc.nextLine();

        System.out.print("Salary: ");
        double aSalary = sc.nextDouble();

        sc.nextLine();
        System.out.print("Department: ");
        String department = sc.nextLine();

// Support Staff's Details
        System.out.println("\n***Enter Support Staff's Details***");
        System.out.print("Name: ");
        String sName = sc.nextLine();

        System.out.print("ID: ");
        String sId = sc.nextLine();

        System.out.print("Salary: ");
        double sSalary = sc.nextDouble();

        sc.nextLine();
        System.out.print("Job Type Name: ");
        String jobTitle = sc.nextLine();

        Employee[] employees = new Employee[3];

        employees[0] = new Professor(pId, pName, pSalary, subjectOfExpertise );
        employees[1] = new Administrator(aId, aName, aSalary, department);
        employees[2] = new SupportStaff(sId, sName, sSalary, jobTitle);

        for (Employee employee : employees) {
            System.out.println(employee);
        }

        System.out.println("\n\n\n***TOTAL SALARY***\n" + Employee.totalSalary(employees));



    }
}
*/









/*
                Employee[] employees = new Employee[3];

                employees[0] = new Professor("15-52", "Md. Khalilur Rahaman", 35000, "Java Language");
                employees[1] = new Administrator("01-32", "Mowsumi AKtar", 25000, "CSE");
                employees[2] = new SupportStaff("100-12", "Shrikanta Paul", 20000, "IT Support");

                for (Employee employee : employees) {
                System.out.println(employee);
                }

                System.out.println("\n\n\nTotal Salary: " + Employee.totalSalary(employees));
*/








/*
                Professor pro = new Professor("15-52", "Md. Khalilur Rahaman", 35000, "Java Language");
                System.out.println("\n***Professor's Details***");
                System.out.println(pro);

                Administrator adm = new Administrator("01-32", "Mowsumi AKtar", 25000, "CSE");
                System.out.println("\n\n***Administrator's Details***");
                System.out.println(adm);

                SupportStaff supp = new SupportStaff("100-12", "Shrikanta Paul", 20000, "IT Support");
                System.out.println("\n\n***Support Staff's Details***");
                System.out.println(supp);
*/








/*
    Scanner sc = new Scanner(System.in);

// Professor's Details
        System.out.println("\n***Enter Professor's Details***");
                System.out.print("Enter Professor's Name: ");
                String pName = sc.nextLine();

                System.out.print("Enter Professor's ID: ");
                String pId = sc.nextLine();

                System.out.print("Enter Professor's Salary: ");
                double pSalary = sc.nextDouble();

                sc.nextLine();
                System.out.print("Enter Professor's Subject of Expertise: ");
                String subjectOfExpertise = sc.nextLine();

// Administrator's Details
                System.out.println("\n***Enter Administrator's Details***");
                System.out.print("Enter Administrator's Name: ");
                String aName = sc.nextLine();

                System.out.print("Enter Administrator's ID: ");
                String aId = sc.nextLine();

                System.out.print("Enter Administrator's Salary: ");
                double aSalary = sc.nextDouble();

                sc.nextLine();
                System.out.print("Enter Administrator's Department: ");
                String department = sc.nextLine();

// Support Staff's Details
                System.out.println("\n***Enter Support Staff's Details***");
                System.out.print("Enter Support Staff's Name: ");
                String sName = sc.nextLine();

                System.out.print("Enter Support Staff's ID: ");
                String sId = sc.nextLine();

                System.out.print("Enter Support Staff's Salary: ");
                double sSalary = sc.nextDouble();

                sc.nextLine();
                System.out.print("Enter Support Staff's Job Type name: ");
                String jobTitle = sc.nextLine();

                Employee[] employees = new Employee[3];

                employees[0] = new Professor(pId, pName, pSalary, subjectOfExpertise );
                employees[1] = new Administrator(aId, aName, aSalary, department);
                employees[2] = new SupportStaff(sId, sName, sSalary, jobTitle);

                for (Employee employee : employees) {
                System.out.println(employee);
                }

                System.out.println("\n\n\nTotal Salary: " + Employee.totalSalary(employees));
*/
