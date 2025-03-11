import java.util.Scanner;

public class UniversityManagement {
    public static void main(String[] args) {

        // Take user input
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Roll Number : ");
        int rollNumber = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter Name : ");
        String name = sc.nextLine();

        System.out.println("Enter CGPA : ");
        double cgpa = sc.nextDouble();

        // Creating a Student object
        Student student = new Student(rollNumber, name, cgpa);

        // Displaying student details
        System.out.println("\n==== Student Details ====");
        student.displayStudentDetails();

        System.out.println("\nEnter Updated CGPA : ");
        double updatedCgpa = sc.nextDouble();
        student.setCGPA(updatedCgpa);

        // Displaying updated student details
        System.out.println("\n==== Updated Student Details ====");
        student.displayStudentDetails();

        sc.nextLine();

        System.out.println("\nEnter Thesis Topic for Postgraduate Student : ");
        String thesisTopic = sc.nextLine();

        // Creating a PostgraduateStudent object
        PostgraduateStudent pgStudent = new PostgraduateStudent(rollNumber, name, updatedCgpa, thesisTopic);

        // Displaying postgraduate student details
        System.out.println("\n==== Postgraduate Student Details ====");
        pgStudent.displayStudentDetails();

        sc.close();
    }
}

class Student {
    public int rollNumber;

    protected String name;

    private double CGPA;

    public Student(int rollNumber, String name, double CGPA) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.CGPA = CGPA;
    }

    public void setCGPA(double CGPA) {
        this.CGPA = CGPA;
    }

    public double getCGPA() {
        return CGPA;
    }

    public void displayStudentDetails() {
        System.out.println("Roll Number : " + rollNumber);
        System.out.println("Name : " + name);
        System.out.println("CGPA : " + CGPA);
    }
}

class PostgraduateStudent extends Student {
    private String thesisTopic;

    public PostgraduateStudent(int rollNumber, String name, double CGPA, String thesisTopic) {
        super(rollNumber, name, CGPA);
        this.thesisTopic = thesisTopic;
    }

    public void displayStudentDetails() {
        super.displayStudentDetails();
        System.out.println("Thesis Topic : " + thesisTopic);
    }
}
