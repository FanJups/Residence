package org.example.residenceapp;

import org.example.residenceapp.batiment.Batiment;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Residence {

    private static List<Batiment> batiments = new ArrayList<>();

    public static List<Batiment> getBatiments() {
        return batiments;
    }

    public static void addBatiment(Batiment batiment) {

        Objects.requireNonNull(batiment);

        batiments.add(batiment);
    }

    @Override
    public String toString() {
        return "\n" +
                "Residence {" +
                "\n" +
                "nombre de bâtiments = " + batiments.size() +
                "\n" +
                "batiments = " + batiments.stream().map(Batiment::toString)
                .collect(Collectors.joining("\n", "{", "}")) +
                "\n" +
                '}' +
                "\n";
    }
}
