
package com.company;

public class Main {

    public static void main(String[] args) {

        for (int k = 0; k < 4; k++) {
            for (int i = 0; i < 8; i++) {
                System.out.print("* ");
            }
            System.out.println();
            System.out.print(" ");
            for (int j = 0; j < 8; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}