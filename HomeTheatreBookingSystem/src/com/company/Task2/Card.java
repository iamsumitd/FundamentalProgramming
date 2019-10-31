package com.company.Task2;

public class Card {

    private String senderName;

    public Card(String senderName) {
        this.senderName = senderName;
    }

    public String getSenderName() {
        return senderName;
    }


    @Override
    public String toString() {
        return "Card{" +
                "senderName='" + senderName + '\'' +
                ", Anna=" + Anna +
                ", Kalle=" + Kalle +
                '}';
    }

    HandDrawn Anna = new HandDrawn(senderName="Anna", niceDrawing=true);
    HandDrawn Kalle = new HandDrawn(senderName="Kalle", niceDrawing=false);

}
