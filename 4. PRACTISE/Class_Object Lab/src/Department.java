public class Department
{
    private String deptName;
    private int deptCode;
    private String faculty;

    public static void main(String[] args) {
        Department obj1 = new Department();
        Department obj2 = new Department();

        obj1.deptName = "CSE";
        obj1.deptCode = 15;
        obj1.faculty = "FSIT";
        System.out.println("Department: " + obj1.deptName + "\t\tCode: " + obj1.deptCode + "\tFaculty: " + obj1.faculty);

        obj2.deptName = "EEE";
        obj2.deptCode = 16;
        obj2.faculty = "FSIT";
        System.out.println("Department: " + obj2.deptName + "\t\tCode: " + obj2.deptCode + "\tFaculty: " + obj2.faculty);

    }
}
