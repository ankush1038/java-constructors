import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {

        Scanner sc = new java.util.Scanner(System.in);

        System.out.println("Enter Radius : ");
        double radius = sc.nextDouble();

        // Creating a Circle object using the parameterized constructor
        Circle circle1 = new Circle(radius);

        // Displaying circle details
        circle1.displayCircle();

        // Creating a Circle object using the default constructor
        Circle circle2 = new Circle();
        System.out.println("\nDefault Circle Details:");

        // Displaying default circle details
        circle2.displayCircle();

        sc.close();
    }

    // Attribute to store radius
    private double radius;

    // Default constructor initializing radius to a default value
    public Circle() {
        this(1.0);
    }

    // Parameterized constructor to initialize radius with a user-provided value
    public Circle(double radius) {
        this.radius = radius;
    }

    // Method to display circle details
    public void displayCircle() {
        System.out.println("==== Circle Details ====");
        System.out.println("Radius : " + radius);
    }
}
