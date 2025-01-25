package main.e_commerce_platform;
class Groceries extends Product {
    private String expirationDate;

    public Groceries(String productId, String name, double price, String expirationDate) {
        super(productId, name, price);
        this.expirationDate = expirationDate;
    }

    @Override
    public double calculateDiscount() {
        return 0.05 * getPrice(); // 5% discount
    }
}
