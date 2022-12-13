package org.example.residenceapp.batiment.magasin.instrument.vent;

import org.example.residenceapp.batiment.magasin.instrument.vent.utils.TypeInstrumentAVent;

public class Hautbois extends InstrumentAVent {

    public Hautbois(String nom, double prixAchat, double prixVente, String marque) {

        super(nom, prixAchat, prixVente, marque, TypeInstrumentAVent.ANCHE_DOUBLE);

    }

    @Override
    public String toString() {

        return "Hautbois{"+ super.toString()+"} ";
    }
}
