package Main.multilevel_inheritance.online_retail;

public class OnlineRetail {
    public static void main(String[] args) {
        // Create an Order object
        Order order = new Order("O001", "2025-01-20");
        System.out.println(order.getOrderStatus());

        // Create a ShippedOrder object
        ShippedOrder shippedOrder = new ShippedOrder("O002", "2025-01-21", "TRK123456");
        System.out.println(shippedOrder.getOrderStatus());

        // Create a DeliveredOrder object
        DeliveredOrder deliveredOrder = new DeliveredOrder("O003", "2025-01-22", "TRK789101", "2025-01-23");
        System.out.println(deliveredOrder.getOrderStatus());
    }
}
