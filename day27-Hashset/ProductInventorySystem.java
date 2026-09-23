import java.util.*;

class Product {

    private int productId;
    private String name;
    private double price;
    private int quantity;

    Product(int productId, String name,
            double price, int quantity) {

        this.productId = productId;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public int getProductId() {
        return productId;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getInventoryValue() {
        return price * quantity;
    }

    public void displayProduct() {

        System.out.println(
                "ID: " + productId +
                ", Name: " + name +
                ", Price: " + price +
                ", Quantity: " + quantity
        );
    }
}

public class ProductInventorySystem {

    static ArrayList<Product> products = new ArrayList<>();

    static void addProduct(Product product) {

        products.add(product);

        System.out.println("Product added successfully.");
    }

    static Product searchProduct(int productId) {

        for (Product product : products) {

            if (product.getProductId() == productId) {
                return product;
            }
        }

        return null;
    }

    static void updateQuantity(int productId, int quantity) {

        Product product = searchProduct(productId);

        if (product == null) {

            System.out.println("Product not found.");
            return;
        }

        product.setQuantity(quantity);

        System.out.println("Quantity updated successfully.");
    }

    static void removeProduct(int productId) {

        Product product = searchProduct(productId);

        if (product == null) {

            System.out.println("Product not found.");
            return;
        }

        products.remove(product);

        System.out.println("Product removed successfully.");
    }

    static void displayAllProducts() {

        if (products.isEmpty()) {

            System.out.println("Inventory is empty.");
            return;
        }

        for (Product product : products) {
            product.displayProduct();
        }
    }

    static double calculateTotalInventoryValue() {

        double total = 0;

        for (Product product : products) {

            total += product.getInventoryValue();
        }

        return total;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("\n===== PRODUCT INVENTORY =====");
            System.out.println("1. Add Product");
            System.out.println("2. Search Product");
            System.out.println("3. Update Quantity");
            System.out.println("4. Remove Product");
            System.out.println("5. Display All Products");
            System.out.println("6. Total Inventory Value");
            System.out.println("7. Exit");

            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            switch (choice) {

                case 1:

                    System.out.print("Enter Product ID: ");
                    int id = sc.nextInt();

                    sc.nextLine();

                    System.out.print("Enter Product Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Price: ");
                    double price = sc.nextDouble();

                    System.out.print("Enter Quantity: ");
                    int quantity = sc.nextInt();

                    addProduct(
                            new Product(id, name, price, quantity)
                    );

                    break;

                case 2:

                    System.out.print("Enter Product ID: ");
                    int searchId = sc.nextInt();

                    Product product = searchProduct(searchId);

                    if (product == null) {
                        System.out.println("Product not found.");
                    } else {
                        product.displayProduct();
                    }

                    break;

                case 3:

                    System.out.print("Enter Product ID: ");
                    int updateId = sc.nextInt();

                    System.out.print("Enter New Quantity: ");
                    int newQuantity = sc.nextInt();

                    updateQuantity(updateId, newQuantity);

                    break;

                case 4:

                    System.out.print("Enter Product ID: ");
                    int removeId = sc.nextInt();

                    removeProduct(removeId);

                    break;

                case 5:

                    displayAllProducts();

                    break;

                case 6:

                    double totalValue =
                            calculateTotalInventoryValue();

                    System.out.println(
                            "Total Inventory Value: " + totalValue
                    );

                    break;

                case 7:

                    System.out.println("Exiting...");
                    sc.close();
                    return;

                default:

                    System.out.println("Invalid choice.");
            }
        }
    }
}