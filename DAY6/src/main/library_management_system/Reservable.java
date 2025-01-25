package main.library_management_system;

interface Reservable {
    void reserveItem(String borrowerName);
    boolean checkAvailability();
}
