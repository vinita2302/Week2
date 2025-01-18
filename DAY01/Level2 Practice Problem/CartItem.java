import java.util.ArrayList;

class CartItem {
    // Attributes
    private String itemName;
    private double price;
    private int quantity;

   
    public CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

 
    public String getItemName() {
        return itemName;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

   
    public double getTotalCost() {
        return price * quantity;
    }

    // Method to display the item details
    public void displayItem() {
        System.out.println("Item Name: " + itemName);
        System.out.println("Price: $" + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Cost: $" + getTotalCost());
        System.out.println();
    }
}

class ShoppingCart {
    // List to store cart items
    private ArrayList<CartItem> cartItems;

    // Constructor to initialize the cart
    public ShoppingCart() {
        cartItems = new ArrayList<>();
    }

    // Method to add an item to the cart
    public void addItem(String itemName, double price, int quantity) {
        cartItems.add(new CartItem(itemName, price, quantity));
        System.out.println(itemName + " added to the cart.");
    }

    // Method to remove an item from the cart
    public void removeItem(String itemName) {
        boolean found = false;
        for (int i = 0; i < cartItems.size(); i++) {
            if (cartItems.get(i).getItemName().equalsIgnoreCase(itemName)) {
                cartItems.remove(i);
                System.out.println(itemName + " removed from the cart.");
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println(itemName + " not found in the cart.");
        }
    }

    public void displayTotalCost() {
        double totalCost = 0;
        for (CartItem item : cartItems) {
            totalCost += item.getTotalCost();
        }
        System.out.println("Total Cost of Cart: $" + totalCost);
    }

    public void displayCartItems() {
        if (cartItems.isEmpty()) {
            System.out.println("The cart is empty.");
        } else {
            System.out.println("Cart Items:");
            for (CartItem item : cartItems) {
                item.displayItem();
            }
        }
    }

    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        // Adding items to the cart
        cart.addItem("Laptop", 1200.50, 1);
        cart.addItem("Phone", 800.99, 2);
        cart.addItem("Headphones", 50.75, 3);

        // Displaying items in the cart
        cart.displayCartItems();

        // Displaying total cost
        cart.displayTotalCost();

        // Removing an item
        cart.removeItem("Phone");

        // Displaying updated cart
        cart.displayCartItems();

        // Displaying updated total cost
        cart.displayTotalCost();
    }
}
