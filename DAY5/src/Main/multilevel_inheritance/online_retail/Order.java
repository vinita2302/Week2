package Main.multilevel_inheritance.online_retail;

class Order {
    private String orderId;
    private String orderDate;

    // Constructor
    public Order(String orderId, String orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
    }

    // Getters
    public String getOrderId() {
        return orderId;
    }

    public String getOrderDate() {
        return orderDate;
    }

    // Method to get order status
    public String getOrderStatus() {
        return "Order placed on " + orderDate;
    }
}
