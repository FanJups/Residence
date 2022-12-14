package org.example.residenceapp.batiment.magasin.instrument.corde;

import org.example.residenceapp.batiment.magasin.instrument.Instrument;

public abstract class InstrumentACorde extends Instrument {

    private double longueur;
    private double largeur;


    public InstrumentACorde(String nom, double prixAchat, double prixVente, String marque, double longueur, double largeur) {

        super(nom, prixAchat, prixVente, marque);
        this.longueur = longueur;
        this.largeur = largeur;
    }

    public double getLongueur() {
        return longueur;
    }

    public void setLongueur(double longueur) {
        this.longueur = longueur;
    }

    public double getLargeur() {
        return largeur;
    }

    public void setLargeur(double largeur) {
        this.largeur = largeur;
    }

    @Override
    public String toString() {
        return "\n" +
                "InstrumentACorde {" +
                "\n" +
                super.toString() +
                "\n" +
                "longueur = " + longueur +
                "\n" +
                " largeur = " + largeur +
                "\n" +
                "} " +
                "\n";
    }
}
