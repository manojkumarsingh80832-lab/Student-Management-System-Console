import java.util.InputMismatchException;
public class Main {
    public static void main(String[] args) {
        while (true) {
            // Display menu
            System.out.println("\n===== Student Management System =====");
            System.out.println("1. Add Student");
            System.out.println("2. View All Students");
            System.out.println("3. Search Student");
            System.out.println("4. Update Student");
            System.out.println("5. Delete Student");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            try {
                int choice = StudentService.scanner.nextInt();
                StudentService.scanner.nextLine();
                switch (choice) {
                    case 1:
                        StudentService.addStudent();
                        break;
                    case 2:
                        StudentService.viewAllStudents();
                        break;
                    case 3:
                        StudentService.searchStudent();
                        break;
                    case 4:
                        StudentService.updateStudent();
                        break;
                    case 5:
                        StudentService.deleteStudent();
                        break;
                    case 6:
                        System.out.println("Thank you for using Student Management System!");
                        StudentService.scanner.close();
                        return;
                    default:
                        System.out.println(
                                "Invalid option! Please choose between 1 and 6."
                        );
                }

            } catch (InputMismatchException e) {

                System.out.println(
                        "Invalid input! Please enter a number."
                );

                StudentService.scanner.nextLine();
            }
        }
    }
}


