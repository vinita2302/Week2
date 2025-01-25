package main.online_food_delivery_system;

public abstract class FoodItem {
    String itemName;
    int price;
    int quantity;

    FoodItem(String itemName,int price,int quantity){
        this.itemName=itemName;
        this.price=price;
        this.quantity=quantity;
    }

    abstract int calculateTotalPrice();
    public String getItemDetails(){
        return "ItemName"+"  "+itemName+"price"+"  "+price+"  "+"quantity"+"  "+quantity;
    }
}
