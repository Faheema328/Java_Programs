import java.util.ArrayList;
import java.util.Scanner;

/**
 * Hotel Reservation System
 * This program allows users to search, book, and manage hotel rooms.
 * It includes room categorization, payment simulation, and booking details.
 * Author: Shaik Faheemunnisa
 * Internship: CodeAlpha - Task 4
 */

public class HotelReservationSystem {

    // Room class to store room details
    static class Room {
        int roomNumber;
        String category;   // Standard, Deluxe, Suite
        double pricePerNight;
        boolean isAvailable;

        // Constructor
        Room(int roomNumber, String category, double pricePerNight) {
            this.roomNumber = roomNumber;
            this.category = category;
            this.pricePerNight = pricePerNight;
            this.isAvailable = true; // All rooms available by default
        }
    }

    // Booking class to store booking details
    static class Booking {
        String guestName;
        int roomNumber;
        String category;
        int nights;
        double totalAmount;

        // Constructor
        Booking(String guestName, int roomNumber, String category, int nights, double totalAmount) {
            this.guestName = guestName;
            this.roomNumber = roomNumber;
            this.category = category;
            this.nights = nights;
            this.totalAmount = totalAmount;
        }
    }

    // List to store all rooms
    static ArrayList<Room> rooms = new ArrayList<>();

    // List to store all bookings
    static ArrayList<Booking> bookings = new ArrayList<>();

