package task2;

/* Stylianos Gakis STGA0006 */

import java.security.SecureRandom;
import java.util.Scanner;

/**
 * This is code that I wrote 2 years ago, please do inform me if you find any mistakes.
 */
public class Main {

    private Scanner in = new Scanner(System.in);
    private SecureRandom rand = new SecureRandom();
    private boolean[][] gameArea = new boolean[10][10];

    public static void main(String[] args) {
        Main myApp = new Main();

        myApp.placeShip();
        myApp.playGame();
    }

    private void playGame() {
        int x;
        int y;
        int guess = 0;
        System.out.println("\nWelcome to Battleships!");
        boolean exit = false;
        while (!exit) {
            System.out.printf("New guess:%nx = ");
            x = in.nextInt();
            System.out.printf("y = ");
            y = in.nextInt();
            guess++;
            if (!gameArea[x][y]) {
                System.out.printf("Miss!%n%n");
            } else {
                System.out.printf("Hit!%n");
                System.out.printf("Congratulations! You won!%n");
                System.out.printf("It took %d guess(es)", guess);
                exit = true;
            }
        }
    }

    private void placeShip() {
        int row;
        int column;
        row = rand.nextInt(10);
        column = rand.nextInt(10);
        gameArea[row][column] = true;
        System.out.print("*Debugging purposes*\nThe ship is placed on (");
        System.out.printf("%d, %d)%n", row, column);
    }
}
