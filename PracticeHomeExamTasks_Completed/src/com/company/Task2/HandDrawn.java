package com.company.Task2;

public class HandDrawn extends Card {

    public boolean niceDrawing;
    public HandDrawn(String senderName, boolean niceDrawing) {
        super(senderName);
        this.niceDrawing = niceDrawing;
    }

    public boolean isNiceDrawing() {
        return isNiceDrawing();
    }

    public void setNiceDrawing(boolean niceDrawing) {
        this.niceDrawing = niceDrawing;
    }

    @Override
    public String toString() {
        return "Sender Name: "+
                senderName + ", Nice Drawing? - " + niceDrawing +"\n";
    }
}


/*@Override
    public String toString(boolean isNiceDrawing, String isNice) {

        if (isNiceDrawing) {
            isNice = "Yes, it is a nice drawing";
        }
        else {
            isNice = "No, it's not nice";
        }
        return "HandDrawn{" + "" + isNice + '}';*/