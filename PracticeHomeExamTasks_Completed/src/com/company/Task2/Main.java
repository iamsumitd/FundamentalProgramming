package com.company.Task2;
import java.util.ArrayList;

//Please ignore the comments that don't seem relevant, they are just personal notes. However, the ones that are particularly mentioning something such as a question or a note may be relevant to the solution.

public class Main {

    public static void main(String[] args) {

        Main myApp = new Main();

        ArrayList<Card> cardsList = new ArrayList<>();
        HandDrawn sender1 = new HandDrawn("Anna", true);
        HandDrawn sender2 = new HandDrawn("Kalle", false);
        cardsList.add(0, sender1);
        cardsList.add(1, sender2);

        myApp.displayCardsInfo(cardsList);
        /*isNiceDrawing();*/
        /*System.out.println();
        sender1.toString();*/

    }

    public void displayCardsInfo(ArrayList<Card> cardList) {
        System.out.println("------- Christmas Card Info ------- " +"\n"+ cardList); //Why can't I call any other method from the Card class except the toString() method?

    }

}