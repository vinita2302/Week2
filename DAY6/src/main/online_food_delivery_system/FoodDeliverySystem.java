package main.online_food_delivery_system;

import java.util.ArrayList;
import java.util.List;

public class FoodDeliverySystem {
    public static void main(String[] args) {
        // Create a list of food items
        List<FoodItem> foodItems = new ArrayList<>();

        // Add VegItem and NonVegItem to the list
        VegItem vegItem = new VegItem("Paneer Tikka", 200, 2);
        NonVegItem nonVegItem = new NonVegItem("Chicken Curry", 300, 1);



        foodItems.add(vegItem);
        foodItems.add(nonVegItem);

        // Process orders and display details
        for (FoodItem item : foodItems) {
            System.out.println(item.getItemDetails());
            if (item instanceof Discountable) {
                Discountable discountableItem = (Discountable) item;
                System.out.println(discountableItem.getDiscountDetails());
            }
            System.out.println("Total Price: " + item.calculateTotalPrice());
            System.out.println();
        }
    }
}
