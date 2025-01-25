package Main.multilevel_inheritance.online_retail;
class DeliveredOrder extends ShippedOrder {
    private String deliveryDate;

    // Constructor
    public DeliveredOrder(String orderId, String orderDate, String trackingNumber, String deliveryDate) {
        super(orderId, orderDate, trackingNumber); // Call superclass constructor
        this.deliveryDate = deliveryDate;
    }

    // Getter
    public String getDeliveryDate() {
        return deliveryDate;
    }

    // Overriding getOrderStatus to include delivery details
    @Override
    public String getOrderStatus() {
        return super.getOrderStatus() + " | Delivered on " + deliveryDate;
    }
}
