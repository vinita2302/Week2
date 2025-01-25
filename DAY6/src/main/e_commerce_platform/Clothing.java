package main.e_commerce_platform;

class Clothing extends Product implements Taxable {
    private String size;

    public Clothing(String productId, String name, double price, String size) {
        super(productId, name, price);
        this.size = size;
    }

    @Override
    public double calculateDiscount() {
        return 0.15 * getPrice(); // 15% discount
    }

    @Override
    public double calculateTax() {
        return 0.05 * getPrice(); // 5% tax
    }

    @Override
    public String getTaxDetails() {
        return "Clothing Tax: 5%";
    }
}
