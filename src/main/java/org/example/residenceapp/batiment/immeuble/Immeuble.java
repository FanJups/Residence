package org.example.residenceapp.batiment.immeuble;

import org.example.residenceapp.batiment.Batiment;
import org.example.residenceapp.batiment.Proprietaire;
import org.example.residenceapp.batiment.hotel.Chambre;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Immeuble extends Batiment {

    private int nombreAppartement;

    private List<Appartement> appartements = new ArrayList<>();

    public Immeuble(){super();}


    public Immeuble(String adresse, double surfaceHabitable, Proprietaire proprietaire, int nombreAppartement) {
        super(adresse, surfaceHabitable, proprietaire);
        setNombreAppartement(nombreAppartement);

        for (int i = 0; i < this.nombreAppartement; i++) {
            appartements.add(new Appartement(null,this));
        }
    }

    public Immeuble(String adresse, double surfaceHabitable, int nombreAppartement) {
        super(adresse, surfaceHabitable);
        setNombreAppartement(nombreAppartement);

        for (int i = 0; i < this.nombreAppartement; i++) {
            appartements.add(new Appartement(null,this));
        }
    }

    public int getNombreAppartement() {
        return nombreAppartement;
    }

    public void setNombreAppartement(int nombreAppartement) {

        if (nombreAppartement > 0) {

            this.nombreAppartement = nombreAppartement;

        } else {

            throw new RuntimeException("L'immeuble doit avoir minimum un appartment.");

        }

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
        return "\n" +
                "Immeuble {" +
                "\n" +
                super.toString() +
                "\n" +
                "nombreAppartement = " + nombreAppartement +
                "\n" +
                "appartements = " + appartements.stream().map(Appartement::toString)
                .collect(Collectors.joining("\n", "{", "}")) +
                "\n" +
                "} " +
                "\n";
    }
}
