package main.e_commerce_platform;
class Electronics extends Product implements Taxable {
    private String warrantyDetails;

    public Electronics(String productId, String name, double price, String warrantyDetails) {
        super(productId, name, price);
        this.warrantyDetails = warrantyDetails;
    }

    @Override
    public double calculateDiscount() {
        return 0.10 * getPrice(); // 10% discount
    }

    @Override
    public double calculateTax() {
        return 0.18 * getPrice(); // 18% tax
    }

    @Override
    public String getTaxDetails() {
        return "Electronics Tax: 18%";
    }
}