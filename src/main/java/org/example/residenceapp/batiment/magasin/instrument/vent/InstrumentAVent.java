package org.example.residenceapp.batiment.magasin.instrument.vent;

import org.example.residenceapp.batiment.magasin.instrument.Instrument;
import org.example.residenceapp.batiment.magasin.instrument.vent.utils.TypeInstrumentAVent;

public abstract class InstrumentAVent extends Instrument {

    private TypeInstrumentAVent typeVent;

    public InstrumentAVent(String nom, double prixAchat, double prixVente, String marque, TypeInstrumentAVent typeVent) {

        super(nom, prixAchat, prixVente, marque);
        this.typeVent = typeVent;
    }


    public TypeInstrumentAVent getTypeVent() {
        return typeVent;
    }

    public void setTypeVent(TypeInstrumentAVent typeVent) {
        this.typeVent = typeVent;
    }

    @Override
    public String toString() {
        return "\n" +
                "InstrumentAVent {" +
                "\n" +
                super.toString() +
                "\n" +
                "typeVent = " + typeVent +
                "\n" +
                "} " +
                "\n";
    }
}
