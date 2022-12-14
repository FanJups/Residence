package org.example.residenceapp.batiment.magasin;

import org.example.residenceapp.batiment.Batiment;
import org.example.residenceapp.batiment.Proprietaire;
import org.example.residenceapp.batiment.magasin.instrument.Instrument;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Magasin extends Batiment {

    private List<Instrument> instruments = new ArrayList<>();

    public Magasin(String adresse, double surfaceHabitable, Proprietaire proprietaire) {

        super(adresse, surfaceHabitable, proprietaire);


    }

    public Magasin(String adresse, double surfaceHabitable) {

        super(adresse, surfaceHabitable);


    }


    public List<Instrument> getInstruments() {
        return instruments;
    }

    public void addInstrument(Instrument instrument) {

        Objects.requireNonNull(instrument);

        instruments.add(instrument);
    }

    @Override
    public String toString() {
        return "\n" +
                "Magasin {" +
                "\n" +
                super.toString() +
                "\n" +
                "nombre d'instruments = " + instruments.size() +
                "\n" +
                "instruments = " + instruments.stream().map(Instrument::toString)
                .collect(Collectors.joining("\n", "{", "}")) +
                "\n" +
                "} " +
                "\n";
    }
}
