package org.example.residenceapp.batiment.magasin.instrument.vent;

import org.example.residenceapp.batiment.magasin.instrument.vent.utils.TypeInstrumentAVent;

public class FluteTraversiere extends InstrumentAVent {


    public FluteTraversiere(){


    }

    public FluteTraversiere(String nom, double prixAchat, double prixVente, String marque) {

        super(nom, prixAchat, prixVente, marque, TypeInstrumentAVent.BISEAU);

    }

    @Override
    public String toString() {

        return "\n" +
                "FluteTraversiere {" +
                "\n" +
                super.toString() +
                "\n" +
                "} " +
                "\n";
    }
}
