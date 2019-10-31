package task4;

import java.security.SecureRandom;
import java.util.Scanner;

public class Main {

    private static Scanner input = new Scanner(System.in);
    private static SecureRandom random = new SecureRandom();


    public static void main(String[] args) {

        String[] suit = {"Clubs", "Diamond", "Hearts", "Spades"};
        Integer[] rank = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};

        Card[] deck = new Card[52];

        int n = 0;

        for (int i = 0; i < suit.length; i++) {
            for (int j = 0; j < rank.length; j++) {
                deck[n] = new Card(rank[j], suit[i]);
                n++;
            }
        }

        //shuffling loop
        for (int i = 0; i < 1000; i++) {

            int a = random.nextInt(52);
            int b = random.nextInt(52);

            Card x = deck[a];
            Card y = deck[b];

            deck[a] = y;
            deck[b] = x;

        }

        System.out.println("How many cards should each player draw?");
        int count = input.nextInt();

        int thirdCount = count;

        int userScore = 0;
        int computerScore = 0;

        for (int i = 0; i < count; i++) {
            userScore = userScore + deck[i].getRank();
        }

        int secondCount = count * 2;

        for (int i = count; count < secondCount; count++) {
            computerScore = computerScore + deck[i].getRank();
        }

        System.out.println("The user drew the following cards:");
        for (int i = 0; i < thirdCount; i++) {
            System.out.printf("%d of %s %n", deck[i].getRank(), deck[i].getSuit());
        }
        System.out.println();
        System.out.println("The computer drew the following cards:");
        for (int i = thirdCount; i < secondCount; i++) {
            System.out.printf("%d of %s %n", deck[i].getRank(), deck[i].getSuit());
        }
        System.out.println();

        System.out.println("User score: " + userScore);
        System.out.println("Computer score " + computerScore);

        if (userScore > computerScore) {
            System.out.println("The winner is: User");
        } else if (computerScore > userScore) {
            System.out.println("The winner is: Computer");
        } else System.out.println("The game ends in a draw");


    }
}
