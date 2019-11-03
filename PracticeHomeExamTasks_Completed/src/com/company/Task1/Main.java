package com.company.Task1;

import java.util.Scanner;

public class Main {
    private Scanner input = new Scanner(System.in);
    private boolean[][] multiArray = new boolean[3][5];
    int rowLength = 3;
    int colLength = 5;

    public static void main(String[] args) {
        Main myApp = new Main();
        myApp.runProgram();
    }

    private void runProgram() {

        while (true) {
            int userInput = printMenuAndGetInput();
            // if user input is 3, set the runningInfinitely = false
            if (userInput ==1){
                addBooking();}
            else if (userInput == 2){
                viewBooking();}
        }
    }

    private int printMenuAndGetInput() {
        System.out.println("----------------");
        System.out.println("1. Book a seat");
        System.out.println("2. View a seat");
        System.out.println("----------------");
        // 3. Exit
        return input.nextInt();
    }

    private void addBooking() {
        System.out.println("-----Seat booking-----");

        boolean addBookingRunning = true;
        do {
            boolean rowRunning = true;
            int row;
            do {
                System.out.println("Enter seat row number(1-3): ");
                row = input.nextInt();
                if ((row < 1) || (row > 3)) {
                    System.out.println("Wrong input! Please enter a number between 1 and 3");
                } else {
                    row--;
                    rowRunning = false;
                }
            } while (rowRunning);

            boolean colRunning = true;
            int col;
            do {
                System.out.println("Enter seat column number(1-5): ");
                col = input.nextInt();

                if ((col < 1) || (col > 5)) {
                    System.out.println("Wrong input! Please enter a number between 1 and 5");
                } else {
                    col--;
                    //multiArray[row][col] = true;
                    colRunning = false;
                }
            } while (colRunning);

            if (multiArray[row][col] == true) {
                System.out.println("This seat has already been booked! Please choose another one");
            } else {
                multiArray[row][col] = true;
                addBookingRunning = false;
                System.out.println("The seat has been booked successfully");
            }

        } while (addBookingRunning);

    }

    private void viewBooking() {

        System.out.println("   <TV> ");

        for (int i = 0; i < rowLength; i++) {
            for (int j = 0; j < colLength; j++) {
                if (multiArray[i][j] == true) {
                    System.out.print("O ");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}

//maybe while loop is required here
        /*int row;
        do {
            System.out.println("Enter seat row number(1-3): ");
            row = input.nextInt();
            if ((row < 1) || (row > 3)) {
                System.out.println("Wrong input");
            }
        } while ((row < 1) || (row > 3));*/

 /*multiArray[row][col]==true
            System.out.println("This seat has already been booked!");
                else multiArray[row][col] = true;*/
