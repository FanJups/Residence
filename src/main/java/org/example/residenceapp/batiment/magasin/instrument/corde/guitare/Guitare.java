package org.example.residenceapp.batiment.magasin.instrument.corde.guitare;

import org.example.residenceapp.batiment.magasin.instrument.corde.InstrumentACorde;
import org.example.residenceapp.batiment.magasin.instrument.corde.guitare.utils.MateriauCordeGuitare;

public abstract class Guitare extends InstrumentACorde {

    private MateriauCordeGuitare materiauCordeGuitare;

    public Guitare(String nom, double prixAchat, double prixVente, String marque, double longueur, double largeur, MateriauCordeGuitare materiauCordeGuitare) {
        super(nom, prixAchat, prixVente, marque, longueur, largeur);
        this.materiauCordeGuitare = materiauCordeGuitare;
    }

    public MateriauCordeGuitare getMateriauCordeGuitare() {
        return materiauCordeGuitare;
    }

    public void setMateriauCordeGuitare(MateriauCordeGuitare materiauCordeGuitare) {
        this.materiauCordeGuitare = materiauCordeGuitare;
    }

    @Override
    public String toString() {
        return "Guitare{"+ super.toString() +
                "materiauCordeGuitare=" + materiauCordeGuitare +
                "} " ;
    }
}
