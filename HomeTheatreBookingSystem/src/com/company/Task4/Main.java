package com.company.Task4;


//under development...
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String[] queue = new String[100];

        while (true) {
            //Menu
            System.out.println("---- Food Menu ----");
            System.out.println("1. Register a new visitor");//placing the visitors in the queue
            System.out.println("2. Advance the queue");//remove the visitor from the queue
            System.out.println();
            System.out.println("Enter option: ");
            int option = input.nextInt();

            int counter=0; //why can't I define the variable here and use it in the for loop
            if (option == 1) {

                for (counter < queue.length; counter++) {
                    System.out.println("Enter your name: ");

                  while (queue[counter]!=null)
                  {counter++;}

                  queue[counter] = input.nextLine();

                }
            }else if(option == 2){

                for (int newCounter = 0; newCounter<queue.length; newCounter--){
                    queue[counter-1] =
                }


                System.out.println("Now serving: "+queue[0]);
                queue[0] = null;



            }

        }
    }
}
