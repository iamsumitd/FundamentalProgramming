package com.company.Task2;

import java.awt.image.AreaAveragingScaleFilter;
import java.util.ArrayList;
import java.util.List;

public class Main {

    Main myApp = new Main();

    public static void main (String [] args){

        myApp.printAll();
    }
    public void printAll (ArrayList<Card> cardArrayList){
        System.out.println(cardArrayList);
    }

}
