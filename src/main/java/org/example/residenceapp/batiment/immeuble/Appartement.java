package org.example.residenceapp.batiment.immeuble;


import org.example.residenceapp.batiment.Proprietaire;
import org.example.residenceapp.batiment.bail.Locataire;
import org.example.residenceapp.batiment.bail.Location;

public class Appartement extends Location {

    private Immeuble immeuble;

    public Appartement() {
        super(null);

    }

    public Appartement(Locataire locataire) {

        super(locataire);
    }

    public Appartement(Locataire locataire, Immeuble immeuble) {

        super(locataire);
        this.immeuble = immeuble;
    }

    public Immeuble getImmeuble() {
        return immeuble;
    }

    public void setImmeuble(Immeuble immeuble) {
        immeuble = immeuble;
    }


    @Override
    public void bail(Locataire locataire) {

        if (immeuble.getProprietaire().getIdPersonne() != locataire.getIdPersonne()) {

            setLocataire(locataire);

        } else {

            throw  new RuntimeException("Impossible de faire un bail car le propriétaire et la locataire sont la même personne");

        }

    }

    public Proprietaire getProprietaire() {

        return immeuble.getProprietaire();
    }


    public String toStringq() {
        return "\n" +
                "Appartement {" +
                "\n" +
                "Proprietaire  de l' immeuble = " + immeuble.getProprietaire() +
                "\n" +
                super.toString() +
                "\n" +
                "} " +
                "\n";
    }


}
