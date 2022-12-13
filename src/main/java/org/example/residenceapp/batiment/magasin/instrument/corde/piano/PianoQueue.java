package org.example.residenceapp.batiment.magasin.instrument.corde.piano;

import org.example.residenceapp.batiment.magasin.instrument.corde.piano.utils.TaillePianoQueue;

public class PianoQueue extends Piano {

    private TaillePianoQueue taille;

    public PianoQueue(String nom, double prixAchat, double prixVente, String marque, double longueur, double largeur, int nombreTouche,
                      TaillePianoQueue taille) {
        super(nom, prixAchat, prixVente, marque, longueur, largeur, nombreTouche);
        this.taille = taille;
    }

    public PianoQueue(String nom, double prixAchat, double prixVente, String marque, double longueur, double largeur,
                      TaillePianoQueue taille) {
        super(nom, prixAchat, prixVente, marque, longueur, largeur);
        this.taille = taille;
    }

    public TaillePianoQueue getTaille() {
        return taille;
    }

    public void setTaille(TaillePianoQueue taille) {
        this.taille = taille;
    }

    @Override
    public String toString() {
        return "PianoQueue{"+ super.toString() +
                "taille=" + taille +
                "} ";
    }
}
