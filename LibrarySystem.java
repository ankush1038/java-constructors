import java.util.Scanner;

public class LibrarySystem {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter ISBN : ");
        String isbn = sc.nextLine();

        System.out.println("Enter Title : ");
        String title = sc.nextLine();

        System.out.println("Enter Author : ");
        String author = sc.nextLine();

        // Creating a Book object
        Book book = new Book(isbn, title, author);

        // Displaying book details
        System.out.println("\n==== Book Details ====");
        book.displayBookDetails();

        System.out.println("\nEnter Updated Author Name : ");
        String updatedAuthor = sc.nextLine();
        book.setAuthor(updatedAuthor);

        // Displaying updated book details
        System.out.println("\n==== Updated Book Details ====");
        book.displayBookDetails();

        System.out.println("\nEnter File Size for EBook : ");
        double fileSize = sc.nextDouble();

        // Creating an EBook object
        EBook eBook = new EBook(isbn, title, updatedAuthor, fileSize);

        // Displaying EBook details
        System.out.println("\n==== EBook Details ====");
        eBook.displayEBookDetails();

        sc.close();
    }
}

class Book {
    public String ISBN;

    protected String title;

    private String author;

    public Book(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void displayBookDetails() {
        System.out.println("ISBN : " + ISBN);
        System.out.println("Title : " + title);
        System.out.println("Author : " + author);
    }
}

class EBook extends Book {
    private double fileSize;

    public EBook(String ISBN, String title, String author, double fileSize) {
        super(ISBN, title, author);
        this.fileSize = fileSize;
    }

    public void displayEBookDetails() {
        System.out.println("ISBN : " + ISBN);
        System.out.println("Title : " + title);
        System.out.println("File Size : " + fileSize + "MB");
    }
}
