import java.util.Scanner;

public class HotelBooking {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Guest Name : ");
        String guestName = sc.nextLine();

        System.out.println("Enter Room Type : ");
        String roomType = sc.nextLine();

        System.out.println("Enter Number of Nights : ");
        int nights = sc.nextInt();
        sc.nextLine();

        // Creating a booking using parameterized constructor
        HotelBooking booking1 = new HotelBooking(guestName, roomType, nights);

        // Displaying booking details
        System.out.println("\nOriginal Booking Details:");
        booking1.displayBooking();

        // Creating a copy of the booking using the copy constructor
        HotelBooking booking2 = new HotelBooking(booking1);

        // Displaying copied booking details
        System.out.println("\nCopied Booking Details:");
        booking2.displayBooking();

        sc.close();
    }

    // Attributes to store booking details
    private String guestName;
    private String roomType;
    private int nights;

    // Default constructor
    public HotelBooking() {
        this.guestName = "Not Provided";
        this.roomType = "Standard";
        this.nights = 1;
    }

    // Parameterized constructor to initialize booking details
    public HotelBooking(String guestName, String roomType, int nights) {
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }

    // Copy constructor to duplicate an existing booking
    public HotelBooking(HotelBooking other) {
        this.guestName = other.guestName;
        this.roomType = other.roomType;
        this.nights = other.nights;
    }

    // Method to display booking details
    public void displayBooking() {
        System.out.println("==== Booking Details ====");
        System.out.println("Guest Name : " + guestName);
        System.out.println("Room Type : " + roomType);
        System.out.println("Number of Nights : " + nights);
    }
}
