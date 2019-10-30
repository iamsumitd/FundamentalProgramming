package com.company.Task2;
import java.util.ArrayList;

public class Card {

    public String senderName;
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
