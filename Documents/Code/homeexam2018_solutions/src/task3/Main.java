package task3;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static SecureRandom rand = new SecureRandom();

    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        Main myApp = new Main();

        String[] names = new String[5];
        String[] lastNames = new String[5];

        names[0] = "Anna";
        names[1] = "Karl";
        names[2] = "Kajsa";
        names[3] = "Petter";
        names[4] = "Sofia";

        lastNames[0] = "Nilsson";
        lastNames[1] = "Svensson";
        lastNames[2] = "Persson";
        lastNames[3] = "Karlsson";
        lastNames[4] = "Davidsson";


        System.out.println("How many random full names do you want?");
        int choice = input.nextInt();

        ArrayList<String> genNames;
        genNames = myApp.generatedNames(names, lastNames, choice);

        System.out.printf("First names: [%s, %s, %s, %s, %s]", names[0], names[1], names[2], names[3], names[4]);
        System.out.println();
        System.out.printf("Last names: [%s, %s, %s, %s, %s]", lastNames[0], lastNames[1], lastNames[2], lastNames[3], lastNames[4]);
        System.out.println();

        for (int i = 0; i < choice * 2; i++) {
            System.out.print(genNames.get(i) + " ");
            i++;
            System.out.println(genNames.get(i));
        }

    }

    private ArrayList generatedNames(String[] names, String[] lastNames, int choice) {

        ArrayList<String> generatedNames = new ArrayList<String>();

        for (int i = 0; i < choice; i++) {

            int nameChoice = rand.nextInt(5);
            int LastNameChoice = rand.nextInt(5);

            generatedNames.add(names[nameChoice]);
            generatedNames.add(lastNames[LastNameChoice]);

        }

        return generatedNames;
    }
}
