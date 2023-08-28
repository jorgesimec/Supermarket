import java.util.Scanner;

public class SupermarketManagement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Supermarket supermarket = new Supermarket();

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Add Product");
            System.out.println("2. List Products");
            System.out.println("3. Sell Product");
            System.out.println("4. Exit");

            System.out.print("Enter your choice (1/2/3/4): ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter the product name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter the cost price: ");
                    double costPrice = scanner.nextDouble();
                    System.out.print("Enter the selling price: ");
                    double sellingPrice = scanner.nextDouble();
                    Product product = new Product(name, costPrice, sellingPrice);
                    supermarket.addProduct(product);
                    break;

                case 2:
                    supermarket.listProducts();
                    break;

                case 3:
                    System.out.print("Enter the product name to sell: ");
                    String productName = scanner.nextLine();
                    supermarket.sellProduct(productName);
                    break;

                case 4:
                    System.out.println("Exiting the program. Goodbye!");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
