package org.example.residenceapp.batiment;

import org.example.residenceapp.Impot;

public abstract class Batiment {

    private String adresse;
    private double surfaceHabitable;

    private Proprietaire proprietaire;

    public Batiment(String adresse, double surfaceHabitable, Proprietaire proprietaire) {

        this.adresse = adresse;
        this.surfaceHabitable = surfaceHabitable;
        this.proprietaire = proprietaire;
    }

    public double getSurfaceHabitable() {
        return surfaceHabitable;
    }

    public void setSurfaceHabitable(double surfaceHabitable) {
        this.surfaceHabitable = surfaceHabitable;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public Proprietaire getProprietaire() {
        return proprietaire;
    }

    public void setProprietaire(Proprietaire proprietaire) {
        this.proprietaire = proprietaire;
    }

    public double getImpot() {
        return Impot.TAUXA.getValue() * getSurfaceHabitable();
    }
}
