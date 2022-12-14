package org.example.residenceapp.batiment.magasin.instrument.vent;

import org.example.residenceapp.batiment.magasin.instrument.vent.utils.TypeInstrumentAVent;

public class Clarinette extends InstrumentAVent {

    public Clarinette(){

    }


    public Clarinette(String nom, double prixAchat, double prixVente, String marque) {

        super(nom, prixAchat, prixVente, marque, TypeInstrumentAVent.ANCHE_SIMPLE);

    }

    @Override
    public String toString() {
        return "\n" +
                "Clarinette {" +
                "\n" +
                super.toString() +
                "\n" +
                "} " +
                "\n";
    }
}
