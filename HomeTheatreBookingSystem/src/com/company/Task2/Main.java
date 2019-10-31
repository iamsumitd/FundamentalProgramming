package com.company.Task2;


import java.lang.reflect.Array;

import java.util.ArrayList;

public class Main {


    public ArrayList<Card> cardsList = new ArrayList<>();


    public static void main (String [] args){

        Main myApp = new Main();


        //myApp.printing(cardsList);

    }
    public void printAll (ArrayList<Card> cardArrayList){
        System.out.println(cardArrayList);

        HandDrawn sender1 = new HandDrawn("Anna", true);
        HandDrawn sender2 = new HandDrawn("Kalle", false);
        cardsList.add(0, sender1);
        cardsList.add(1, sender2);
    }


    public void printing(ArrayList<Card> cardsList) {
        System.out.println(cardsList);
    }
}

/*HandDrawn Anna = new HandDrawn(senderName="Anna", niceDrawing=true);
    HandDrawn Kalle = new HandDrawn(senderName="Kalle", niceDrawing=false);
*/

}


//public ArrayList<Card> cardsArray = new ArrayList<Card>();
//HandDrawn Anna = new HandDrawn(senderName="Anna", niceDrawing=true);
//    HandDrawn Kalle = new HandDrawn(senderName="Kalle", niceDrawing=false);

}


//public ArrayList<Card> cardsArray = new ArrayList<Card>();
//HandDrawn Anna = new HandDrawn(senderName="Anna", niceDrawing=true);
//    HandDrawn Kalle = new HandDrawn(senderName="Kalle", niceDrawing=false);

