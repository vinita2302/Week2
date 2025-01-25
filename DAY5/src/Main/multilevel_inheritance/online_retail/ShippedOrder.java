package Main.multilevel_inheritance.online_retail;

class ShippedOrder extends Order {
    private String trackingNumber;

    // Constructor
    public ShippedOrder(String orderId, String orderDate, String trackingNumber) {
        super(orderId, orderDate); // Call base class constructor
        this.trackingNumber = trackingNumber;
    }

    // Getter
    public String getTrackingNumber() {
        return trackingNumber;
    }

    // Overriding getOrderStatus to include shipment details
    @Override
    public String getOrderStatus() {
        return super.getOrderStatus() + " | Shipped with tracking number: " + trackingNumber;
    }
}

