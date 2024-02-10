import java.util.Scanner;

class Room {
    private int roomNumber;
    private int floorNumber;

    public Room(int roomNumber, int floorNumber) {
        this.roomNumber = roomNumber;
        this.floorNumber = floorNumber;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public int getFloorNumber() {
        return floorNumber;
    }
}

class Customer {
    private String customerName;
    private String bookingDate;

    public Customer(String customerName, String bookingDate) {
        this.customerName = customerName;
        this.bookingDate = bookingDate;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getBookingDate() {
        return bookingDate;
    }
}

public class Room1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Room Booking!");
        System.out.print("Enter your name: ");
        String customerName = scanner.nextLine();

        System.out.print("Enter the date of booking (YYYY-MM-DD): ");
        String bookingDate = scanner.nextLine();

        System.out.print("Enter room number: ");
        int roomNumber = scanner.nextInt();

        System.out.print("Enter floor number: ");
        int floorNumber = scanner.nextInt();

        Room room = new Room(roomNumber, floorNumber);
        Customer customer = new Customer(customerName, bookingDate);

        System.out.println("\nBooking details:");
        System.out.println("Customer Name: " + customer.getCustomerName());
        System.out.println("Booking Date: " + customer.getBookingDate());
        System.out.println("Room Number: " + room.getRoomNumber());
        System.out.println("Floor Number: " + room.getFloorNumber());
    }
}
