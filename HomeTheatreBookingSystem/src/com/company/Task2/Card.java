package com.company.Task2;

public class Card {

    private String senderName;

    public Card(String senderName) {
        this.senderName = senderName;
    }

    public String getSenderName() {
        return senderName;
    }
<<<<<<< HEAD
=======

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
<<<<<<< HEAD
>>>>>>> a875eea3b625800521ff0038ba0ec700f12fd7ba
=======
>>>>>>> a875eea3b625800521ff0038ba0ec700f12fd7ba
}
