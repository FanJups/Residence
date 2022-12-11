package org.example.residenceapp;

public enum Impot {

    TAUXA(5.6), TAUXB(1.5);

    private double value;


    private Impot(double value) {
        this.value = value;
    }

    public double getValue() {
        return value;
    }
}
