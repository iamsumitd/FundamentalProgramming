package com.company.Task2;

public class Card {

    private String senderName;

    public Card(String senderName) {
        this.senderName = senderName;
    }

    @Override
    public String toString() {
        return  "Sender: " + senderName + '\'';
    }

    public String getSenderName() {
        return senderName;
    }

}
