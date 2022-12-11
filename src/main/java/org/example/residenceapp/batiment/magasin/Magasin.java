package org.example.residenceapp.batiment.magasin;

import org.example.residenceapp.batiment.Batiment;
import org.example.residenceapp.batiment.Proprietaire;
import org.example.residenceapp.batiment.magasin.instrument.Instrument;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Magasin extends Batiment {

    private List<Instrument> instruments = new ArrayList<>();

    public Magasin(String adresse, double surfaceHabitable, Proprietaire proprietaire) {

        super(adresse, surfaceHabitable, proprietaire);


    }


    public List<Instrument> getInstruments() {
        return instruments;
    }

    public void addInstrument(Instrument instrument) {

        Objects.requireNonNull(instrument);

        instruments.add(instrument);
    }

}