public class SupportStaff extends Employee {

    private String jobTitle;

    public SupportStaff(String employeeID, String name, double salary, String jobTitle) {

        super(employeeID, name, salary);
        this.jobTitle = jobTitle;

    }

    public String getJobTitle() {
        return jobTitle;
    }

    public String toString() {
        return super.toString() + "\nJob Title: " + getJobTitle();
    }
}
