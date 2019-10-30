package com.company.Task2;

public class HandDrawn extends Card {

    public boolean niceDrawing;
    public HandDrawn(String senderName, boolean niceDrawing) {
        super(senderName);
        this.niceDrawing = niceDrawing;
    }

    public boolean isNiceDrawing() {
        return niceDrawing;
    }

    public void setNiceDrawing(boolean niceDrawing) {
        this.niceDrawing = niceDrawing;
    }

    HandDrawn Anna = new HandDrawn(senderName="Anna", niceDrawing=true);
    HandDrawn Kalle = new HandDrawn(senderName="Kalle", niceDrawing=false);


}
