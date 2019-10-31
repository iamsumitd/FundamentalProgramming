package com.company.task1;

import java.util.Scanner;

public class Main {

    private static Scanner input = new Scanner(System.in);
    private static Main method = new Main();

    public static void main(String[] args) {

        Boolean[][] garden = new Boolean[5][5];

        boolean running = true;

        for (int x = 0; x < 5; x++) {
            for (int y = 0; y < 5; y++) {
                garden[x][y] = true;
            }
        }

        while (running) {

            method.printMenu();

            int choice = input.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("Which column do you want to survey?");
                    int yPos = input.nextInt();
                    System.out.println("Which row do you want to survey?");
                    int xPos = input.nextInt();
                    if (garden[xPos][yPos]) {
                        garden[xPos][yPos] = false;
                        System.out.println("The location has now been surveyed");
                        System.out.println();
                    } else System.out.printf("The location has already been surveyed %n %n");
                    break;

                case 2:
                    for (int x = 0; x < 5; x++) {
                        for (int y = 0; y < 5; y++) {
                            if (garden[y][x]) {
                                System.out.print(". ");
                            } else System.out.print("X ");
                        }
                        System.out.println();
                    }
                    System.out.println();
                    break;

                default:
                    System.out.println("Please enter a valid option");
                    System.out.println();
                    break;
            }
        }
    }

    private void printMenu() {
        System.out.println("---Menu---");
        System.out.println("1. Survey");
        System.out.println("2. View");
        System.out.println("----------");
    }
}
