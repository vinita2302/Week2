package main.e_commerce_platform;

import java.util.*;

public class ECommercePlatform {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();

        // Adding products to the list
        products.add(new Electronics("E101", "Laptop", 50000, "2 years warranty"));
        products.add(new Clothing("C202", "T-Shirt", 1000, "Medium"));
        products.add(new Groceries("G303", "Rice", 500, "2025-12-31"));

        // Calculating and printing final price for each product
        for (Product product : products) {
            double discount = product.calculateDiscount();
            double tax = (product instanceof Taxable) ? ((Taxable) product).calculateTax() : 0;
            double finalPrice = product.getPrice() + tax - discount;

            System.out.println("Product ID: " + product.getProductId());
            System.out.println("Name: " + product.getName());
            System.out.println("Price: " + product.getPrice());
            System.out.println("Discount: " + discount);
            System.out.println("Tax: " + tax);
            System.out.println("Final Price: " + finalPrice);

            if (product instanceof Taxable) {
                System.out.println(((Taxable) product).getTaxDetails());
            }

            System.out.println("----------------------------");
        }
    }
}

