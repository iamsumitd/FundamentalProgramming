package com.company.Task2;

public class Card {

    public String senderName;

    public Card(String senderName) {
        this.senderName = senderName;
    }

    @Override
    public String toString() {
        return  "Sender: " + senderName + '\'' ;
    }

    public String getSenderName() {
        return senderName;
    }

    /*public String output (boolean niceDrawing){

        toString();
        if (niceDrawing)
            System.out.print("Yes, this is a nice drawing");
        else System.out.print("No, this is not a nice drawing");
        return toString()+ niceDrawing;
    }*/

}
