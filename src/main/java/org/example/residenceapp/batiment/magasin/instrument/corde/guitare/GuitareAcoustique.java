package org.example.residenceapp.batiment.magasin.instrument.corde.guitare;

import org.example.residenceapp.batiment.magasin.instrument.corde.guitare.utils.MainHabile;
import org.example.residenceapp.batiment.magasin.instrument.corde.guitare.utils.MateriauCordeGuitare;

public class GuitareAcoustique extends Guitare {

    private MainHabile mainHabile;

    private int tirant;

    public GuitareAcoustique(){
        super();

    }

    public GuitareAcoustique(String nom, double prixAchat, double prixVente, String marque, double longueur, double largeur, MateriauCordeGuitare materiauCordeGuitare, MainHabile mainHabile, int tirant) {
        super(nom, prixAchat, prixVente, marque, longueur, largeur, materiauCordeGuitare);
        this.mainHabile = mainHabile;
        this.tirant = tirant;
    }

    public MainHabile getMainHabile() {
        return mainHabile;
    }

    public void setMainHabile(MainHabile mainHabile) {
        this.mainHabile = mainHabile;
    }

    public int getTirant() {
        return tirant;
    }

    public void setTirant(int tirant) {

        if (tirant >= 1 && tirant <= 3) {

            this.tirant = tirant;

        } else {

            System.out.println("Le tirant est compris entre 1 et 3.");
        }


    }

    @Override
    public String toString() {
        return "\n" +
                "GuitareAcoustique {" +
                "\n" +
                super.toString() +
                "\n" +
                "mainHabile = " + mainHabile +
                "\n" +
                " tirant = " + tirant +
                "\n" +
                "} " +
                "\n";
    }
}
