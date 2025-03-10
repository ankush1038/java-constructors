import java.util.Scanner;

public class VehicleManagement {
    public static void main(String[] args) {

        // Take user input
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Owner Name : ");
        String ownerName1 = sc.nextLine();

        System.out.println("Enter Vehicle Type : ");
        String vehicleType1 = sc.nextLine();

        // Creating first Vehicle object
        Vehicle vehicle1 = new Vehicle(ownerName1, vehicleType1);

        System.out.println("\nEnter Owner Name : ");
        String ownerName2 = sc.nextLine();

        System.out.println("Enter Vehicle Type : ");
        String vehicleType2 = sc.nextLine();

        // Creating second Vehicle object
        Vehicle vehicle2 = new Vehicle(ownerName2, vehicleType2);

        // Displaying vehicle details
        System.out.println("\n==== Vehicle Details ====");
        vehicle1.displayVehicleDetails();
        vehicle2.displayVehicleDetails();

        // Updating registration fee
        System.out.println("\nEnter New Registration Fee : ");
        double newFee = sc.nextDouble();
        Vehicle.updateRegistrationFee(newFee);

        // Displaying updated vehicle details
        System.out.println("\n==== Updated Vehicle Details ====");
        vehicle1.displayVehicleDetails();
        vehicle2.displayVehicleDetails();

        sc.close();
    }
}

// Class to manage vehicle details
class Vehicle {
    private String ownerName;
    private String vehicleType;

    // Class variable shared among all vehicles
    private static double registrationFee = 500.0;

    // Constructor to initialize vehicle details
    public Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    // Method to display vehicle details
    public void displayVehicleDetails() {
        System.out.println("==== Vehicle Information ====");
        System.out.println("Owner Name : " + ownerName);
        System.out.println("Vehicle Type : " + vehicleType);
        System.out.println("Registration Fee : $" + registrationFee);
    }

    // Class method to update registration fee
    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }
}
