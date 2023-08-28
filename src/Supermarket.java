import java.util.Scanner;

class Supermarket {
    private Product[] inventory;
    private int numOfProducts;

    public Supermarket() {
        inventory = new Product[100]; // Maximum 100 products in the inventory
        numOfProducts = 0;
    }

    public void addProduct(Product product) {
        if (numOfProducts < inventory.length) {
            inventory[numOfProducts++] = product;
            System.out.println("Product added to inventory: " + product.getName());
        } else {
            System.out.println("Inventory is full. Cannot add more products.");
        }
    }

    public void listProducts() {
        System.out.println("List of available products:");
        for (int i = 0; i < numOfProducts; i++) {
            System.out.println(inventory[i].getName() + " - Selling Price: " + inventory[i].getSellingPrice());
        }
    }

    public void sellProduct(String productName) {
        boolean found = false;
        for (int i = 0; i < numOfProducts; i++) {
            if (inventory[i].getName().equalsIgnoreCase(productName)) {
                System.out.println("Product sold: " + inventory[i].getName());
                // Remove the sold product from the inventory
                for (int j = i; j < numOfProducts - 1; j++) {
                    inventory[j] = inventory[j + 1];
                }
                inventory[numOfProducts - 1] = null;
                numOfProducts--;
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Product not found in inventory.");
        }
    }
}

