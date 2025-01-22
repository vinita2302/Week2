import java.util.ArrayList;
import java.util.List;

// Class representing a Product
class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return name + " ($" + price + ")";
    }
}

// Class representing an Order
class Order {
    private int orderId;
    private Customer customer;
    private List<Product> products;
    private double totalPrice;

    public Order(int orderId, Customer customer) {
        this.orderId = orderId;
        this.customer = customer;
        this.products = new ArrayList<>();
        this.totalPrice = 0;
    }

    // Method to add products to the order
    public void addProduct(Product product) {
        products.add(product);
        totalPrice += product.getPrice();
    }

    public List<Product> getProducts() {
        return products;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public Customer getCustomer() {
        return customer;
    }

    public int getOrderId() {
        return orderId;
    }

    public void displayOrderDetails() {
        System.out.println("Order ID: " + orderId);
        System.out.println("Customer: " + customer.getName());
        System.out.println("Products:");
        for (Product product : products) {
            System.out.println("- " + product);
        }
        System.out.println("Total Price: $" + totalPrice);
    }
}

// Class representing a Customer
class Customer {
    private String name;
    private String email;

    public Customer(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    // Method to place an order
    public Order placeOrder(int orderId) {
        return new Order(orderId, this);
    }
}

// Main class to simulate the e-commerce platform
public class ECommercePlatform {
    public static void main(String[] args) {
        // Create products
        Product product1 = new Product("Laptop", 1000);
        Product product2 = new Product("Smartphone", 500);
        Product product3 = new Product("Headphones", 100);

        // Create customers
        Customer customer1 = new Customer("Alice", "alice@example.com");
        Customer customer2 = new Customer("Bob", "bob@example.com");

        // Customer Alice places an order
        Order order1 = customer1.placeOrder(101);
        order1.addProduct(product1);
        order1.addProduct(product2);

        // Customer Bob places an order
        Order order2 = customer2.placeOrder(102);
        order2.addProduct(product2);
        order2.addProduct(product3);

        // Display the details of the orders
        order1.displayOrderDetails();
        System.out.println();
        order2.displayOrderDetails();
    }
}
