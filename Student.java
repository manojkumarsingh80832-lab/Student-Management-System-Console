
public class Student {

    // Student data
    int rollNo;
    String name;
    String course;
    double marks;

    // Constructor
    Student(int rollNo, String name, String course, double marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.course = course;
        this.marks = marks;
    }

    // Display student details
    @Override
    public String toString() {
        return rollNo + " | " + name + " | " + course + " | " + marks;
    }
}
