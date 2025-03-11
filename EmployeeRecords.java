import java.util.Scanner;

public class EmployeeRecords {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Employee ID : ");
        int employeeID = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter Department : ");
        String department = sc.nextLine();

        System.out.println("Enter Salary : ");
        double salary = sc.nextDouble();

        // Creating an Employee object
        Employee employee = new Employee(employeeID, department, salary);

        // Displaying employee details
        System.out.println("\n==== Employee Details ====");
        employee.displayEmployeeDetails();

        System.out.println("\nEnter New Salary : ");
        double newSalary = sc.nextDouble();
        employee.setSalary(newSalary);

        // Creating a Manager object
        Manager manager = new Manager(employeeID, department, newSalary);

        // Displaying Manager details
        System.out.println("\n==== Manager Details ====");
        manager.displayManagerDetails();

        sc.close();
    }
}

class Employee {
    public int employeeID;

    protected String department;

    private double salary;

    public Employee(int employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    public void setSalary(double newSalary) {
        salary = newSalary;
        System.out.println("Salary Updated. New Salary : " + salary);
    }

    public double getSalary() {
        return salary;
    }

    public void displayEmployeeDetails() {
        System.out.println("Employee ID : " + employeeID);
        System.out.println("Department : " + department);
        System.out.println("Salary : " + salary);
    }
}

class Manager extends Employee {
    public Manager(int employeeID, String department, double salary) {
        super(employeeID, department, salary);
    }

    public void displayManagerDetails() {
        System.out.println("Employee ID : " + employeeID);
        System.out.println("Department : " + department);
    }
}
