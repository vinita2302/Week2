package main.library_management_system;

import java.util.ArrayList;
import java.util.List;

public class LibraryManagementSystem {
    public static void main(String[] args) {
        // Create a list of library items
        List<LibraryItem> libraryItems = new ArrayList<>();

        // Add items to the library
        LibraryItem book = new Book("B001", "Java Programming", "John Doe");
        LibraryItem magazine = new Magazine("M001", "Tech World", "Jane Smith");
        LibraryItem dvd = new DVD("D001", "Inception", "Christopher Nolan");

        libraryItems.add(book);
        libraryItems.add(magazine);
        libraryItems.add(dvd);

        // Display details and loan durations dynamically
        for (LibraryItem item : libraryItems) {
            System.out.println(item.getItemDetails());
            System.out.println("Loan Duration: " + item.getLoanDuration() + " days");

            if (item instanceof Reservable reservableItem) {
                System.out.println("Available: " + reservableItem.checkAvailability());
                reservableItem.reserveItem("Alice");
                System.out.println("Available after reservation: " + reservableItem.checkAvailability());
            }
            System.out.println();
        }
    }
}
