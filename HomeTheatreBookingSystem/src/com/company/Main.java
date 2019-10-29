package com.company;

import java.util.Scanner;

public class Main {

    private Scanner input = new Scanner(System.in);
    private boolean[][] multiArray = new boolean[3][5];

    public static void main(String[] args) {


    }

    private int printMenu() {
        while (true) {
            System.out.println("1. Book a seat");
            System.out.println("2. View a seat");
            int userInput = input.nextInt();
            return userInput;
        }
    }

    private void addBooking() {
        System.out.println("-----Seat booking-----");

        //maybe while loop is required here
        System.out.println("Enter seat row number(1-3): ");
        int row = input.nextInt();
        if (row < 1 || row > 3)
            System.out.println("Enter a correct row number between 1 and 3");
        else row--;

        System.out.println("Enter seat column number(1-5): ");
        int col = input.nextInt();
        if (col < 1 || col > 5)
            System.out.println("Enter a correct column number between 1 and 5");
        else col--;

        if (multiArray[row][col] = true)
            System.out.println("This seat has already been booked");
        else {
            multiArray[row][col] = true;
            System.out.println("The seat has been booked successfully");
        }

    }

    private void viewBooking() {

        System.out.println("   <TV>  ");

        for (int i = 0; i < multiArray.length; i++) {
            if (multiArray[row][col] = true)
                System.out.println();
            {
            }
        }


    }


}

 /*multiArray[row][col]==true
            System.out.println("This seat has already been booked!");
                else multiArray[row][col] = true;*/
