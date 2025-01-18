class Item {

    // Attributes
    private int itemCode;
    private String itemName;
    private double price;

    // Constructor to initialize the item object
    public Item(int itemCode, String itemName, double price) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.price = price;
    }

    // Method to display item details
    public void displayDetails() {
        System.out.println("Item Details:");
        System.out.println("Item Code: " + itemCode);
        System.out.println("Item Name: " + itemName);
        System.out.println("Price: $" + price);
    }

    public double calculateTotalCost(int quantity) {
        return price * quantity;
    }

    public static void main(String[] args) {

        Item item = new Item(101, "Laptop", 750.50);

        item.displayDetails();

        int quantity = 3;
        double totalCost = item.calculateTotalCost(quantity);
        System.out.println("Total cost for " + quantity + " units: $" + totalCost);
    }
}
