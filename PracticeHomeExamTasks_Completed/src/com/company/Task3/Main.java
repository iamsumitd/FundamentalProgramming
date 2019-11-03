package com.company.Task3;

import java.util.Scanner;

public class Main {

    public static void main (String[] args) {

        Main myApp = new Main();

        Scanner input = new Scanner(System.in);
        System.out.println("----Christmas presents label program----");
        System.out.print("Enter the sender's initials: ");
        String sender = input.nextLine();
        System.out.print("Enter the recipient's initials: ");
        String recipient = input.nextLine();

        String a = myApp.presentLabel(sender, recipient);
        System.out.println(a);
    }

    private String presentLabel (String sender, String recipient){
        return "Here's your label"+"\n"+
                "**************"+"\n"+
                "* From: "+sender+" *"+"\n"+
                "* To  : "+recipient+" *"+"\n"+
                "**************";
    }

}