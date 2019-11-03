package task4;

/* Stylianos Gakis STGA0006 */

import java.util.ArrayList;
import java.util.Scanner;

/*
 * This is code that I wrote 2 years ago, please do inform me if you find any mistakes.
 */
public class Main {

    private final Scanner in = new Scanner(System.in);
    private ArrayList<Visitor> visitorList = new ArrayList<>();

    public static void main(String[] args) {
        Main myApp = new Main();

        myApp.visitorCreation();
        myApp.viewVisitorTags();
    }
    
    private void visitorCreation() {
        System.out.print("Please insert the number of visitors : ");
        int numberOfVisitors = in.nextInt();
        in.nextLine();
        for (int i = 0; i < numberOfVisitors; i++) {
            System.out.printf("Enter name of visitor [%d] : ", i + 1);
            String name = in.nextLine();
            System.out.printf("Enter company name of visitor [%d] : ", i + 1);
            String company = in.nextLine();
            Visitor visitor = new Visitor(name, company);
            visitorList.add(visitor);
        }
    }

    private void viewVisitorTags() {
        String conference = "Conference";
        String visitor = "(Visitor)";
        for (Visitor element : visitorList) {
            System.out.printf("%n%s          %s%n", conference, element.getName());
            System.out.printf("%s           %s%n", visitor, element.getCompany());
        }
    }
}
