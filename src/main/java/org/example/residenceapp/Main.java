package org.example.residenceapp;

import org.example.residenceapp.batiment.Batiment;
import org.example.residenceapp.batiment.Maison;
import org.example.residenceapp.batiment.Proprietaire;
import org.example.residenceapp.batiment.bail.Locataire;
import org.example.residenceapp.batiment.bail.Location;
import org.example.residenceapp.batiment.hotel.*;
import org.example.residenceapp.batiment.hotel.utils.Etoile;
import org.example.residenceapp.batiment.immeuble.Appartement;
import org.example.residenceapp.batiment.immeuble.Immeuble;
import org.example.residenceapp.batiment.magasin.Magasin;
import org.example.residenceapp.batiment.magasin.instrument.corde.guitare.GuitareAcoustique;
import org.example.residenceapp.batiment.magasin.instrument.corde.guitare.utils.MainHabile;
import org.example.residenceapp.batiment.magasin.instrument.corde.guitare.utils.MateriauCordeGuitare;

import java.util.List;
import java.util.stream.Collectors;

public class Main {

    static Residence residence = new Residence();

    public static void main(String[] args) {

        application();

    }

    public static String description(Object o) {

        return o.toString();
    }

    public static void associationDUnBatimentEtUnProproetaire(Proprietaire proprietaire, Batiment batiment) {

        batiment.setProprietaire(proprietaire);

    }

    public static void location(Locataire locataire, Location location) {

        location.setLocataire(locataire);

    }

    public static List<Batiment> biensduProprietaire(Proprietaire proprietaire) {

        return residence.getBatiments()
                .stream()
                .filter(b -> b.getProprietaire().equals(proprietaire))
                .collect(Collectors.toList());
    }

    public static List<Appartement> appartementsLoues(Immeuble immeuble) {

        return immeuble.getAppartements()
                .stream()
                .filter(a -> a.getLocataire() != null)
                .collect(Collectors.toList());
    }

    public static List<Suite> suitesLoues(Hotel hotel) {

        return hotel.getSuites()
                .stream()
                .filter(s -> s.getLocataire() != null)
                .collect(Collectors.toList());
    }

    public static List<Chambre> chambresLoues(Hotel hotel) {

        return hotel.getChambres()
                .stream()
                .filter(c -> c.getLocataire() != null)
                .collect(Collectors.toList());
    }

    public static double impotLocal(Batiment batiment) {

        return batiment.getImpot();
    }


    public static void application() {

        Immeuble im1 = new Immeuble("75000 Paris", 3040.0, new Proprietaire("Xavier", "Paul"), 10);
        Immeuble im2 = new Immeuble("75000 Paris", 500.0, new Proprietaire("Soleiman", "Rabab"), 10);
        Immeuble im3 = new Immeuble("75000 Paris", 8000.0, new Proprietaire("Marc", "Jules"), 15);

        Maison m1 = new Maison("75000 Paris", 800.0, new Proprietaire("Seb", "Jules"), 5, 50);
        Maison m2 = new Maison("76000 Rouen", 50.0, new Proprietaire("Saul", "Fernandes"), 3, 58);
        Maison m3 = new Maison("76100 Saint Severs", 400.0, new Proprietaire("Chris", "Felix"), 4, 25);
        Maison m4 = new Maison("76800 Rouvray", 100.0, new Proprietaire("Seb", "Jules"), 8, 30);
        Maison m5 = new Maison("75000 Paris", 200.0, new Proprietaire("Seb", "Jules"), 10, 20);


        Hotel h1 = new Hotel("Orly", 409, new Proprietaire("Bastien", "Sass"), 45, Etoile.DEUX);
        Hotel h2 = new Hotel("Roissy", 240, new Proprietaire("Juliette", "Henroy"), 20, Etoile.DEUX);


        Hotel h3 = new Hotel("Nantes", 4000, new Proprietaire("Ben", "Soufiane"), 45, Etoile.CINQ);

        Piscine p1 = new Piscine();
        Piscine p2 = new Piscine();
        Piscine p3 = new Piscine();


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


        Hotel h4 = new Hotel("Rouen", 2400, new Proprietaire("Jups", "Fan"), 20, Etoile.QUATRE);

        for (int i = 0; i < 7; i++) {

            h4.addSpa(new Spa());
        }

        Magasin m = new Magasin("", 2345, new Proprietaire("w", "f"));

        GuitareAcoustique guitareAcoustique = new GuitareAcoustique("", 90, 100, "Marque", 80, 10, MateriauCordeGuitare.BOYAU, MainHabile.DROITIER, 2);

        GuitareAcoustique guitareAcoustique1 = new GuitareAcoustique("", 90, 100, "Marque", 80, 10, MateriauCordeGuitare.BOYAU, MainHabile.DROITIER, 2);


        m.addInstrument(guitareAcoustique);

        m.addInstrument(guitareAcoustique1);

        System.out.println("---------------------residence----------------------");


        System.out.println(residence);

    }

}
