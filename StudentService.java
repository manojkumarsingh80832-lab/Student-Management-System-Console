
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class StudentService {

    static List<Student> studentList = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    // 1. Add Student
    public static void addStudent() {

        try {
            System.out.print("Enter Roll No: ");
            int rollNo = scanner.nextInt();
            scanner.nextLine();

            // Validate roll number
            if (rollNo <= 0) {
                System.out.println("Roll No must be greater than 0.");
                return;
            }

            // Check duplicate roll number
            for (Student student : studentList) {
                if (student.rollNo == rollNo) {
                    System.out.println("Roll No already exists.");
                    return;
                }
            }

            System.out.print("Enter Name: ");
            String name = scanner.nextLine();

            if (name.trim().isEmpty()) {
                System.out.println("Name cannot be empty.");
                return;
            }

            System.out.print("Enter Course: ");
            String course = scanner.nextLine();

            if (course.trim().isEmpty()) {
                System.out.println("Course cannot be empty.");
                return;
            }

            System.out.print("Enter Marks: ");
            double marks = scanner.nextDouble();
            scanner.nextLine();

            // Validate marks
            if (marks < 0 || marks > 100) {
                System.out.println("Marks must be between 0 and 100.");
                return;
            }

            studentList.add(
                    new Student(rollNo, name, course, marks)
            );

            System.out.println("Student added successfully!");

        } catch (InputMismatchException e) {

            System.out.println("Invalid input! Please enter correct data.");
            scanner.nextLine();
        }
    }


    // 2. View All Students
    public static void viewAllStudents() {

        if (studentList.isEmpty()) {
            System.out.println("No student record found.");
            return;
        }

        System.out.println("\n--- Student List ---");

        for (Student student : studentList) {
            System.out.println(student);
        }
    }


    // 3. Search Student
    public static void searchStudent() {

        try {
            System.out.print("Enter Roll No to search: ");
            int rollNo = scanner.nextInt();
            scanner.nextLine();

            for (Student student : studentList) {

                if (student.rollNo == rollNo) {
                    System.out.println("Record Found:");
                    System.out.println(student);
                    return;
                }
            }

            System.out.println(
                    "Student with Roll No " + rollNo + " not found."
            );

        } catch (InputMismatchException e) {

            System.out.println("Invalid Roll No.");
            scanner.nextLine();
        }
    }


    // 4. Update Student
    public static void updateStudent() {

        try {
            System.out.print("Enter Roll No to update: ");
            int rollNo = scanner.nextInt();
            scanner.nextLine();

            for (Student student : studentList) {

                if (student.rollNo == rollNo) {

                    System.out.print("Enter New Name: ");
                    String name = scanner.nextLine();

                    if (name.trim().isEmpty()) {
                        System.out.println("Name cannot be empty.");
                        return;
                    }

                    System.out.print("Enter New Course: ");
                    String course = scanner.nextLine();

                    if (course.trim().isEmpty()) {
                        System.out.println("Course cannot be empty.");
                        return;
                    }

                    System.out.print("Enter New Marks: ");
                    double marks = scanner.nextDouble();
                    scanner.nextLine();

                    if (marks < 0 || marks > 100) {
                        System.out.println(
                                "Marks must be between 0 and 100."
                        );
                        return;
                    }

                    student.name = name;
                    student.course = course;
                    student.marks = marks;

                    System.out.println(
                            "Student details updated successfully!"
                    );

                    return;
                }
            }

            System.out.println(
                    "Student with Roll No " + rollNo + " not found."
            );

        } catch (InputMismatchException e) {

            System.out.println("Invalid input!");
            scanner.nextLine();
        }
    }


    // 5. Delete Student
    public static void deleteStudent() {

        try {
            System.out.print("Enter Roll No to delete: ");
            int rollNo = scanner.nextInt();
            scanner.nextLine();

            for (int i = 0; i < studentList.size(); i++) {

                if (studentList.get(i).rollNo == rollNo) {

                    studentList.remove(i);

                    System.out.println(
                            "Student removed successfully!"
                    );

                    return;
                }
            }

            System.out.println(
                    "Student with Roll No " + rollNo + " not found."
            );

        } catch (InputMismatchException e) {

            System.out.println("Invalid Roll No.");
            scanner.nextLine();
        }
    }
}
