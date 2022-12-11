package org.example.residenceapp;

import org.example.residenceapp.batiment.Proprietaire;
import org.example.residenceapp.batiment.hotel.Hotel;
import org.example.residenceapp.batiment.hotel.utils.Etoile;
import org.example.residenceapp.batiment.immeuble.Immeuble;
import org.example.residenceapp.batiment.magasin.Magasin;
import org.example.residenceapp.batiment.magasin.instrument.corde.guitare.Guitare;
import org.example.residenceapp.batiment.magasin.instrument.corde.guitare.GuitareAcoustique;
import org.example.residenceapp.batiment.magasin.instrument.corde.guitare.utils.MainHabile;
import org.example.residenceapp.batiment.magasin.instrument.corde.guitare.utils.MateriauCordeGuitare;

public class Main {

    public static void main(String[] args) {

        // Implemeter tostring equals si besoin

        Immeuble im1 = new Immeuble("75000 Paris", 3040.0, new Proprietaire("w", "f"), 10);
        Immeuble im2 = new Immeuble("75000 Paris", 500.0, new Proprietaire("wa", "werf"), 10);
        Immeuble im3 = new Immeuble("75000 Paris", 8000.0, new Proprietaire("w", "f"), 15);

        Hotel h1 = new Hotel("", 123, new Proprietaire("w", "f"), 45, Etoile.CINQ);
        Hotel h2 = new Hotel("", 123, new Proprietaire("w", "f"), 45, Etoile.QUATRE);

        Magasin m = new Magasin("", 2345, new Proprietaire("w", "f"));

        Guitare f = new GuitareAcoustique("", 90, 100, "Marque", 80, 10, MateriauCordeGuitare.BOYAU, MainHabile.DROITIER, 2);

        m.addInstrument(f);

    }

}
