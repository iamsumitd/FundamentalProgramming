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

    public ArrayList<Card> cardsArray = new ArrayList<Card>();

    public ArrayList<Card> getCardsArray() {
        return cardsArray;
    }
}
