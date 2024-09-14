package week4_Q2;
public class MainClass {
    public static void main(String[] args) {
        EmployeeManagement em = new EmployeeManagement();
        int choice;

        do {
            System.out.println("\n--- Employee Management System ---");
            System.out.println("1. Add Employee");
            System.out.println("2. View Employee");
            System.out.println("3. Update Employee");
            System.out.println("4. Remove Employee");
            System.out.println("5. View All Employees");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = em.scanner.nextInt();


            switch (choice) {
                case 1:
                    em.addEmployee();
                    break;
                case 2:
                    em.viewEmployee();
                    break;
                case 3:
                    em.updateEmployee();
                    break;
                case 4:
                    em.removeEmployee();
                    break;
                case 5:
                    em.viewAllEmployees();
                    break;
                case 0:
                    System.out.println("Exiting...");
                    em.closeScanner();
                    break;
                default:
                    System.err.println("Invalid choice. Please try again.");
            }
        } while (choice != 0);
    }
}
