import java.util.Scanner;

public class CarRentalSystem {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Customer Name : ");
        String customerName = sc.nextLine();

        System.out.println("Enter Car Model : ");
        String carModel = sc.nextLine();

        System.out.println("Enter Rental Days : ");
        int rentalDays = sc.nextInt();

        System.out.println("Enter Daily Rental Rate : ");
        double dailyRate = sc.nextDouble();

        // Creating a CarRental object
        CarRental rental = new CarRental(customerName, carModel, rentalDays, dailyRate);

        // Displaying rental details
        System.out.println("\nRental Details:");
        rental.displayRentalDetails();

        sc.close();
    }
}

// Class to manage car rentals
class CarRental {
    private String customerName;
    private String carModel;
    private int rentalDays;
    private double dailyRate;
    private double totalCost;

    // Constructor to initialize rental details
    public CarRental(String customerName, String carModel, int rentalDays, double dailyRate) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
        this.dailyRate = dailyRate;
        this.totalCost = calculateTotalCost();
    }

    // Method to calculate total rental cost
    private double calculateTotalCost() {
        return rentalDays * dailyRate;
    }

    // Method to display rental details
    public void displayRentalDetails() {
        System.out.println("==== Rental Details ====");
        System.out.println("Customer Name : " + customerName);
        System.out.println("Car Model : " + carModel);
        System.out.println("Rental Days : " + rentalDays);
        System.out.println("Daily Rate : $" + dailyRate);
        System.out.println("Total Cost : $" + totalCost);
    }
}
