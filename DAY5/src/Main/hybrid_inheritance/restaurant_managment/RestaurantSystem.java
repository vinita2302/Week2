package Main.hybrid_inheritance.restaurant_managment;

public class RestaurantSystem {
    public static void main(String[] args) {
        // Create a Chef object
        Chef chef = new Chef("Gordon Ramsay", 101, "Italian Cuisine");
        chef.displayInfo();
        chef.performDuties();
        System.out.println();

        // Create a Waiter object
        Waiter waiter = new Waiter("John Doe", 102, 5);
        waiter.displayInfo();
        waiter.performDuties();
    }
}