package org.example.residenceapp.batiment.magasin.instrument.corde.piano;

import org.example.residenceapp.batiment.magasin.instrument.corde.InstrumentACorde;

public abstract class Piano extends InstrumentACorde {

    private int nombreTouche = 88;

    public Piano(String nom, double prixAchat, double prixVente, String marque, double longueur, double largeur, int nombreTouche) {
        super(nom, prixAchat, prixVente, marque, longueur, largeur);
        this.nombreTouche = nombreTouche;
    }

    public Piano(String nom, double prixAchat, double prixVente, String marque, double longueur, double largeur) {
        super(nom, prixAchat, prixVente, marque, longueur, largeur);

    }

    public int getNombreTouche() {
        return nombreTouche;
    }

    public void setNombreTouche(int nombreTouche) {
        this.nombreTouche = nombreTouche;
    }

    @Override
    public String toString() {
        return "\n" +
                "Piano {" +
                "\n" +
                super.toString() +
                "\n" +
                "nombreTouche = " + nombreTouche +
                "\n" +
                "} " +
                "\n";
    }
}
