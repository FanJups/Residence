package org.example.residenceapp;

import org.example.residenceapp.batiment.Batiment;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Residence {

    private List<Batiment> batiments = new ArrayList<>();

    public List<Batiment> getBatiments() {
        return batiments;
    }

    public void addBatiment(Batiment batiment) {

        Objects.requireNonNull(batiment);

        batiments.add(batiment);
    }
}
