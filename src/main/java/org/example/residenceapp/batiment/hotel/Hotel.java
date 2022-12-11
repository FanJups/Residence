package org.example.residenceapp.batiment.hotel;

import org.example.residenceapp.Impot;
import org.example.residenceapp.batiment.Batiment;
import org.example.residenceapp.batiment.Proprietaire;
import org.example.residenceapp.batiment.hotel.utils.Etoile;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Hotel extends Batiment {

    private int nombreChambre;

    private List<Chambre> chambres = new ArrayList<>();

    private List<Suite> suites = new ArrayList<>();

    private List<Piscine> piscines = new ArrayList<>();

    private List<Spa> spas = new ArrayList<>();


    private Etoile nbreEtoiles;


    public Hotel(String adresse, double surfaceHabitable, Proprietaire proprietaire, int nombreChambre, Etoile nbreEtoiles) {
        super(adresse, surfaceHabitable, proprietaire);
        setNombreChambre(nombreChambre);
        this.nbreEtoiles = nbreEtoiles;
    }

    public int getNombreChambre() {
        return nombreChambre;
    }

    public void setNombreChambre(int nombreChambre) {

        if (nombreChambre > 0) {

            this.nombreChambre = nombreChambre;

        } else {
            // TODO: Ajouter Exception

            System.out.println("L'Hôtel doit avoir minimum une chambre.");

        }

    }


    public List<Chambre> getChambres() {
        return chambres;
    }

    public void addChambre(Chambre chambre) {

        Objects.requireNonNull(chambre);

        if (chambres.size() < nombreChambre) {


            chambre.setHotel(this);

            chambres.add(chambre);
        } else {

            // TODO: Ajouter Exception

            System.out.println("Impossible d'ajouter une chambre car le quota max est atteint");

        }

    }

    public List<Suite> getSuites() {
        return suites;
    }

    public void addSuite(Suite suite) {

        if (this.nbreEtoiles.equals(Etoile.CINQ)) {

            Objects.requireNonNull(suite);

            suite.setHotel(this);

            suites.add(suite);
        } else {

            System.out.println("Impossible d'ajouter une suite car cet hôtel n'a pas 5 étoiles.");
        }


    }

    public List<Piscine> getPiscines() {
        return piscines;
    }

    public void addPiscine(Piscine piscine) {

        Objects.requireNonNull(piscine);

        if (this.nbreEtoiles.equals(Etoile.UN)
                || this.nbreEtoiles.equals(Etoile.DEUX)
                || this.nbreEtoiles.equals(Etoile.TROIS)) {
            System.out.println("Impossible d'ajouter une piscine car cet hôtel n'a pas minimum 4 étoiles.");

        } else {

            if (this.nbreEtoiles.equals(Etoile.QUATRE)) {

                if (piscines.size() == 0) {

                    piscine.setHotel(this);

                    piscines.add(piscine);
                } else {

                    System.out.println("Impossible d'ajouter une autre piscine " +
                            "car cet hôtel 4 étoiles doit contenir au max une piscine.");
                }
            }

            if (this.nbreEtoiles.equals(Etoile.CINQ)) {

                piscine.setHotel(this);

                piscines.add(piscine);

            }
        }


    }

    public List<Spa> getSpas() {
        return spas;
    }

    public void addSpa(Spa spa) {

        Objects.requireNonNull(spa);

        spa.setHotel(this);

        spas.add(spa);
    }

    public Etoile getNbreEtoiles() {
        return nbreEtoiles;
    }

    public void setNbreEtoiles(Etoile nbreEtoiles) {
        this.nbreEtoiles = nbreEtoiles;
    }


    @Override
    public double getImpot() {


        if (this.nbreEtoiles.equals(Etoile.QUATRE)) {

            return super.getImpot() + Impot.TAUXB.getValue() * (spas.size() + 1);
        }

        if (this.nbreEtoiles.equals(Etoile.CINQ)) {

            return super.getImpot() + Impot.TAUXB.getValue() * (piscines.size());

        }

        return super.getImpot();

    }
}
