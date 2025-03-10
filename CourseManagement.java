import java.util.Scanner;

public class CourseManagement {
    public static void main(String[] args) {


        // Take user input
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Course Name : ");
        String courseName1 = sc.nextLine();

        System.out.println("Enter Duration (in months) : ");
        int duration1 = sc.nextInt();

        System.out.println("Enter Fee : ");
        double fee1 = sc.nextDouble();
        sc.nextLine();

        // Creating first Course object
        Course course1 = new Course(courseName1, duration1, fee1);

        System.out.println("\nEnter Course Name : ");
        String courseName2 = sc.nextLine();

        System.out.println("Enter Duration (in months) : ");
        int duration2 = sc.nextInt();

        System.out.println("Enter Fee : ");
        double fee2 = sc.nextDouble();
        sc.nextLine();

        // Creating second Course object
        Course course2 = new Course(courseName2, duration2, fee2);

        // Displaying course details
        System.out.println("\n==== Course Details ====");
        course1.displayCourseDetails();
        course2.displayCourseDetails();

        // Updating institute name
        System.out.println("\nEnter New Institute Name : ");
        String newInstituteName = sc.nextLine();
        Course.updateInstituteName(newInstituteName);

        // Displaying updated course details
        System.out.println("\n==== Updated Course Details ====");
        course1.displayCourseDetails();
        course2.displayCourseDetails();

        sc.close();
    }
}

// Class to manage courses
class Course {
    private String courseName;
    private int duration;
    private double fee;

    // Class variable shared among all courses
    private static String instituteName = "Tech Academy";

    // Constructor to initialize course details
    public Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    // Method to display course details
    public void displayCourseDetails() {
        System.out.println("==== Course Information ====");
        System.out.println("Course Name : " + courseName);
        System.out.println("Duration : " + duration + " months");
        System.out.println("Fee : $" + fee);
        System.out.println("Institute : " + instituteName);
    }

    // Class method to update institute name
    public static void updateInstituteName(String newInstituteName) {
        instituteName = newInstituteName;
    }
}
