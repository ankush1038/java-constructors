import java.util.Scanner;

public class LibraryBookSystem {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Book Title : ");
        String title = sc.nextLine();

        System.out.println("Enter Author Name : ");
        String author = sc.nextLine();

        System.out.println("Enter Price : ");
        double price = sc.nextDouble();
        sc.nextLine();

        // Creating a LibraryBook object
        LibraryBook book = new LibraryBook(title, author, price);

        // Displaying book details
        System.out.println("\nBook Details:");
        book.displayBook();

        // Borrowing the book
        System.out.println("\nAttempting to Borrow the Book...");
        book.borrowBook();

        // Trying to borrow again
        System.out.println("\nAttempting to Borrow the Book Again...");
        book.borrowBook();

        sc.close();
    }
}

// Class to represent a book in the library
class LibraryBook {
    private String title;
    private String author;
    private double price;
    private boolean isAvailable;

    // Constructor to initialize book details
    public LibraryBook(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.isAvailable = true;
    }

    // Method to display book details
    public void displayBook() {
        System.out.println("==== Book Details ====");
        System.out.println("Title : " + title);
        System.out.println("Author : " + author);
        System.out.println("Price : $" + price);
        System.out.println("Availability : " + (isAvailable ? "Available" : "Not Available"));
    }

    // Method to borrow a book
    public void borrowBook() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("Book Borrowed Successfully!");
        } else {
            System.out.println("Sorry, the book is already borrowed.");
        }
    }
}
