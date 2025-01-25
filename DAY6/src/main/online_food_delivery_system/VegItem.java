package main.online_food_delivery_system;

public class VegItem extends FoodItem {
    VegItem(String itemName,int price,int quantity){
        super(itemName,price,quantity);
    }
    @Override
    int calculateTotalPrice() {
        return price*quantity;
    }
}
