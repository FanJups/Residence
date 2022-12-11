package org.example.residenceapp.batiment.immeuble;

import org.example.residenceapp.batiment.Batiment;
import org.example.residenceapp.batiment.Proprietaire;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Immeuble extends Batiment {

    private int nombreAppartement;

    private List<Appartement> appartements = new ArrayList<>();


    public Immeuble(String adresse, double surfaceHabitable, Proprietaire proprietaire, int nombreAppartement) {
        super(adresse, surfaceHabitable, proprietaire);
        this.nombreAppartement = nombreAppartement;
    }

    public int getNombreAppartement() {
        return nombreAppartement;
    }

    public void setNombreAppartement(int nombreAppartement) {
        this.nombreAppartement = nombreAppartement;
    }

    public List<Appartement> getAppartements() {
        return appartements;
    }

    public void addAppartement(Appartement appartement) {

        Objects.requireNonNull(appartement);

        appartement.setImmeuble(this);

        appartements.add(appartement);
    }


}
