import java.util.Scanner;

public class ProductInventory {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Product Name : ");
        String productName1 = sc.nextLine();

        System.out.println("Enter Price : ");
        double price1 = sc.nextDouble();
        sc.nextLine();

        // Creating first Product object
        Product product1 = new Product(productName1, price1);

        System.out.println("\nEnter Product Name : ");
        String productName2 = sc.nextLine();

        System.out.println("Enter Price : ");
        double price2 = sc.nextDouble();

        // Creating second Product object
        Product product2 = new Product(productName2, price2);

        // Displaying product details
        System.out.println("\n==== Product Details ====");
        product1.displayProductDetails();
        product2.displayProductDetails();

        // Displaying total number of products created
        Product.displayTotalProducts();


        sc.close();
    }
}


class Product {
    private String productName;
    private double price;

    // Class Variable (shared among all instances)
    private static int totalProducts = 0;

    // Constructor to initialize Product object
    public Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
        totalProducts++;
    }

    // Method to display product details
    public void displayProductDetails() {
        System.out.println("Product Name : " + productName);
        System.out.println("Price : $" + price);
    }

    // Class method to display total number of products created
    public static void displayTotalProducts() {
        System.out.println("\nTotal Products Created : " + totalProducts);
    }
}
