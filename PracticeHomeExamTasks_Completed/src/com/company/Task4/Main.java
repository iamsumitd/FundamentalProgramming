package com.company.Task4;

//under development...

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Scanner stringInput = new Scanner(System.in);//opted for a seperate Scanner object to work with Strings. When researched, this turned out to be a known limitation of Java.

        String[] queue = new String[100];
        int counter;

        while (true) {
            //Menu
            System.out.println("---- Food Menu ----");
            System.out.println("1. Register a new visitor");//placing the visitors in the queue
            System.out.println("2. Advance the queue");//remove the visitor from the queue
            System.out.println();
            System.out.println("Enter option: ");
            int option = input.nextInt();


            //why can't I define the variable: "int counter;" here and use it in the for loop
            if (option == 1) {
                //for (counter = 0; counter < queue.length; counter++) {

                System.out.println("Enter your name: ");
                String name = stringInput.nextLine();

                for (counter = 0; counter < queue.length; counter++) {
                    if (queue[counter] == null) {
                        queue[counter] = name;
                        break;
                    }
                }

            } else if (option == 2) {

                if (queue[0] == null) {
                    System.out.println("No visitors in queue");
                } else {
                    System.out.println("Now serving: " + queue[0]);//maybe this should be after the following for loop
                    //int n = 100;
                    //int d = 1;
                    queue[0] = null;
                    for (int i = 0; i < (queue.length) - 1; i++) {
                        queue[i] = queue[i + 1];
                    }

                }
            }

        }
    }
}

