package org.example.residenceapp.batiment.magasin.instrument.corde.piano;

import org.example.residenceapp.batiment.magasin.instrument.corde.piano.utils.TypeCordesPianoDroit;

public class PianoDroit extends Piano {

    private TypeCordesPianoDroit typeCordesPianoDroit;
    private boolean etreDoteSilencieux;


    public PianoDroit(String nom, double prixAchat, double prixVente, String marque, double longueur, double largeur, int nombreTouche,
                      TypeCordesPianoDroit typeCordesPianoDroit, boolean etreDoteSilencieux) {
        super(nom, prixAchat, prixVente, marque, longueur, largeur, nombreTouche);
        this.typeCordesPianoDroit = typeCordesPianoDroit;
        this.etreDoteSilencieux = etreDoteSilencieux;
    }

    public PianoDroit(String nom, double prixAchat, double prixVente, String marque, double longueur, double largeur,
                      TypeCordesPianoDroit typeCordesPianoDroit, boolean etreDoteSilencieux) {
        super(nom, prixAchat, prixVente, marque, longueur, largeur);
        this.typeCordesPianoDroit = typeCordesPianoDroit;
        this.etreDoteSilencieux = etreDoteSilencieux;
    }

    public boolean isEtreDoteSilencieux() {
        return etreDoteSilencieux;
    }

    public void setEtreDoteSilencieux(boolean etreDoteSilencieux) {
        this.etreDoteSilencieux = etreDoteSilencieux;
    }

    public TypeCordesPianoDroit getTypeCordesPianoDroit() {
        return typeCordesPianoDroit;
    }

    public void setTypeCordesPianoDroit(TypeCordesPianoDroit typeCordesPianoDroit) {
        this.typeCordesPianoDroit = typeCordesPianoDroit;
    }

    @Override
    public String toString() {
        return "PianoDroit{"+ super.toString() +
                "typeCordesPianoDroit=" + typeCordesPianoDroit +
                ", etreDoteSilencieux=" + etreDoteSilencieux +
                "} " ;
    }
}
