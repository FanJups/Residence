package org.example.residenceapp.batiment.magasin.instrument.corde.piano.utils;

public enum TaillePianoQueue {


    QUATRE_SUR_QUATRE("4/4"),
    UN_SUR_DEUX("1/2"),
    UN_SUR_QUATRE("1/4"),
    CRAPAUD("Crapaud");


    private String notation;


    private TaillePianoQueue(String notation) {
        this.notation = notation;
    }


    public String getNotation() {
        return notation;
    }
}
