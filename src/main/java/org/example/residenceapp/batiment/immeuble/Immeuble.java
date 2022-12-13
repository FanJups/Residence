package org.example.residenceapp.batiment.immeuble;

import org.example.residenceapp.batiment.Batiment;
import org.example.residenceapp.batiment.Proprietaire;
import org.example.residenceapp.batiment.magasin.instrument.Instrument;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Immeuble extends Batiment {

    private int nombreAppartement;

    private List<Appartement> appartements = new ArrayList<>();


    public Immeuble(String adresse, double surfaceHabitable, Proprietaire proprietaire, int nombreAppartement) {
        super(adresse, surfaceHabitable, proprietaire);
        this.nombreAppartement = nombreAppartement;
    }

    public Immeuble(String adresse, double surfaceHabitable,  int nombreAppartement) {
        super(adresse, surfaceHabitable);
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

    @Override
    public String toString() {
        return "Immeuble{" +super.toString()+
                "nombreAppartement=" + nombreAppartement +
                ", appartements=" + appartements.stream().map(Appartement::toString)
                .collect(Collectors.joining("\n", "{", "}")) +
                "} ";
    }
}
