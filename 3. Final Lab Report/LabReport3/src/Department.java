
class Department {
    private String name;

    public Department(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}


class Professor {
    private String name;

    public Professor(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}


class Student {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}


class University {
    private String name;
    private Department department;
    private Professor professor;
    private Student student;


    public void setProfessor(Professor professor) {
        this.professor = professor;
    }


    public void setDepartment(Department department) {
        this.department = department;
    }


    public void setStudent(Student student) {
        this.student = student;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void displayUniversityInfo() {

        System.out.println("University: " + name);
        System.out.println("Department: " + department.getName());
        System.out.println("Professor: " + professor.getName());
        System.out.println("Student: " + student.getName());
    }
}


class MainMethod {
    public static void main(String[] args) {

        Department department = new Department("CSE");
        Professor professor = new Professor("XYZ");
        Student student = new Student("Shrikanta Paul");


        University university = new University();
        university.setName("Daffodil International University");


        university.setDepartment(department);
        university.setProfessor(professor);
        university.setStudent(student);


        university.displayUniversityInfo();
    }
}
