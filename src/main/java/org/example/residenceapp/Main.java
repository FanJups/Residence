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
import org.example.residenceapp.batiment.magasin.instrument.Instrument;
import org.example.residenceapp.batiment.magasin.instrument.corde.guitare.Guitare;
import org.example.residenceapp.batiment.magasin.instrument.corde.guitare.GuitareAcoustique;
import org.example.residenceapp.batiment.magasin.instrument.corde.guitare.GuitareElectrique;
import org.example.residenceapp.batiment.magasin.instrument.corde.guitare.utils.MainHabile;
import org.example.residenceapp.batiment.magasin.instrument.corde.guitare.utils.MateriauCordeGuitare;
import org.example.residenceapp.batiment.magasin.instrument.corde.piano.Piano;
import org.example.residenceapp.batiment.magasin.instrument.corde.piano.PianoDroit;
import org.example.residenceapp.batiment.magasin.instrument.corde.piano.PianoNumerique;
import org.example.residenceapp.batiment.magasin.instrument.corde.piano.PianoQueue;
import org.example.residenceapp.batiment.magasin.instrument.corde.piano.utils.TaillePianoQueue;
import org.example.residenceapp.batiment.magasin.instrument.corde.piano.utils.TypeCordesPianoDroit;
import org.example.residenceapp.batiment.magasin.instrument.vent.Clarinette;
import org.example.residenceapp.batiment.magasin.instrument.vent.FluteTraversiere;
import org.example.residenceapp.batiment.magasin.instrument.vent.Hautbois;
import org.example.residenceapp.batiment.magasin.instrument.vent.InstrumentAVent;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

    static Residence residence = new Residence();

    public static void main(String[] args) {


        menu();

        //application();

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

        return Residence.getBatiments()
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

        List<Immeuble> l = new ArrayList<>();


        Immeuble im4 = new Immeuble("75000 Paris", 3040.0, new Proprietaire("Xavier", "Paul"), 10);

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

    public static void menu() {

        List<Batiment> batiments = new ArrayList<>();

        List<Instrument> instruments = new ArrayList<>();

        boolean quitterMenu = false;

        while (!quitterMenu) {

            System.out.println("Menu");

            System.out.println("1 : Création de bâtiments");

            System.out.println("2 : Description des bâtiments");

            System.out.println("3 : Création d'instruments musicaux");

            System.out.println("4 : Description d'instruments musicaux");

            System.out.println("5 : Association d'un locataire à un bien en location");

            System.out.println("6 : Liste des biens d'un propriétaire");

            System.out.println("7 : Liste des appartements loués");

            System.out.println("8 : Liste des chambres/suites disponibles");

            System.out.println("9 : Impôt local");

            System.out.println("0 : Fin :) !");

            Scanner sc = new Scanner(System.in);

            String optionString;

            do {
                System.out.println("Faites votre choix en entrant une valeur comprise entre  0 et 9");

                optionString = sc.nextLine();

            } while (!validationStringVersInt(optionString, 0, 9));

            int option = Integer.parseInt(optionString.trim());

            switch (option) {

                case 0:
                    System.out.println("Au plaisir de vous revoir :) !");
                    quitterMenu = true;
                    break;

                case 1:

                    System.out.println("Avec ou Sans Propriétaire ?");

                    System.out.println("1 : Sans");

                    System.out.println("2 : Avec");

                    String proprioString;

                    do {
                        System.out.println("Faites votre choix en entrant une valeur comprise entre  1 et 2");

                        proprioString = sc.nextLine();

                    } while (!validationStringVersInt(proprioString, 1, 2));


                    int proprioAvecOuSans = Integer.parseInt(proprioString);

                    switch (proprioAvecOuSans) {

                        case 1:

                            System.out.println("Sans Propriétaire");

                            menuCreationBatiment(batiments, sc);

                            break;

                        case 2:
                            //Avec Proprio

                            System.out.println("Avec Propriétaire");

                            String nom;

                            String prenom;


                            boolean nomCorrect = true;

                            do {


                                System.out.println("Nom du propriétaire :");

                                nom = sc.nextLine();

                                if (nom.trim().isEmpty()) {

                                    nomCorrect = false;

                                    System.out.println("Entrez un nom correct");
                                } else {

                                    nomCorrect = true;
                                }


                            } while (!nomCorrect);

                            boolean prenomCorrect = true;

                            do {


                                System.out.println("Prénom du propriétaire :");

                                prenom = sc.nextLine();

                                if (prenom.trim().isEmpty()) {

                                    prenomCorrect = false;

                                    System.out.println("Entrez un prénom correct");
                                } else {

                                    prenomCorrect = true;
                                }


                            } while (!prenomCorrect);


                            Proprietaire proprietaire = new Proprietaire(nom, prenom);

                            menuCreationBatiment(batiments, sc, proprietaire);


                            break;


                    }

                    break;


                case 2:

                    System.out.println("Description des bâtiments");

                    if (batiments.size() > 0) {

                        batiments.stream().forEach(System.out::println);

                    } else {

                        System.out.println("S'il vous plaît, veuillez créer au moins un bâtiment pour avoir la description.");

                    }


                    break;

                case 3:

                    System.out.println("Instruments à cordes ou vent ?");

                    System.out.println("1 : Instruments à cordes");

                    System.out.println("2 : Instruments à vent");

                    String instruString;

                    do {
                        System.out.println("Faites votre choix en entrant une valeur comprise entre  1 et 2");

                        instruString = sc.nextLine();

                    } while (!validationStringVersInt(instruString, 1, 2));


                    int instru = Integer.parseInt(instruString);

                    switch (instru) {

                        case 1:

                            System.out.println("Instruments à cordes");

                            System.out.println("Piano ou Guitare ?");

                            System.out.println("1 : Piano");

                            System.out.println("2 : Guitare");

                            String instruCordeString;

                            do {
                                System.out.println("Faites votre choix en entrant une valeur comprise entre  1 et 2");

                                instruCordeString = sc.nextLine();

                            } while (!validationStringVersInt(instruCordeString, 1, 2));

                            int instruCorde = Integer.parseInt(instruCordeString);

                            switch (instruCorde) {

                                case 1:

                                    System.out.println("Piano");

                                    System.out.println("1 : Piano à queue");

                                    System.out.println("2 : Piano droit");

                                    System.out.println("3 : Piano numérique");



                                    String instruCordePianoString;

                                    do {
                                        System.out.println("Faites votre choix en entrant une valeur comprise entre  1 et 3");

                                        instruCordePianoString = sc.nextLine();

                                    } while (!validationStringVersInt(instruCordePianoString, 1, 3));

                                    int instruCordePiano = Integer.parseInt(instruCordePianoString);

                                    switch (instruCordePiano) {

                                        case 1:
                                            System.out.println("Piano à queue");

                                            //PianoQueue(String nom, double prixAchat, double prixVente, String marque, double longueur, double largeur, int nombreTouche,
                                            //                      TaillePianoQueue taille)

                                            // public PianoQueue(String nom, double prixAchat, double prixVente, String marque, double longueur, double largeur,
                                            //                      TaillePianoQueue taille)


                                            System.out.println("1 : Nombre de touches par défaut: 88");

                                            System.out.println("2 : Nombre de touches personnalisé");

                                            String instruCordePianoQueueString;

                                            do {
                                                System.out.println("Faites votre choix en entrant une valeur comprise entre  1 et 2");

                                                instruCordePianoQueueString = sc.nextLine();

                                            } while (!validationStringVersInt(instruCordePianoQueueString, 1, 2));

                                            int instruCordePianoQueue = Integer.parseInt(instruCordePianoQueueString);

                                            switch (instruCordePianoQueue) {

                                                case 1:

                                                    // public PianoQueue(String nom, double prixAchat, double prixVente, String marque, double longueur, double largeur,
                                                    //                      TaillePianoQueue taille)

                                                    System.out.println("Nombre de touches par défaut: 88");

                                                    PianoQueue pianoQueue1 = new PianoQueue();


                                                    menuCreationPiano(pianoQueue1, sc);

                                                    System.out.println("Taille:");

                                                    System.out.println("1: 4/4");

                                                    System.out.println("2: 1/2");

                                                    System.out.println("3: 1/4");

                                                    System.out.println("4: Crapaud");


                                                    String tailleString;


                                                    do {
                                                        System.out.println("Faites votre choix en entrant une valeur comprise entre  1 et 4");

                                                        tailleString = sc.nextLine();

                                                    } while (!validationStringVersInt(tailleString, 1, 4));


                                                    int tailleInt = Integer.parseInt(tailleString);


                                                    TaillePianoQueue taillePianoQueue = mapTaillePianoQueue(tailleInt);

                                                    pianoQueue1.setTaille(taillePianoQueue);

                                                    instruments.add(pianoQueue1);

                                                    break;

                                                case 2:

                                                    //PianoQueue(String nom, double prixAchat, double prixVente, String marque, double longueur, double largeur, int nombreTouche,
                                                    //                      TaillePianoQueue taille)

                                                    System.out.println("Nombre de touches personnalisé");

                                                    PianoQueue pianoQueue2 = new PianoQueue();


                                                    menuCreationPianoNbreTouchePeronnalise(pianoQueue2, sc);


                                                    System.out.println("Taille:");

                                                    System.out.println("1: 4/4");

                                                    System.out.println("2: 1/2");

                                                    System.out.println("3: 1/4");

                                                    System.out.println("4: Crapaud");


                                                    String tailleString2;


                                                    do {
                                                        System.out.println("Faites votre choix en entrant une valeur comprise entre  1 et 4");

                                                        tailleString2 = sc.nextLine();

                                                    } while (!validationStringVersInt(tailleString2, 1, 4));


                                                    int tailleInt2 = Integer.parseInt(tailleString2);


                                                    TaillePianoQueue taillePianoQueue2 = mapTaillePianoQueue(tailleInt2);

                                                    pianoQueue2.setTaille(taillePianoQueue2);

                                                    System.out.println(pianoQueue2);

                                                    instruments.add(pianoQueue2);


                                                    break;
                                            }


                                            break;

                                        case 2:


                                            System.out.println("Piano droit");


                                            System.out.println("1 : Nombre de touches par défaut: 88");

                                            System.out.println("2 : Nombre de touches personnalisé");

                                            String instruCordePianoDroitString;

                                            do {
                                                System.out.println("Faites votre choix en entrant une valeur comprise entre  1 et 2");

                                                instruCordePianoDroitString = sc.nextLine();

                                            } while (!validationStringVersInt(instruCordePianoDroitString, 1, 2));

                                            int instruCordePianoDroit = Integer.parseInt(instruCordePianoDroitString);

                                            switch (instruCordePianoDroit){

                                                case 1:
                                                    //PianoDroit(String nom, double prixAchat, double prixVente, String marque, double longueur, double largeur,
                                                    //                      TypeCordesPianoDroit typeCordesPianoDroit, boolean etreDoteSilencieux) {

                                                    System.out.println("Nombre de touches par défaut: 88");

                                                    PianoDroit pianoDroit1 = new PianoDroit();


                                                    menuCreationPiano(pianoDroit1, sc);

                                                    System.out.println("Type de cordes:");

                                                    System.out.println("1: DROITES");

                                                    System.out.println("2: CROISEES");


                                                    String typeCordePianoDroitString;


                                                    do {
                                                        System.out.println("Faites votre choix en entrant une valeur comprise entre  1 et 2");

                                                        typeCordePianoDroitString = sc.nextLine();

                                                    } while (!validationStringVersInt(typeCordePianoDroitString, 1, 2));


                                                    int typeCordePianoDroitInt = Integer.parseInt(typeCordePianoDroitString);


                                                    TypeCordesPianoDroit typeCordesPianoDroit = mapTypeCordesPianoDroit(typeCordePianoDroitInt);

                                                    pianoDroit1.setTypeCordesPianoDroit(typeCordesPianoDroit);


                                                    System.out.println("Doté d'un silencieux:");

                                                    System.out.println("1: OUI");

                                                    System.out.println("2: NON");


                                                    String doteSilencieuxPianoDroitString;


                                                    do {
                                                        System.out.println("Faites votre choix en entrant une valeur comprise entre  1 et 2");

                                                        doteSilencieuxPianoDroitString = sc.nextLine();

                                                    } while (!validationStringVersInt(doteSilencieuxPianoDroitString, 1, 2));


                                                    int doteSilencieuxPianoDroitInt = Integer.parseInt(doteSilencieuxPianoDroitString);


                                                    boolean etreDoteSilencieuxPianoDroit = mapToBoolean(doteSilencieuxPianoDroitInt);

                                                    pianoDroit1.setEtreDoteSilencieux(etreDoteSilencieuxPianoDroit);


                                                    instruments.add(pianoDroit1);

                                                    break;


                                                case 2:
                                                    //PianoDroit(String nom, double prixAchat, double prixVente, String marque, double longueur, double largeur, int nombreTouche,
                                                    //                      TypeCordesPianoDroit typeCordesPianoDroit, boolean etreDoteSilencieux) {
                                                    System.out.println("Nombre de touches personnalisé");



                                                    PianoDroit pianoDroit2 = new PianoDroit();

                                                    menuCreationPianoNbreTouchePeronnalise(pianoDroit2,sc);

                                                    System.out.println("Type de cordes:");

                                                    System.out.println("1: DROITES");

                                                    System.out.println("2: CROISEES");


                                                    String typeCordePianoDroit2String;


                                                    do {
                                                        System.out.println("Faites votre choix en entrant une valeur comprise entre  1 et 2");

                                                        typeCordePianoDroit2String = sc.nextLine();

                                                    } while (!validationStringVersInt(typeCordePianoDroit2String, 1, 2));


                                                    int typeCordePianoDroit2Int = Integer.parseInt(typeCordePianoDroit2String);


                                                    TypeCordesPianoDroit typeCordesPianoDroit2 = mapTypeCordesPianoDroit(typeCordePianoDroit2Int);

                                                    pianoDroit2.setTypeCordesPianoDroit(typeCordesPianoDroit2);

                                                    System.out.println("Doté d'un silencieux:");

                                                    System.out.println("1: OUI");

                                                    System.out.println("2: NON");

                                                    String doteSilencieuxPianoDroit2String;


                                                    do {
                                                        System.out.println("Faites votre choix en entrant une valeur comprise entre  1 et 2");

                                                        doteSilencieuxPianoDroit2String = sc.nextLine();

                                                    } while (!validationStringVersInt(doteSilencieuxPianoDroit2String, 1, 2));


                                                    int doteSilencieuxPianoDroit2Int = Integer.parseInt(doteSilencieuxPianoDroit2String);


                                                    boolean etreDoteSilencieuxPianoDroit2 = mapToBoolean(doteSilencieuxPianoDroit2Int);

                                                    pianoDroit2.setEtreDoteSilencieux(etreDoteSilencieuxPianoDroit2);

                                                    instruments.add(pianoDroit2);


                                                    break;
                                            }


                                            break;


                                        case 3:


                                            System.out.println("Piano numérique");


                                            System.out.println("1 : Nombre de touches par défaut: 88");

                                            System.out.println("2 : Nombre de touches personnalisé");

                                            String instruCordePianoNumString;

                                            do {
                                                System.out.println("Faites votre choix en entrant une valeur comprise entre  1 et 2");

                                                instruCordePianoNumString = sc.nextLine();

                                            } while (!validationStringVersInt(instruCordePianoNumString, 1, 2));

                                            int instruCordePianoNum = Integer.parseInt(instruCordePianoNumString);

                                            switch (instruCordePianoNum){

                                                case 1:

                                                    //  public PianoNumerique(String nom, double prixAchat, double prixVente, String marque, double longueur, double largeur, boolean avoirToucherLourd, int qualiteEchantillonnage)
                                                    System.out.println("Nombre de touches par défaut: 88");

                                                    PianoNumerique pianoNumerique1 = new PianoNumerique();

                                                    menuCreationPiano(pianoNumerique1, sc);

                                                    System.out.println("Avec toucher lourd:");

                                                    System.out.println("1: OUI");

                                                    System.out.println("2: NON");


                                                    String typeToucherLourdString;


                                                    do {
                                                        System.out.println("Faites votre choix en entrant une valeur comprise entre  1 et 2");

                                                        typeToucherLourdString = sc.nextLine();

                                                    } while (!validationStringVersInt(typeToucherLourdString, 1, 2));


                                                    int typeToucherLourdInt = Integer.parseInt(typeToucherLourdString);


                                                    boolean toucherLourd = mapToBoolean(typeToucherLourdInt);

                                                    pianoNumerique1.setAvoirToucherLourd(toucherLourd);


                                                    System.out.println("Qualité d'échantillonnage:");

                                                    System.out.println("1: 1");

                                                    System.out.println("2: 2");

                                                    System.out.println("3: 3");


                                                    String qualiteEchantillonnageString;


                                                    do {
                                                        System.out.println("Faites votre choix en entrant une valeur comprise entre  1 et 3");

                                                        qualiteEchantillonnageString = sc.nextLine();

                                                    } while (!validationStringVersInt(qualiteEchantillonnageString, 1, 3));


                                                    int qualiteEchantillonnageInt = Integer.parseInt(qualiteEchantillonnageString);

                                                    pianoNumerique1.setQualiteEchantillonnage(qualiteEchantillonnageInt);


                                                    instruments.add(pianoNumerique1);

                                                    break;

                                                case 2:
                                                    //  public PianoNumerique(String nom, double prixAchat, double prixVente, String marque, double longueur, double largeur, int nombreTouche, boolean avoirToucherLourd, int qualiteEchantillonnage) {

                                                    System.out.println("Nombre de touches personnalisé");

                                                    PianoNumerique pianoNumerique2 = new PianoNumerique();

                                                    menuCreationPianoNbreTouchePeronnalise(pianoNumerique2, sc);

                                                    System.out.println("Avec toucher lourd:");

                                                    System.out.println("1: OUI");

                                                    System.out.println("2: NON");


                                                    String typeToucherLourdString2;


                                                    do {
                                                        System.out.println("Faites votre choix en entrant une valeur comprise entre  1 et 2");

                                                        typeToucherLourdString2 = sc.nextLine();

                                                    } while (!validationStringVersInt(typeToucherLourdString2, 1, 2));


                                                    int typeToucherLourdInt2 = Integer.parseInt(typeToucherLourdString2);


                                                    boolean toucherLourd2 = mapToBoolean(typeToucherLourdInt2);

                                                    pianoNumerique2.setAvoirToucherLourd(toucherLourd2);


                                                    System.out.println("Qualité d'échantillonnage:");

                                                    System.out.println("1: 1");

                                                    System.out.println("2: 2");

                                                    System.out.println("3: 3");


                                                    String qualiteEchantillonnageString2;


                                                    do {
                                                        System.out.println("Faites votre choix en entrant une valeur comprise entre  1 et 3");

                                                        qualiteEchantillonnageString2 = sc.nextLine();

                                                    } while (!validationStringVersInt(qualiteEchantillonnageString2, 1, 3));


                                                    int qualiteEchantillonnageInt2 = Integer.parseInt(qualiteEchantillonnageString2);

                                                    pianoNumerique2.setQualiteEchantillonnage(qualiteEchantillonnageInt2);


                                                    instruments.add(pianoNumerique2);

                                                    break;

                                            }


                                            break;
                                    }


                                    break;

                                case 2:
                                    System.out.println("Guitare");

                                    System.out.println("1 : Guitare acoustique");

                                    System.out.println("2 : Guitare électrique");

                                    String instruCordeGuitareString;

                                    do {
                                        System.out.println("Faites votre choix en entrant une valeur comprise entre  1 et 2");

                                        instruCordeGuitareString = sc.nextLine();

                                    } while (!validationStringVersInt(instruCordeGuitareString, 1, 2));

                                    int instruCordeGuitare = Integer.parseInt(instruCordeGuitareString);

                                    switch (instruCordeGuitare) {

                                        case 1:
                                            System.out.println("Guitare acoustique");

                                            GuitareAcoustique guitareAcoustique = new GuitareAcoustique();

                                            menuCreationGuitareAcoustique(guitareAcoustique,sc);

                                            instruments.add(guitareAcoustique);

                                            break;


                                        case 2:


                                            System.out.println("Guitare électrique");

                                            GuitareElectrique guitareElectrique = new GuitareElectrique();

                                            menuCreationGuitareElectrique(guitareElectrique,sc);

                                            instruments.add(guitareElectrique);

                                            break;


                                    }

                                    break;


                            }

                            break;


                        case 2:
                            System.out.println("Instruments à vent");

                            System.out.println("1 : Hautbois");

                            System.out.println("2 : Clarinette");

                            System.out.println("3 : Flûte traversière");

                            String instruVentString;

                            do {
                                System.out.println("Faites votre choix en entrant une valeur comprise entre  1 et 3");

                                instruVentString = sc.nextLine();

                            } while (!validationStringVersInt(instruVentString, 1, 3));

                            int instruVent = Integer.parseInt(instruVentString);

                            switch (instruVent) {

                                case 1:
                                    System.out.println("Hautbois");

                                    String nom = null,marque = null;
                                    double prixAchat = 0,prixVente = 0;

                                    Hautbois h = new Hautbois();

                                    menuCreationInstrumentVent(nom,prixAchat,prixVente,marque,sc,h);

                                    Hautbois hautbois = new Hautbois(h.getNom(),h.getPrixAchat(),h.getPrixVente(),h.getMarque());

                                    instruments.add(hautbois);


                                    break;


                                case 2:

                                    System.out.println("Clarinette");

                                    String nom2 = null,marque2 = null;
                                    double prixAchat2 = 0,prixVente2 = 0;

                                    Clarinette c = new Clarinette();

                                    menuCreationInstrumentVent(nom2,prixAchat2,prixVente2,marque2,sc,c);


                                    Clarinette clarinette = new Clarinette(c.getNom(),c.getPrixAchat(),c.getPrixVente(),c.getMarque());

                                    instruments.add(clarinette);

                                    break;


                                case 3:

                                    System.out.println("Flûte traversière");

                                    String nom3 = null,marque3 = null;
                                    double prixAchat3 = 0,prixVente3 = 0;

                                    FluteTraversiere f = new FluteTraversiere();

                                    menuCreationInstrumentVent(nom3,prixAchat3,prixVente3,marque3,sc,f);

                                    FluteTraversiere fluteTraversiere = new  FluteTraversiere(f.getNom(),f.getPrixAchat(),f.getPrixVente(),f.getMarque());

                                    instruments.add(fluteTraversiere);

                                    break;
                            }


                            break;


                    }

                    break;


                case 4:

                    System.out.println("Description d'instruments musicaux");

                    if (instruments.size() > 0) {

                        instruments.stream().forEach(System.out::println);

                    } else {

                        System.out.println("S'il vous plaît, veuillez créer au moins un instrument pour avoir la description.");

                    }
                    break;

                case 5:

                    System.out.println("5 : Association d'un locataire à un bien en location");

                    if(batiments.size()==0){

                        System.out.println("S'il vous plaît, veuillez créer au moins un immeuble ou hôtel pour effectuer cette opération.");

                    }else{

                        int nbreHotel=0;
                        int nbreIms=0;

                        for (Batiment batiment : batiments) {

                            if(batiment instanceof Hotel){
                                nbreHotel++;
                            }

                            if(batiment instanceof Immeuble){
                                nbreIms++;

                            }

                        }

                        if(nbreIms==0 && nbreHotel==0){

                            System.out.println(" La liste de bâtiments ne contient aucun immeuble ou hôtel. S'il vous plaît, veuillez créer au moins un immeuble ou hôtel pour effectuer cette opération.");

                        }else{

                            if(nbreIms!=0 && nbreHotel==0){

                                System.out.println(" La liste de bâtiments ne contient aucun hôtel donc impossible d'y associer un locataire à une chambre ou suite. S'il vous plaît, veuillez créer au moins un hôtel si besoin.");

                                System.out.println(" Par contre il y'a x immeubles donc c'est possible uniquement dans ce cas.");


                            }

                            if(nbreIms==0 && nbreHotel!=0){

                                System.out.println(" La liste de bâtiments ne contient aucun immeuble donc impossible d'y associer un locataire à un appartement. S'il vous plaît, veuillez créer au moins un immeuble si besoin.");

                                System.out.println(" Par contre il y'a x hôtels donc c'est possible uniquement dans ce cas.");



                            }

                            if(nbreIms!=0 && nbreHotel!=0){


                            }

                        }


                    }

                    break;

                case 6:
                    break;

                case 7:
                    break;


                case 8:
                    break;

                case 9:
                    break;


                default:
                    System.out.println("Mauvaise option, s'il vous plaît veuillez choisir une bonne option.");


            }


        }

    }



    public static boolean validationStringVersInt(String nbre, int min, int max) {
        boolean validation = false;

        int entier = 0;

        if (isNombre(nbre)) {

            String nbreSansEspaces = nbre.trim();

            entier = Integer.parseInt(nbreSansEspaces);

            if (entier >= min && entier <= max) {
                // correct

                validation = true;

            } else {

                System.out.println("Veuillez entrer une valeur entre " + min + " et " + max);

            }

        } else {

            // Ce n'est pas un nombre

            System.out.println("Veuillez entrer un nombre");

        }

        return validation;
    }

    static boolean isNombre(String nbre) {

        boolean presenceEspace = false;

        boolean validation = false;

        if (nbre != null) {
            String nbreTrim = nbre.trim();

            if (nbreTrim.length() != 0) {

                for (int i = 0; i < nbreTrim.length(); i++) {

                    if (nbreTrim.charAt(i) == ' ') {

                        presenceEspace = true;

                        break;
                    }
                } // for

                if (!presenceEspace) {

                    int compteurChiffresCorrects = 0;

                    for (int j = 0; j < nbreTrim.length(); j++) {

                        String nbreTrimString = nbreTrim.charAt(j) + "";

                        if (nbreTrimString.equals("0") || nbreTrimString.equals("1") || nbreTrimString.equals("2")
                                || nbreTrimString.equals("3") || nbreTrimString.equals("4")
                                || nbreTrimString.equals("5") || nbreTrimString.equals("6")
                                || nbreTrimString.equals("7") || nbreTrimString.equals("8")
                                || nbreTrimString.equals("9")) {
                            // Correct

                            compteurChiffresCorrects++;

                            if (compteurChiffresCorrects == nbreTrim.length()) {

                                validation = true;
                            }

                        } else {
                            // Présence d'un intrus

                            validation = false;

                            break;
                        }

                    } // for

                } else {
                    // Rien faire car espace présent
                }

            } else {

            }
        } else {

        }

        return validation;
    }

    private static Etoile map(int i) {

        if (i == 1)
            return Etoile.UN;

        if (i == 2)
            return Etoile.DEUX;

        if (i == 3)
            return Etoile.TROIS;


        if (i == 4)
            return Etoile.QUATRE;


        return Etoile.CINQ;


    }

    private static TaillePianoQueue mapTaillePianoQueue(int i) {

        if (i == 1)
            return TaillePianoQueue.QUATRE_SUR_QUATRE;

        if (i == 2)
            return TaillePianoQueue.UN_SUR_DEUX;

        if (i == 3)
            return TaillePianoQueue.UN_SUR_QUATRE;


        return TaillePianoQueue.CRAPAUD;


    }


    private static TypeCordesPianoDroit mapTypeCordesPianoDroit(int i) {

        if (i == 1)
            return TypeCordesPianoDroit.DROITES;


        return TypeCordesPianoDroit.CROISEES;


    }

    private static MainHabile mapMainHabile(int i) {

        if (i == 1)
            return MainHabile.GAUCHER;


        return MainHabile.DROITIER;

    }


    private static MateriauCordeGuitare mapMateriauCordeGuitare(int i) {

        if(i==1)
            return MateriauCordeGuitare.BOYAU;

        if(i==2)
            return MateriauCordeGuitare.NYLON;

        if(i==3)
            return MateriauCordeGuitare.FER;

        if(i==4)
            return MateriauCordeGuitare.NICKEL;

        if(i==5)
            return MateriauCordeGuitare.BRONZE;

        if(i==6)
            return MateriauCordeGuitare.CUIVRE;

        if(i==7)
            return MateriauCordeGuitare.OR;


        return MateriauCordeGuitare.SILICONE;

    }

    private static boolean mapToBoolean(int i) {

        if (i == 1)
            return true;


        return false;


    }

    private static void menuCreationBatiment(List<Batiment> batiments, Scanner sc) {


        System.out.println("Quel type de bâtiment ?");

        System.out.println("1 : Hôtel");

        System.out.println("2 : Maison");

        System.out.println("3 : Immeuble");

        System.out.println("4 : Magasin");

        String type;

        do {
            System.out.println("Faites votre choix en entrant une valeur comprise entre  1 et 4");

            type = sc.nextLine();

        } while (!validationStringVersInt(type, 1, 4));


        int typeInt = Integer.parseInt(type);

        switch (typeInt) {


            case 1:

                //Hotel
                //(String adresse, double surfaceHabitable, int nombreChambre, Etoile nbreEtoiles

                Hotel hotel = new Hotel();

                System.out.println("Hôtel");

                String adresse;

                boolean adresseCorrect = true;

                do {


                    System.out.println("Adresse de l'hôtel :");

                    adresse = sc.nextLine();

                    if (adresse.trim().isEmpty()) {

                        adresseCorrect = false;

                        System.out.println("Entrez une adresse correcte");
                    } else {

                        adresseCorrect = true;
                    }


                } while (!adresseCorrect);

                hotel.setAdresse(adresse);


                boolean surfaceCorrect = true;

                double surface = 0;

                do {

                    try {

                        System.out.println("Surface de l'hôtel :");

                        String surfaceHotel = sc.nextLine();

                        surface = Double.parseDouble(surfaceHotel.trim());

                        surfaceCorrect = surface > 0;

                        if (!surfaceCorrect)
                            System.out.println("Entrez une surface correcte");


                    } catch (NullPointerException | NumberFormatException e) {

                        surfaceCorrect = false;

                        System.out.println("Entrez une surface correcte");
                    }


                } while (!surfaceCorrect);

                hotel.setSurfaceHabitable(surface);

                boolean capaciteHoteliereCorrect = true;

                int capacite = 0;

                do {


                    try {


                        System.out.println("Capacité hôtelière de l'hôtel (nombre de chambres supérieure à 0) :");

                        String capaciteHoteliereString = sc.nextLine();

                        capacite = Integer.parseInt(capaciteHoteliereString.trim());

                        capaciteHoteliereCorrect = capacite > 0;

                        if (!capaciteHoteliereCorrect)
                            System.out.println("Entrez une capacité correcte");


                    } catch (NumberFormatException e) {

                        capaciteHoteliereCorrect = false;

                        System.out.println("Entrez une capacité correcte");
                    }


                } while (!capaciteHoteliereCorrect);

                hotel.setCapaciteHoteliere(capacite);


                System.out.println("Nombre d'étoiles de l'hôtel :");

                System.out.println("1");

                System.out.println("2");

                System.out.println("3");

                System.out.println("4");

                System.out.println("5");

                String etoilesString;


                do {
                    System.out.println("Faites votre choix en entrant une valeur comprise entre  1 et 5");

                    etoilesString = sc.nextLine();

                } while (!validationStringVersInt(etoilesString, 1, 5));


                int etoilesInt = Integer.parseInt(etoilesString);


                Etoile etoileHotel = map(etoilesInt);

                hotel.setNbreEtoiles(etoileHotel);

                batiments.add(new Hotel(hotel.getAdresse(), hotel.getSurfaceHabitable(), hotel.getCapaciteHoteliere(), hotel.getNbreEtoiles()));


                break;

            case 2:

                //Maison
                //Maison(String adresse, double surfaceHabitable, int nombrePiece, double surfaceJardin)

                Maison maison = new Maison();

                System.out.println("Maison");

                String adresseMaison;

                boolean adresseMaisonCorrect = true;

                do {


                    System.out.println("Adresse de la maison :");

                    adresseMaison = sc.nextLine();

                    if (adresseMaison.trim().isEmpty()) {

                        adresseMaisonCorrect = false;

                        System.out.println("Entrez une adresse correcte");
                    } else {

                        adresseMaisonCorrect = true;
                    }


                } while (!adresseMaisonCorrect);

                maison.setAdresse(adresseMaison);


                boolean surfaceMaisonCorrect = true;

                double surfaceMaisonDouble = 0;

                do {

                    try {

                        System.out.println("Surface habitable de la maison :");

                        String surfaceMaison = sc.nextLine();

                        surfaceMaisonDouble = Double.parseDouble(surfaceMaison.trim());

                        surfaceMaisonCorrect = surfaceMaisonDouble > 0;

                        if (!surfaceMaisonCorrect)
                            System.out.println("Entrez une surface habitable correcte");


                    } catch (NullPointerException | NumberFormatException e) {

                        surfaceMaisonCorrect = false;

                        System.out.println("Entrez une surface habitable correcte");
                    }


                } while (!surfaceMaisonCorrect);

                maison.setSurfaceHabitable(surfaceMaisonDouble);


                boolean nbrePiecesCorrect = true;

                int nbrePieces = 0;

                do {


                    try {


                        System.out.println("Nombre de pièces de la maison (nombre supérieure à 0) :");

                        String nbrePiecesString = sc.nextLine();

                        nbrePieces = Integer.parseInt(nbrePiecesString.trim());

                        nbrePiecesCorrect = nbrePieces > 0;

                        if (!nbrePiecesCorrect)
                            System.out.println("Entrez un nombre de pièces correcte");


                    } catch (NumberFormatException e) {

                        nbrePiecesCorrect = false;

                        System.out.println("Entrez un nombre de pièces correcte");
                    }


                } while (!nbrePiecesCorrect);

                maison.setNombrePiece(nbrePieces);

                boolean surfaceMaisonJardinCorrect = true;

                double surfaceMaisonJardinDouble = 0;

                do {

                    try {

                        System.out.println("Surface du jardin de la maison :");

                        String surfaceMaisonJardin = sc.nextLine();

                        surfaceMaisonJardinDouble = Double.parseDouble(surfaceMaisonJardin.trim());

                        surfaceMaisonJardinCorrect = surfaceMaisonJardinDouble > 0;

                        if (!surfaceMaisonJardinCorrect)
                            System.out.println("Entrez une surface de jardin correcte");


                    } catch (NullPointerException | NumberFormatException e) {

                        surfaceMaisonJardinCorrect = false;

                        System.out.println("Entrez une surface de jardin correcte");
                    }


                } while (!surfaceMaisonJardinCorrect);

                maison.setSurfaceJardin(surfaceMaisonJardinDouble);

                batiments.add(maison);


                break;


            case 3:

                //Immeuble
                //Immeuble(String adresse, double surfaceHabitable, int nombreAppartement)

                Immeuble immeuble = new Immeuble();

                System.out.println("Immeuble");

                String adresseImmeuble;

                boolean adresseImmeubleCorrect = true;

                do {


                    System.out.println("Adresse de l'immeuble :");

                    adresseImmeuble = sc.nextLine();

                    if (adresseImmeuble.trim().isEmpty()) {

                        adresseImmeubleCorrect = false;

                        System.out.println("Entrez une adresse correcte");
                    } else {

                        adresseImmeubleCorrect = true;
                    }


                } while (!adresseImmeubleCorrect);

                immeuble.setAdresse(adresseImmeuble);


                boolean surfaceImmeubleCorrect = true;

                double surfaceImmeubleDouble = 0;

                do {

                    try {

                        System.out.println("Surface de l' immeuble :");

                        String surfaceImmeuble = sc.nextLine();

                        surfaceImmeubleDouble = Double.parseDouble(surfaceImmeuble.trim());

                        surfaceImmeubleCorrect = surfaceImmeubleDouble > 0;

                        if (!surfaceImmeubleCorrect)
                            System.out.println("Entrez une surface correcte");


                    } catch (NullPointerException | NumberFormatException e) {

                        surfaceImmeubleCorrect = false;

                        System.out.println("Entrez une surface correcte");
                    }


                } while (!surfaceImmeubleCorrect);

                immeuble.setSurfaceHabitable(surfaceImmeubleDouble);


                boolean nbreAppartsCorrect = true;

                int nbreApparts = 0;

                do {


                    try {


                        System.out.println("Nombre d'appartements (nombre supérieure à 0) :");

                        String nbreAppartsString = sc.nextLine();

                        nbreApparts = Integer.parseInt(nbreAppartsString.trim());

                        nbreAppartsCorrect = nbreApparts > 0;

                        if (!nbreAppartsCorrect)
                            System.out.println("Entrez un nombre d'appartements correcte");


                    } catch (NumberFormatException e) {

                        nbreAppartsCorrect = false;

                        System.out.println("Entrez un nombre d'appartements correcte");
                    }


                } while (!nbreAppartsCorrect);

                immeuble.setNombreAppartement(nbreApparts);

                batiments.add(new Immeuble(immeuble.getAdresse(), immeuble.getSurfaceHabitable(), immeuble.getNombreAppartement()));


                break;


            case 4:

                //Magasin
                //(String adresse, double surfaceHabitable,

                Magasin magasin = new Magasin();

                System.out.println("Magasin");


                String adresseMagasin;

                boolean adresseMagasinCorrect = true;

                do {


                    System.out.println("Adresse du magasin :");

                    adresseMagasin = sc.nextLine();

                    if (adresseMagasin.trim().isEmpty()) {

                        adresseMagasinCorrect = false;

                        System.out.println("Entrez une adresse correcte");
                    } else {

                        adresseMagasinCorrect = true;
                    }


                } while (!adresseMagasinCorrect);

                magasin.setAdresse(adresseMagasin);


                boolean surfaceMagasinCorrect = true;

                double surfaceMagasinDouble = 0;

                do {

                    try {

                        System.out.println("Surface du magasin :");

                        String surfaceMagasin = sc.nextLine();

                        surfaceMagasinDouble = Double.parseDouble(surfaceMagasin.trim());

                        surfaceMagasinCorrect = surfaceMagasinDouble > 0;

                        if (!surfaceMagasinCorrect)

                            System.out.println("Entrez une surface correcte");


                    } catch (NullPointerException | NumberFormatException e) {

                        surfaceMagasinCorrect = false;

                        System.out.println("Entrez une surface correcte");
                    }


                } while (!surfaceMagasinCorrect);

                magasin.setSurfaceHabitable(surfaceMagasinDouble);

                batiments.add(magasin);

                break;


        }
    }


    private static void menuCreationBatiment(List<Batiment> batiments, Scanner sc, Proprietaire proprietaire) {


        System.out.println("Quel type de bâtiment ?");

        System.out.println("1 : Hôtel");

        System.out.println("2 : Maison");

        System.out.println("3 : Immeuble");

        System.out.println("4 : Magasin");

        String type;

        do {
            System.out.println("Faites votre choix en entrant une valeur comprise entre  1 et 4");

            type = sc.nextLine();

        } while (!validationStringVersInt(type, 1, 4));


        int typeInt = Integer.parseInt(type);

        switch (typeInt) {


            case 1:

                //Hotel
                //(String adresse, double surfaceHabitable, int nombreChambre, Etoile nbreEtoiles

                Hotel hotel = new Hotel();

                System.out.println("Hôtel");

                String adresse;

                boolean adresseCorrect = true;

                do {


                    System.out.println("Adresse de l'hôtel :");

                    adresse = sc.nextLine();

                    if (adresse.trim().isEmpty()) {

                        adresseCorrect = false;

                        System.out.println("Entrez une adresse correcte");
                    } else {

                        adresseCorrect = true;
                    }


                } while (!adresseCorrect);

                hotel.setAdresse(adresse);


                boolean surfaceCorrect = true;

                double surface = 0;

                do {

                    try {

                        System.out.println("Surface de l'hôtel :");

                        String surfaceHotel = sc.nextLine();

                        surface = Double.parseDouble(surfaceHotel.trim());

                        surfaceCorrect = surface > 0;

                        if (!surfaceCorrect)
                            System.out.println("Entrez une surface correcte");


                    } catch (NullPointerException | NumberFormatException e) {

                        surfaceCorrect = false;

                        System.out.println("Entrez une surface correcte");
                    }


                } while (!surfaceCorrect);

                hotel.setSurfaceHabitable(surface);

                boolean capaciteHoteliereCorrect = true;

                int capacite = 0;

                do {


                    try {


                        System.out.println("Capacité hôtelière de l'hôtel (nombre de chambres supérieure à 0) :");

                        String capaciteHoteliereString = sc.nextLine();

                        capacite = Integer.parseInt(capaciteHoteliereString.trim());

                        capaciteHoteliereCorrect = capacite > 0;

                        if (!capaciteHoteliereCorrect)
                            System.out.println("Entrez une capacité correcte");


                    } catch (NumberFormatException e) {

                        capaciteHoteliereCorrect = false;

                        System.out.println("Entrez une capacité correcte");
                    }


                } while (!capaciteHoteliereCorrect);

                hotel.setCapaciteHoteliere(capacite);


                System.out.println("Nombre d'étoiles de l'hôtel :");

                System.out.println("1");

                System.out.println("2");

                System.out.println("3");

                System.out.println("4");

                System.out.println("5");

                String etoilesString;


                do {
                    System.out.println("Faites votre choix en entrant une valeur comprise entre  1 et 5");

                    etoilesString = sc.nextLine();

                } while (!validationStringVersInt(etoilesString, 1, 5));


                int etoilesInt = Integer.parseInt(etoilesString);


                Etoile etoileHotel = map(etoilesInt);

                hotel.setNbreEtoiles(etoileHotel);

                batiments.add(new Hotel(hotel.getAdresse(), hotel.getSurfaceHabitable(), proprietaire, hotel.getCapaciteHoteliere(), hotel.getNbreEtoiles()));

                break;

            case 2:

                //Maison
                //Maison(String adresse, double surfaceHabitable, int nombrePiece, double surfaceJardin)

                Maison maison = new Maison();

                System.out.println("Maison");

                String adresseMaison;

                boolean adresseMaisonCorrect = true;

                do {


                    System.out.println("Adresse de la maison :");

                    adresseMaison = sc.nextLine();

                    if (adresseMaison.trim().isEmpty()) {

                        adresseMaisonCorrect = false;

                        System.out.println("Entrez une adresse correcte");
                    } else {

                        adresseMaisonCorrect = true;
                    }


                } while (!adresseMaisonCorrect);

                maison.setAdresse(adresseMaison);

                boolean surfaceMaisonCorrect = true;

                double surfaceMaisonDouble = 0;

                do {

                    try {

                        System.out.println("Surface habitable de la maison :");

                        String surfaceMaison = sc.nextLine();

                        surfaceMaisonDouble = Double.parseDouble(surfaceMaison.trim());

                        surfaceMaisonCorrect = surfaceMaisonDouble > 0;

                        if (!surfaceMaisonCorrect)
                            System.out.println("Entrez une surface habitable correcte");


                    } catch (NullPointerException | NumberFormatException e) {

                        surfaceMaisonCorrect = false;

                        System.out.println("Entrez une surface habitable correcte");
                    }


                } while (!surfaceMaisonCorrect);

                maison.setSurfaceHabitable(surfaceMaisonDouble);


                boolean nbrePiecesCorrect = true;

                int nbrePieces = 0;

                do {


                    try {


                        System.out.println("Nombre de pièces de la maison (nombre supérieure à 0) :");

                        String nbrePiecesString = sc.nextLine();

                        nbrePieces = Integer.parseInt(nbrePiecesString.trim());

                        nbrePiecesCorrect = nbrePieces > 0;

                        if (!nbrePiecesCorrect)
                            System.out.println("Entrez un nombre de pièces correcte");


                    } catch (NumberFormatException e) {

                        nbrePiecesCorrect = false;

                        System.out.println("Entrez un nombre de pièces correcte");
                    }


                } while (!nbrePiecesCorrect);

                maison.setNombrePiece(nbrePieces);

                boolean surfaceMaisonJardinCorrect = true;

                double surfaceMaisonJardinDouble = 0;

                do {

                    try {

                        System.out.println("Surface du jardin de la maison :");

                        String surfaceMaisonJardin = sc.nextLine();

                        surfaceMaisonJardinDouble = Double.parseDouble(surfaceMaisonJardin.trim());

                        surfaceMaisonJardinCorrect = surfaceMaisonJardinDouble > 0;

                        if (!surfaceMaisonJardinCorrect)
                            System.out.println("Entrez une surface de jardin correcte");


                    } catch (NullPointerException | NumberFormatException e) {

                        surfaceMaisonJardinCorrect = false;

                        System.out.println("Entrez une surface de jardin correcte");
                    }


                } while (!surfaceMaisonJardinCorrect);

                maison.setSurfaceJardin(surfaceMaisonJardinDouble);

                maison.setProprietaire(proprietaire);

                batiments.add(maison);

                break;

            case 3:

                //Immeuble
                //Immeuble(String adresse, double surfaceHabitable, int nombreAppartement)

                Immeuble immeuble = new Immeuble();

                System.out.println("Immeuble");

                String adresseImmeuble;

                boolean adresseImmeubleCorrect = true;

                do {


                    System.out.println("Adresse de l'immeuble :");

                    adresseImmeuble = sc.nextLine();

                    if (adresseImmeuble.trim().isEmpty()) {

                        adresseImmeubleCorrect = false;

                        System.out.println("Entrez une adresse correcte");
                    } else {

                        adresseImmeubleCorrect = true;
                    }


                } while (!adresseImmeubleCorrect);

                immeuble.setAdresse(adresseImmeuble);


                boolean surfaceImmeubleCorrect = true;

                double surfaceImmeubleDouble = 0;

                do {

                    try {

                        System.out.println("Surface de l' immeuble :");

                        String surfaceImmeuble = sc.nextLine();

                        surfaceImmeubleDouble = Double.parseDouble(surfaceImmeuble.trim());

                        surfaceImmeubleCorrect = surfaceImmeubleDouble > 0;

                        if (!surfaceImmeubleCorrect)
                            System.out.println("Entrez une surface correcte");


                    } catch (NullPointerException | NumberFormatException e) {

                        surfaceImmeubleCorrect = false;

                        System.out.println("Entrez une surface correcte");
                    }


                } while (!surfaceImmeubleCorrect);

                immeuble.setSurfaceHabitable(surfaceImmeubleDouble);


                boolean nbreAppartsCorrect = true;

                int nbreApparts = 0;

                do {


                    try {


                        System.out.println("Nombre d'appartements (nombre supérieure à 0) :");

                        String nbreAppartsString = sc.nextLine();

                        nbreApparts = Integer.parseInt(nbreAppartsString.trim());

                        nbreAppartsCorrect = nbreApparts > 0;

                        if (!nbreAppartsCorrect)
                            System.out.println("Entrez un nombre d'appartements correcte");


                    } catch (NumberFormatException e) {

                        nbreAppartsCorrect = false;

                        System.out.println("Entrez un nombre d'appartements correcte");
                    }


                } while (!nbreAppartsCorrect);

                immeuble.setNombreAppartement(nbreApparts);

                batiments.add(new Immeuble(immeuble.getAdresse(), immeuble.getSurfaceHabitable(), proprietaire, immeuble.getNombreAppartement()));


                break;


            case 4:

                //Magasin
                //(String adresse, double surfaceHabitable,

                Magasin magasin = new Magasin();

                System.out.println("Magasin");


                String adresseMagasin;

                boolean adresseMagasinCorrect = true;

                do {


                    System.out.println("Adresse du magasin :");

                    adresseMagasin = sc.nextLine();

                    if (adresseMagasin.trim().isEmpty()) {

                        adresseMagasinCorrect = false;

                        System.out.println("Entrez une adresse correcte");
                    } else {

                        adresseMagasinCorrect = true;
                    }


                } while (!adresseMagasinCorrect);

                magasin.setAdresse(adresseMagasin);


                boolean surfaceMagasinCorrect = true;

                double surfaceMagasinDouble = 0;

                do {

                    try {

                        System.out.println("Surface du magasin :");

                        String surfaceMagasin = sc.nextLine();

                        surfaceMagasinDouble = Double.parseDouble(surfaceMagasin.trim());

                        surfaceMagasinCorrect = surfaceMagasinDouble > 0;

                        if (!surfaceMagasinCorrect)

                            System.out.println("Entrez une surface correcte");


                    } catch (NullPointerException | NumberFormatException e) {

                        surfaceMagasinCorrect = false;

                        System.out.println("Entrez une surface correcte");
                    }


                } while (!surfaceMagasinCorrect);

                magasin.setSurfaceHabitable(surfaceMagasinDouble);

                magasin.setProprietaire(proprietaire);

                batiments.add(magasin);

                break;


        }
    }

    private static void menuCreationInstrumentVent(String nom, double prixAchat, double prixVente, String marque,Scanner sc,InstrumentAVent instrumentAVent) {

        boolean nomCorrect = true;

        do {


            System.out.println("Nom :");

            nom = sc.nextLine();

            if (nom.trim().isEmpty()) {

                nomCorrect = false;

                System.out.println("Entrez un nom correct");
            } else {

                nomCorrect = true;
            }


        } while (!nomCorrect);

instrumentAVent.setNom(nom);

        boolean prixAchatCorrect = true;


        do {

            try {

                System.out.println("Prix d'achat :");

                String prixAchatString = sc.nextLine();

                prixAchat = Double.parseDouble(prixAchatString.trim());

                prixAchatCorrect = prixAchat > 0;

                if (!prixAchatCorrect)
                    System.out.println("Entrez un prix d'achat correct");


            } catch (NullPointerException | NumberFormatException e) {

                prixAchatCorrect = false;

                System.out.println("Entrez un prix d'achat correct");
            }


        } while (!prixAchatCorrect);

        instrumentAVent.setPrixAchat(prixAchat);

        boolean prixVenteCorrect = true;


        do {

            try {

                System.out.println("Prix de vente :");

                String prixVenteString = sc.nextLine();

                prixVente = Double.parseDouble(prixVenteString.trim());

                prixVenteCorrect = prixVente > 0;

                if (!prixVenteCorrect)
                    System.out.println("Entrez un prix de vente correct");


            } catch (NullPointerException | NumberFormatException e) {

                prixVenteCorrect = false;

                System.out.println("Entrez un prix de vente correct");
            }


        } while (!prixVenteCorrect);

instrumentAVent.setPrixVente(prixVente);


        boolean marqueCorrect = true;

        do {


            System.out.println("Marque :");

            marque = sc.nextLine();

            if (marque.trim().isEmpty()) {

                marqueCorrect = false;

                System.out.println("Entrez une marque correcte");
            } else {

                marqueCorrect = true;
            }


        } while (!marqueCorrect);


instrumentAVent.setMarque(marque);
    }

    private static void menuCreationGuitare(Guitare guitare, Scanner sc) {

        String nomGuitare;

        boolean nomGuitareCorrect = true;

        do {


            System.out.println("Nom :");

            nomGuitare = sc.nextLine();

            if (nomGuitare.trim().isEmpty()) {

                nomGuitareCorrect = false;

                System.out.println("Entrez un nom correct");
            } else {

                nomGuitareCorrect = true;
            }


        } while (!nomGuitareCorrect);

        guitare.setNom(nomGuitare);


        boolean prixAchatCorrect = true;

        double prixAchat = 0;

        do {

            try {

                System.out.println("Prix d'achat :");

                String prixAchatString = sc.nextLine();

                prixAchat = Double.parseDouble(prixAchatString.trim());

                prixAchatCorrect = prixAchat > 0;

                if (!prixAchatCorrect)
                    System.out.println("Entrez un prix d'achat correct");


            } catch (NullPointerException | NumberFormatException e) {

                prixAchatCorrect = false;

                System.out.println("Entrez un prix d'achat correct");
            }


        } while (!prixAchatCorrect);

        guitare.setPrixAchat(prixAchat);


        boolean prixVenteCorrect = true;

        double prixVente = 0;

        do {

            try {

                System.out.println("Prix de vente :");

                String prixVenteString = sc.nextLine();

                prixVente = Double.parseDouble(prixVenteString.trim());

                prixVenteCorrect = prixVente > 0;

                if (!prixVenteCorrect)
                    System.out.println("Entrez un prix de vente correct");


            } catch (NullPointerException | NumberFormatException e) {

                prixVenteCorrect = false;

                System.out.println("Entrez un prix de vente correct");
            }


        } while (!prixVenteCorrect);

        guitare.setPrixVente(prixVente);

        String marqueGuitare;

        boolean marqueGuitareCorrect = true;

        do {


            System.out.println("Marque :");

            marqueGuitare = sc.nextLine();

            if (marqueGuitare.trim().isEmpty()) {

                marqueGuitareCorrect = false;

                System.out.println("Entrez une marque correcte");
            } else {

                marqueGuitareCorrect = true;
            }


        } while (!marqueGuitareCorrect);

        guitare.setMarque(marqueGuitare);

        boolean longueurCorrect = true;

        double longueur = 0;

        do {

            try {

                System.out.println("Longueur :");

                String longueurString = sc.nextLine();

                longueur = Double.parseDouble(longueurString.trim());

                longueurCorrect = longueur > 0;

                if (!longueurCorrect)
                    System.out.println("Entrez une longueur correcte");


            } catch (NullPointerException | NumberFormatException e) {

                longueurCorrect = false;

                System.out.println("Entrez une longueur correcte");
            }


        } while (!longueurCorrect);

        guitare.setLongueur(longueur);

        boolean largeurCorrect = true;

        double largeur = 0;

        do {

            try {

                System.out.println("Largeur :");

                String largeurString = sc.nextLine();

                largeur = Double.parseDouble(largeurString.trim());

                largeurCorrect = largeur > 0;

                if (!largeurCorrect)
                    System.out.println("Entrez une largeur correcte");

            } catch (NullPointerException | NumberFormatException e) {

                largeurCorrect = false;

                System.out.println("Entrez une largeur correcte");
            }

        } while (!largeurCorrect);

        guitare.setLargeur(largeur);

        System.out.println("Matériau de la corde:");

        System.out.println("1: BOYAU");

        System.out.println("2: NYLON");

        System.out.println("3: FER");

        System.out.println("4: NICKEL");

        System.out.println("5: BRONZE");

        System.out.println("6: CUIVRE");

        System.out.println("7: OR");

        System.out.println("8: SILICONE");

        String materiauCordeString;


        do {
            System.out.println("Faites votre choix en entrant une valeur comprise entre  1 et 8");

            materiauCordeString = sc.nextLine();

        } while (!validationStringVersInt(materiauCordeString, 1, 8));

        int materiauCordeInt = Integer.parseInt(materiauCordeString);

        MateriauCordeGuitare materiauCordeGuitare = mapMateriauCordeGuitare(materiauCordeInt);

        guitare.setMateriauCordeGuitare(materiauCordeGuitare);

    }

    private static void menuCreationGuitareAcoustique(GuitareAcoustique guitare, Scanner sc) {

        menuCreationGuitare(guitare,sc);

        System.out.println("Main Habile:");

        System.out.println("1: GAUCHER");

        System.out.println("2: DROITIER");

        String mainHabileString;


        do {
            System.out.println("Faites votre choix en entrant une valeur comprise entre  1 et 2");

            mainHabileString = sc.nextLine();

        } while (!validationStringVersInt(mainHabileString, 1, 2));

        int mainHabileInt = Integer.parseInt(mainHabileString);

        MainHabile mainHabile = mapMainHabile(mainHabileInt);

        guitare.setMainHabile(mainHabile);

        System.out.println("Tirant:");

        System.out.println("1: 1");

        System.out.println("2: 2");

        System.out.println("3: 3");


        String tirantString;


        do {
            System.out.println("Faites votre choix en entrant une valeur comprise entre  1 et 3");

            tirantString = sc.nextLine();

        } while (!validationStringVersInt(tirantString, 1, 3));


        int tirantInt = Integer.parseInt(tirantString);

        guitare.setTirant(tirantInt);


    }

    private static void menuCreationGuitareElectrique(GuitareElectrique guitare, Scanner sc) {

        menuCreationGuitare(guitare,sc);


        System.out.println("Avec Amplificateur:");

        System.out.println("1: OUI");

        System.out.println("2: NON");


        String avecAmplificateurString;


        do {
            System.out.println("Faites votre choix en entrant une valeur comprise entre  1 et 2");

            avecAmplificateurString = sc.nextLine();

        } while (!validationStringVersInt(avecAmplificateurString, 1, 2));


        int avecAmplificateurInt = Integer.parseInt(avecAmplificateurString);


        boolean amplificateurInclus = mapToBoolean(avecAmplificateurInt);

        guitare.setAmplificateurInclus(amplificateurInclus);

        System.out.println("Avec Pédales Sonores:");

        System.out.println("1: OUI");

        System.out.println("2: NON");


        String pedalesEffetsSonoresString;


        do {
            System.out.println("Faites votre choix en entrant une valeur comprise entre  1 et 2");

            pedalesEffetsSonoresString = sc.nextLine();

        } while (!validationStringVersInt(pedalesEffetsSonoresString, 1, 2));


        int pedalesEffetsSonoresInt = Integer.parseInt(pedalesEffetsSonoresString);


        boolean pedalesEffetsSonoresInclus = mapToBoolean(pedalesEffetsSonoresInt);

        guitare.setPedalesEffetsSonores(pedalesEffetsSonoresInclus);

    }

    private static void menuCreationPiano(Piano piano, Scanner sc) {

        String nomPiano;

        boolean nomPianoCorrect = true;

        do {


            System.out.println("Nom :");

            nomPiano = sc.nextLine();

            if (nomPiano.trim().isEmpty()) {

                nomPianoCorrect = false;

                System.out.println("Entrez un nom correct");
            } else {

                nomPianoCorrect = true;
            }


        } while (!nomPianoCorrect);

        piano.setNom(nomPiano);


        boolean prixAchatCorrect = true;

        double prixAchat = 0;

        do {

            try {

                System.out.println("Prix d'achat :");

                String prixAchatString = sc.nextLine();

                prixAchat = Double.parseDouble(prixAchatString.trim());

                prixAchatCorrect = prixAchat > 0;

                if (!prixAchatCorrect)
                    System.out.println("Entrez un prix d'achat correct");


            } catch (NullPointerException | NumberFormatException e) {

                prixAchatCorrect = false;

                System.out.println("Entrez un prix d'achat correct");
            }


        } while (!prixAchatCorrect);

        piano.setPrixAchat(prixAchat);


        boolean prixVenteCorrect = true;

        double prixVente = 0;

        do {

            try {

                System.out.println("Prix de vente :");

                String prixVenteString = sc.nextLine();

                prixVente = Double.parseDouble(prixVenteString.trim());

                prixVenteCorrect = prixVente > 0;

                if (!prixVenteCorrect)
                    System.out.println("Entrez un prix de vente correct");


            } catch (NullPointerException | NumberFormatException e) {

                prixVenteCorrect = false;

                System.out.println("Entrez un prix de vente correct");
            }


        } while (!prixVenteCorrect);

        piano.setPrixVente(prixVente);

        String marquePiano;

        boolean marquePianoCorrect = true;

        do {


            System.out.println("Marque :");

            marquePiano = sc.nextLine();

            if (marquePiano.trim().isEmpty()) {

                marquePianoCorrect = false;

                System.out.println("Entrez une marque correcte");
            } else {

                marquePianoCorrect = true;
            }


        } while (!marquePianoCorrect);

        piano.setMarque(marquePiano);


        boolean longueurCorrect = true;

        double longueur = 0;

        do {

            try {

                System.out.println("Longueur :");

                String longueurString = sc.nextLine();

                longueur = Double.parseDouble(longueurString.trim());

                longueurCorrect = longueur > 0;

                if (!longueurCorrect)
                    System.out.println("Entrez une longueur correcte");


            } catch (NullPointerException | NumberFormatException e) {

                longueurCorrect = false;

                System.out.println("Entrez une longueur correcte");
            }


        } while (!longueurCorrect);

        piano.setLongueur(longueur);

        boolean largeurCorrect = true;

        double largeur = 0;

        do {

            try {

                System.out.println("Largeur :");

                String largeurString = sc.nextLine();

                largeur = Double.parseDouble(largeurString.trim());

                largeurCorrect = largeur > 0;

                if (!largeurCorrect)
                    System.out.println("Entrez une largeur correcte");

            } catch (NullPointerException | NumberFormatException e) {

                largeurCorrect = false;

                System.out.println("Entrez une largeur correcte");
            }

        } while (!largeurCorrect);

        piano.setLargeur(largeur);

    }


    private static void menuCreationPianoNbreTouchePeronnalise(Piano piano, Scanner sc) {

        String nomPiano;

        boolean nomPianoCorrect = true;

        do {


            System.out.println("Nom :");

            nomPiano = sc.nextLine();

            if (nomPiano.trim().isEmpty()) {

                nomPianoCorrect = false;

                System.out.println("Entrez un nom correct");
            } else {

                nomPianoCorrect = true;
            }


        } while (!nomPianoCorrect);

        piano.setNom(nomPiano);


        boolean prixAchatCorrect = true;

        double prixAchat = 0;

        do {

            try {

                System.out.println("Prix d'achat :");

                String prixAchatString = sc.nextLine();

                prixAchat = Double.parseDouble(prixAchatString.trim());

                prixAchatCorrect = prixAchat > 0;

                if (!prixAchatCorrect)
                    System.out.println("Entrez un prix d'achat correct");


            } catch (NullPointerException | NumberFormatException e) {

                prixAchatCorrect = false;

                System.out.println("Entrez un prix d'achat correct");
            }


        } while (!prixAchatCorrect);

        piano.setPrixAchat(prixAchat);


        boolean prixVenteCorrect = true;

        double prixVente = 0;

        do {

            try {

                System.out.println("Prix de vente :");

                String prixVenteString = sc.nextLine();

                prixVente = Double.parseDouble(prixVenteString.trim());

                prixVenteCorrect = prixVente > 0;

                if (!prixVenteCorrect)
                    System.out.println("Entrez un prix de vente correct");


            } catch (NullPointerException | NumberFormatException e) {

                prixVenteCorrect = false;

                System.out.println("Entrez un prix de vente correct");
            }


        } while (!prixVenteCorrect);

        piano.setPrixVente(prixVente);

        String marquePiano;

        boolean marquePianoCorrect = true;

        do {


            System.out.println("Marque :");

            marquePiano = sc.nextLine();

            if (marquePiano.trim().isEmpty()) {

                marquePianoCorrect = false;

                System.out.println("Entrez une marque correcte");
            } else {

                marquePianoCorrect = true;
            }


        } while (!marquePianoCorrect);

        piano.setMarque(marquePiano);


        boolean longueurCorrect = true;

        double longueur = 0;

        do {

            try {

                System.out.println("Longueur :");

                String longueurString = sc.nextLine();

                longueur = Double.parseDouble(longueurString.trim());

                longueurCorrect = longueur > 0;

                if (!longueurCorrect)
                    System.out.println("Entrez une longueur correcte");


            } catch (NullPointerException | NumberFormatException e) {

                longueurCorrect = false;

                System.out.println("Entrez une longueur correcte");
            }


        } while (!longueurCorrect);

        piano.setLongueur(longueur);

        boolean largeurCorrect = true;

        double largeur = 0;

        do {

            try {

                System.out.println("Largeur :");

                String largeurString = sc.nextLine();

                largeur = Double.parseDouble(largeurString.trim());

                largeurCorrect = largeur > 0;

                if (!largeurCorrect)
                    System.out.println("Entrez une largeur correcte");

            } catch (NullPointerException | NumberFormatException e) {

                largeurCorrect = false;

                System.out.println("Entrez une largeur correcte");
            }

        } while (!largeurCorrect);

        piano.setLargeur(largeur);

        boolean nombreToucheCorrect = true;

        int nombreTouche = 0;

        do {

            try {

                System.out.println("Nombre de touches (supérieure à 0) :");

                String nombreToucheString = sc.nextLine();

                nombreTouche = Integer.parseInt(nombreToucheString.trim());

                nombreToucheCorrect = nombreTouche > 0;

                if (!nombreToucheCorrect)
                    System.out.println("Entrez un nombre de touches correct");


            } catch (NumberFormatException e) {

                nombreToucheCorrect = false;

                System.out.println("Entrez un nombre de touches correct");
            }


        } while (!nombreToucheCorrect);

        piano.setNombreTouche(nombreTouche);

    }

}
