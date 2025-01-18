public class MovieTicket {
    private String movieName;
    private int seatNumber;
    private int price;
    private boolean isBooked;

    MovieTicket(String movieName, int seatNumber, int price) {
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.price = price;
        this.isBooked = false;
    }

    public void bookTicket() {
        if (isBooked) {
            System.out.println("Seat " + seatNumber + " for " + movieName + " is already booked.");
        } else {
            isBooked = true;
            System.out.println("Successfully booked seat " + seatNumber + " for " + movieName + ".");
        }
    }

    public void displayTicketDetails() {
        System.out.println("Movie Name: " + movieName);
        System.out.println("Seat Number: " + seatNumber);
        System.out.println("Price: $" + price);
        System.out.println("Booking Status: " + (isBooked ? "Booked" : "Available"));
    }

    // Main method
    public static void main(String[] args) {
        // Creating movie tickets
        MovieTicket ticket1 = new MovieTicket("Avengers: Endgame", 1, 12);
        MovieTicket ticket2 = new MovieTicket("Spider-Man: No Way Home", 2, 10);

        // Display ticket details
        ticket1.displayTicketDetails();
        ticket2.displayTicketDetails();

        // Booking tickets
        ticket1.bookTicket();
        ticket1.bookTicket();

        // Display ticket details again
        ticket1.displayTicketDetails();
        ticket2.displayTicketDetails();
    }
}
