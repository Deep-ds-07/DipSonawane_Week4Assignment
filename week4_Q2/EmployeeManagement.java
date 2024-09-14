package week4_Q2;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class EmployeeManagement {
    private Map<Integer, Employee> employeeMap;
    Scanner scanner;

    public EmployeeManagement() {
        employeeMap = new HashMap<>();
        scanner = new Scanner(System.in);
        // Demo Employee
//        employeeMap.put(101, new Employee("Dhanshri", "HR", 25000));
//        employeeMap.put(102, new Employee("Pratik", "IT Counsular", 35000));
//        employeeMap.put(103, new Employee("Datta", "Devloper", 65000));
    }

    public void addEmployee() {
        System.out.print("Enter Employee ID: ");
        int id = scanner.nextInt();
        scanner.nextLine(); 

        if (employeeMap.containsKey(id)) {
            System.err.println("Employee ID already exists.");
            return;
        }

        System.out.print("Enter Employee Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Department: ");
        String department = scanner.nextLine();
        System.out.print("Enter Salary: ");
        double salary = scanner.nextDouble();

        employeeMap.put(id, new Employee(name, department, salary));
        System.out.println("Employee added successfully.");
    }

    public void viewEmployee() {
        System.out.print("Enter Employee ID: ");
        int id = scanner.nextInt();

        Employee emp = employeeMap.get(id);
        if (emp != null) {
            System.out.println("00Employee Details: " + emp);
        } else {
            System.err.println("Employee ID not found in our Group.");
        }
    }

    public void updateEmployee() {
        System.out.print("Enter Employee ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();  // Consume newline

        Employee emp = employeeMap.get(id);
        if (emp != null) {
            System.out.print("Enter new Name : ");
            String name = scanner.nextLine();
            System.out.print("Enter new Department: ");
            String department = scanner.nextLine();
            System.out.print("Enter new Salary: ");
            double salary = scanner.nextDouble();

            emp.setName(name);
            emp.setDepartment(department);
            emp.setSalary(salary);

            System.out.println("Employee details updated successfully.");
        } else {
            System.out.println("Employee ID not found In our Data.");
        }
    }

    public void removeEmployee() {
        System.out.print("Enter Employee ID: ");
        int id = scanner.nextInt();

        if (employeeMap.containsKey(id)) {
            employeeMap.remove(id);
            System.out.println("Employee removed successfully.");
        } else {
            System.err.println("Employee ID not found In List.");
        }
    }

    public void viewAllEmployees() {
        if (employeeMap.isEmpty()) {
            System.out.println("No employees to display.");
        } else {
            System.out.println("Employee List:");
            for (Map.Entry<Integer, Employee> entry : employeeMap.entrySet()) {
                System.out.println("ID: " + entry.getKey() + " - " + entry.getValue());
            }
        }
    }

	public void closeScanner() {
		scanner.close();
		
	}

}
