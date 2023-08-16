public class Professor extends Employee {

    private String subjectOfExpertise;

    public Professor(String employeeID, String name, double salary, String subjectOfExpertise) {

        super(employeeID, name, salary);
        this.subjectOfExpertise = subjectOfExpertise;

    }

    public String getSubjectOfExpertise() {
        return subjectOfExpertise;
    }

    public String toString() {
        return super.toString() + "\nSubject of Expertise: " + getSubjectOfExpertise();
    }
}
