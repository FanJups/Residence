package org.example.residenceapp;

import org.example.residenceapp.batiment.Batiment;
import org.example.residenceapp.batiment.Maison;
import org.example.residenceapp.batiment.Proprietaire;
import org.example.residenceapp.batiment.hotel.Hotel;
import org.example.residenceapp.batiment.hotel.Piscine;
import org.example.residenceapp.batiment.hotel.Spa;
import org.example.residenceapp.batiment.hotel.Suite;
import org.example.residenceapp.batiment.hotel.utils.Etoile;
import org.example.residenceapp.batiment.immeuble.Immeuble;
import org.example.residenceapp.batiment.magasin.Magasin;
import org.example.residenceapp.batiment.magasin.instrument.corde.guitare.Guitare;
import org.example.residenceapp.batiment.magasin.instrument.corde.guitare.GuitareAcoustique;
import org.example.residenceapp.batiment.magasin.instrument.corde.guitare.GuitareElectrique;
import org.example.residenceapp.batiment.magasin.instrument.corde.guitare.utils.MainHabile;
import org.example.residenceapp.batiment.magasin.instrument.corde.guitare.utils.MateriauCordeGuitare;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        // TODO: Implemeter tostring equals si besoin
        //TODO: Ne pas ajouter le meme objet 2 fois dans la liste



        //TODO: Continuer ici






        Batiment im1 = new Immeuble("75000 Paris", 3040.0, new Proprietaire("Xavier", "Paul"), 10);
        Batiment im2 = new Immeuble("75000 Paris", 500.0, new Proprietaire("Soleiman", "Rabab"), 10);
        Batiment im3 = new Immeuble("75000 Paris", 8000.0, new Proprietaire("Marc", "Jules"), 15);

        Batiment m1 = new Maison("75000 Paris", 800.0, new Proprietaire("Seb", "Jules"), 5,50);
        Batiment m2 = new Maison("75000 Paris", 50.0, new Proprietaire("Seb", "Jules"), 3,58);
        Batiment m3 = new Maison("75000 Paris", 400.0, new Proprietaire("Seb", "Jules"), 4,25);
        Batiment m4 = new Maison("75000 Paris", 100.0, new Proprietaire("Seb", "Jules"), 8,30);
        Batiment m5 = new Maison("75000 Paris", 200.0, new Proprietaire("Seb", "Jules"), 10,20);


        Hotel h1 = new Hotel("Orly", 409, new Proprietaire("Bastien", "Sass"), 45, Etoile.DEUX);
        Hotel h2 = new Hotel("Roissy", 240, new Proprietaire("Juliette", "Henroy"), 20, Etoile.DEUX);



        Hotel h3 = new Hotel("Nantes", 4000, new Proprietaire("Ben", "Soufiane"), 45, Etoile.CINQ);

        Piscine p1 =new Piscine();
        Piscine p2 =new Piscine();
        Piscine p3 =new Piscine();

        h3.addPiscine(p1);
        h3.addPiscine(p2);
        h3.addPiscine(p3);

        Suite s1 = new Suite();
        Suite s2 = new Suite();
        Suite s3 = new Suite();
        Suite s4 = new Suite();
        Suite s5 = new Suite();

        h3.addSuite(s1);
        h3.addSuite(s2);
        h3.addSuite(s3);
        h3.addSuite(s4);
        h3.addSuite(s5);

        System.out.println(h3);



        Hotel h4 = new Hotel("Rouen", 2400, new Proprietaire("Jups", "Fan"), 20, Etoile.QUATRE);

        for(int i=0;i<7;i++){

            h4.addSpa(new Spa());
        }

        Magasin m = new Magasin("", 2345, new Proprietaire("w", "f"));

        Guitare f = new GuitareAcoustique("", 90, 100, "Marque", 80, 10, MateriauCordeGuitare.BOYAU, MainHabile.DROITIER, 2);

        Guitare f1 = new GuitareAcoustique("", 90, 100, "Marque", 80, 10, MateriauCordeGuitare.BOYAU, MainHabile.DROITIER, 2);


        m.addInstrument(f);

        m.addInstrument(f1);




    }

}
