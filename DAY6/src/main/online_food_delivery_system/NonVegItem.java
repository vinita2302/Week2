package main.online_food_delivery_system;

public class NonVegItem extends FoodItem {
    int additionalCharge=125;
    NonVegItem(String itemName,int price,int quantity){
        super(itemName,price,quantity);
    }

    @Override
    int calculateTotalPrice() {
        return additionalCharge+(price*quantity);
    }


}