    public static void main(String[] args) {

        // Initialize Hotel Rooms
        setupRooms();

        Scanner scanner = new Scanner(System.in);
        int choice;

        System.out.println("============================================");
        System.out.println("     WELCOME TO HOTEL RESERVATION SYSTEM    ");
        System.out.println("============================================");

        // Keep showing menu until user exits
        do {
            System.out.println("\n--- MAIN MENU ---");
            System.out.println("1. Search Available Rooms");
            System.out.println("2. Book a Room");
            System.out.println("3. Cancel Booking");
            System.out.println("4. View All Bookings");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    searchRooms(scanner);
                    break;
                case 2:
                    bookRoom(scanner);
                    break;
                case 3:
                    cancelBooking(scanner);
                    break;
                case 4:
                    viewAllBookings();
                    break;
                case 5:
                    System.out.println("\nThank you for using Hotel Reservation System. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }

        } while (choice != 5);

        scanner.close();
    }

    // Method to set up hotel rooms
    static void setupRooms() {
        // Standard rooms (101-103)
        rooms.add(new Room(101, "Standard", 1500.00));
        rooms.add(new Room(102, "Standard", 1500.00));
        rooms.add(new Room(103, "Standard", 1500.00));

        // Deluxe rooms (201-203)
        rooms.add(new Room(201, "Deluxe", 3000.00));
        rooms.add(new Room(202, "Deluxe", 3000.00));
        rooms.add(new Room(203, "Deluxe", 3000.00));

        // Suite rooms (301-303)
        rooms.add(new Room(301, "Suite", 6000.00));
        rooms.add(new Room(302, "Suite", 6000.00));
        rooms.add(new Room(303, "Suite", 6000.00));
    }

    // Method to search available rooms by category
    static void searchRooms(Scanner scanner) {
        System.out.println("\n--- SEARCH AVAILABLE ROOMS ---");
        System.out.println("1. Standard  - Rs. 1500/night");
        System.out.println("2. Deluxe    - Rs. 3000/night");
        System.out.println("3. Suite     - Rs. 6000/night");
        System.out.println("4. Show All Available Rooms");
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();

        String category = "";
        if (choice == 1) category = "Standard";
        else if (choice == 2) category = "Deluxe";
        else if (choice == 3) category = "Suite";

        System.out.println("\nAvailable Rooms:");
        System.out.println("Room No. | Category  | Price/Night | Status");
        System.out.println("---------+-----------+-------------+----------");

        boolean found = false;

        for (Room room : rooms) {
            // Show all or filter by category
            if (choice == 4 || room.category.equals(category)) {
                if (room.isAvailable) {
                    System.out.printf("%-9d| %-10s| Rs. %-8.2f| Available%n",
                            room.roomNumber, room.category, room.pricePerNight);
                    found = true;
                }
            }
        }

        if (!found) {
            System.out.println("No available rooms found for selected category!");
        }
    }

    // Method to book a room
    static void bookRoom(Scanner scanner) {
        System.out.println("\n--- BOOK A ROOM ---");
        System.out.print("Enter your name: ");
        String name = scanner.next();

        System.out.print("Enter room number to book: ");
        int roomNumber = scanner.nextInt();

        System.out.print("Enter number of nights: ");
        int nights = scanner.nextInt();

        // Find the room
        Room selectedRoom = null;
        for (Room room : rooms) {
            if (room.roomNumber == roomNumber) {
                selectedRoom = room;
                break;
            }
        }

        // Check if room exists
        if (selectedRoom == null) {
            System.out.println("Room not found! Please enter a valid room number.");
            return;
        }

        // Check if room is available
        if (!selectedRoom.isAvailable) {
            System.out.println("Sorry! Room " + roomNumber + " is already booked.");
            return;
        }

        // Calculate total amount
        double totalAmount = selectedRoom.pricePerNight * nights;

        // Simulate Payment
        System.out.println("\n--- PAYMENT DETAILS ---");
        System.out.println("Room Number  : " + selectedRoom.roomNumber);
        System.out.println("Category     : " + selectedRoom.category);
        System.out.println("Price/Night  : Rs. " + selectedRoom.pricePerNight);
        System.out.println("Nights       : " + nights);
        System.out.println("Total Amount : Rs. " + totalAmount);
        System.out.print("\nConfirm payment? (yes/no): ");
        String confirm = scanner.next();

        if (confirm.equalsIgnoreCase("yes")) {
            // Mark room as booked
            selectedRoom.isAvailable = false;

            // Save Booking
            bookings.add(new Booking(name, roomNumber, selectedRoom.category, nights, totalAmount));

            System.out.println("\n========================================");
            System.out.println("   BOOKING CONFIRMED SUCCESSFULLY!");
            System.out.println("========================================");
            System.out.println("Guest Name   : " + name);
            System.out.println("Room Number  : " + roomNumber);
            System.out.println("Category     : " + selectedRoom.category);
            System.out.println("Nights       : " + nights);
            System.out.println("Amount Paid  : Rs. " + totalAmount);
            System.out.println("========================================");
        } else {
            System.out.println("Booking cancelled. No payment made.");
        }
    }

    // Method to cancel a booking
    static void cancelBooking(Scanner scanner) {
        System.out.println("\n--- CANCEL BOOKING ---");
        System.out.print("Enter your name to cancel booking: ");
        String name = scanner.next();

        System.out.print("Enter room number to cancel: ");
        int roomNumber = scanner.nextInt();

        // Find Booking
        Booking foundBooking = null;
        for (Booking booking : bookings) {
            if (booking.guestName.equalsIgnoreCase(name) && booking.roomNumber == roomNumber) {
                foundBooking = booking;
                break;
            }
        }

        if (foundBooking == null) {
            System.out.println("No booking found for " + name + " in room " + roomNumber);
            return;
        }

        // Remove booking and mark room available again
        bookings.remove(foundBooking);
        for (Room room : rooms) {
            if (room.roomNumber == roomNumber) {
                room.isAvailable = true;
                break;
            }
        }

        System.out.println("\nBooking cancelled successfully for " + name + " in Room " + roomNumber);
        System.out.println("Refund of Rs. " + foundBooking.totalAmount + " will be processed.");
    }

    // Method to view all bookings
    static void viewAllBookings() {
        if (bookings.isEmpty()) {
            System.out.println("\nNo bookings found!");
            return;
        }

        System.out.println("\n--- ALL BOOKINGS ---");
        System.out.println("Guest Name    | Room No. | Category  | Nights | Total Amount");
        System.out.println("--------------+----------+-----------+--------+-------------");

        for (Booking booking : bookings) {
            System.out.printf("%-14s| %-9d| %-10s| %-7d| Rs. %.2f%n",
                    booking.guestName, booking.roomNumber,
                    booking.category, booking.nights, booking.totalAmount);
        }
    }
}