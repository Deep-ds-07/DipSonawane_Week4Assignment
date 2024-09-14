package week4_Q1;
import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentManagment manager = new StudentManagment();
        int choice;

        do {
            System.out.println("Student Management System:");
            System.out.println("1. Add Student");
            System.out.println("2. Remove Student");
            System.out.println("3. Search Student by Roll Number");
            System.out.println("4. Update Student");
            System.out.println("5. Display All Students");
            System.out.println("6. Check if a Student Exists");
            System.out.println("7. Get Total Number of Students");
            System.out.println("8. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter student name: ");
                    String name = scanner.next();
                    System.out.print("Enter roll number: ");
                    int rollNumber = scanner.nextInt();
                    manager.addStudent(name, rollNumber);
                    break;

                case 2:
                    System.out.print("Enter roll number of student to remove: ");
                    int rollToRemove = scanner.nextInt();
                    manager.removeStudent(rollToRemove);
                    break;

                case 3:
                    System.out.print("Enter roll number of student to search: ");
                    int rollToSearch = scanner.nextInt();
                    manager.searchStudent(rollToSearch);
                    break;

                case 4:

					System.out.print("Enter roll number of student to update: ");
					int rollToUpdate = scanner.nextInt();
					System.out.print("Enter new student name: ");
					String newName = scanner.next();
					System.out.print("Enter new roll number: ");
					int newRollNumber = scanner.nextInt();
					manager.updateStudent(rollToUpdate, newName, newRollNumber);
					break;

                case 5:
                    manager.displayStudents();
                    break;

                case 6:
                    System.out.print("Enter roll number to check: ");
                    int rollToCheck = scanner.nextInt();
                    if (manager.studentExists(rollToCheck)) {
                        System.out.println("Student exists.");
                    } else {
                        System.err.println("Student does not exist in our data.");
                    }
                    break;

                case 7:
                    System.out.println("Total number of students: " + manager.getTotalStudents());
                    break;

                case 8:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.err.println("Invalid choice! Please try again.");
            }
        } while (choice != 8);

        scanner.close();
    }
}
