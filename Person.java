import java.util.Scanner;

public class Person {
    public static void main(String[] args) {

        // Taking user input
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Name : ");
        String name = sc.nextLine();

        System.out.println("Enter Age : ");
        int age = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter Address : ");
        String address = sc.nextLine();

        // Creating a Person object with user input
        Person person1 = new Person(name, age, address);

        // Displaying details of the original person
        System.out.println("\nOriginal Person Details:");
        person1.displayPerson();

        // Creating a copy of the original Person object using the copy constructor
        Person person2 = new Person(person1);

        // Displaying details of the copied person
        System.out.println("\nCopied Person Details:");
        person2.displayPerson();

        sc.close();
    }

    // Attributes to store person details
    private String name;
    private int age;
    private String address;

    // Constructor to initialize Person object with user-provided values
    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    // Copy constructor to clone attributes from another Person object
    public Person(Person other) {
        this.name = other.name;
        this.age = other.age;
        this.address = other.address;
    }

    // Method to display person details
    public void displayPerson() {
        System.out.println("==== Person Details ====");
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
        System.out.println("Address : " + address);
    }
}
