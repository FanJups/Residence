package org.example.residenceapp.batiment.magasin.instrument.corde.guitare;

import org.example.residenceapp.batiment.magasin.instrument.corde.guitare.utils.MateriauCordeGuitare;

public class GuitareElectrique extends Guitare {

    private boolean amplificateurInclus, pedalesEffetsSonores;

    public GuitareElectrique(String nom, double prixAchat, double prixVente, String marque, double longueur, double largeur, MateriauCordeGuitare materiauCordeGuitare, boolean amplificateurInclus, boolean pedalesEffetsSonores) {
        super(nom, prixAchat, prixVente, marque, longueur, largeur, materiauCordeGuitare);
        this.amplificateurInclus = amplificateurInclus;
        this.pedalesEffetsSonores = pedalesEffetsSonores;
    }

    public boolean isAmplificateurInclus() {
        return amplificateurInclus;
    }

    public void setAmplificateurInclus(boolean amplificateurInclus) {
        this.amplificateurInclus = amplificateurInclus;
    }

    public boolean isPedalesEffetsSonores() {
        return pedalesEffetsSonores;
    }

    public void setPedalesEffetsSonores(boolean pedalesEffetsSonores) {
        this.pedalesEffetsSonores = pedalesEffetsSonores;
    }

    @Override
    public String toString() {
        return "GuitareElectrique{"+ super.toString() +
                "amplificateurInclus=" + amplificateurInclus +
                ", pedalesEffetsSonores=" + pedalesEffetsSonores +
                "} " ;
    }
}
