package com.company.Task2;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Main myApp = new Main();

        ArrayList<Card> cardsList = new ArrayList<>();
        HandDrawn sender1 = new HandDrawn("Anna", true);
        HandDrawn sender2 = new HandDrawn("Kalle", false);
        cardsList.add(0, sender1);
        cardsList.add(1, sender2);
        HandDrawn obj;

        myApp.displayCardsInfo(cardsList);


    }

    public void displayCardsInfo(ArrayList<Card> cardList) {
        System.out.println("Christmas Card Information:" + cardList.toString());

    }

}