package task1;

/* Stylianos Gakis STGA0006 */

import java.util.Scanner;

public class Main {
    private Scanner input = new Scanner(System.in);
    private Customer[] seatsArray = new Customer[100];

    public static void main(String[] args) {
        Main myApp = new Main();
        myApp.runProgram();
    }

    private void runProgram() {
        boolean running = true;
        while (running) {
            int userMenuChoice = printMenu();
            switch (userMenuChoice) {
                case 1:
                    addBooking();
                    break;
                case 2:
                    viewBookings();
                    break;
                case 3:
                    running = false;
                    System.out.println("Thank you! Have a good flight!");
                    break;
                default:
                    System.out.println("Enter a proper value");
                    break;
            }
        }
    }

    private int printMenu() {
        System.out.println("1. Add Booking");
        System.out.println("2. View Bookings");
        System.out.println("3. Exit");
        int userInput = input.nextInt();
        input.nextLine();
        return userInput;
    }

    private void addBooking() {
        System.out.print("Enter person name: ");
        String customerName = input.nextLine();
        while (true) {
            System.out.print("Enter seat number: ");
            int seatNumber = input.nextInt();
            input.nextLine();
            if (seatNumber < 0 || seatNumber >= seatsArray.length) {
                // If the user input is out of bounds, inform the user.
                System.out.println("Enter a correct number");
            } else if (seatsArray[seatNumber] != null) {
                // If the seat is not null, it means it has a Customer on it already, so we need to not steal that seat.
                System.out.println("This seat is taken");
            } else {
                // Once all the checks are done, we can create the customer object.
                Customer customer = new Customer(customerName);
                // And then assign it to our array in the chosen seat.
                seatsArray[seatNumber] = customer;
                // Finally we just break from the loop that otherwise infinitely loops until we reach this point.
                break;
            }
        }
    }

    private void viewBookings() {
        for (int i = 0; i < seatsArray.length; i++) {
            // String that saves "Not booked" if nobody has reserved it, or the name of the customer if reserved.
            String seatState;
            Customer seatCustomer = seatsArray[i];
            if (seatCustomer == null) {
                // If the customer was null, it means there was no customer on that seat, therefore it was empty.
                seatState = "Not booked";
            } else {
                // If the customer is not null, we get the name of that customer to print on our print statement.
                seatState = seatsArray[i].getName();
            }
            System.out.printf("[%d] %s%n", i, seatState);
        }
    }
}


