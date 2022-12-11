package org.example.residenceapp.batiment.magasin.instrument.corde.piano;

public class PianoNumerique extends Piano {

    private boolean avoirToucherLourd;

    //  Valeurs possibles 1,2 ou 3
    private int qualiteEchantillonnage;


    public PianoNumerique(String nom, double prixAchat, double prixVente, String marque, double longueur, double largeur, int nombreTouche, boolean avoirToucherLourd, int qualiteEchantillonnage) {
        super(nom, prixAchat, prixVente, marque, longueur, largeur, nombreTouche);
        this.avoirToucherLourd = avoirToucherLourd;
        this.qualiteEchantillonnage = qualiteEchantillonnage;
    }


    public PianoNumerique(String nom, double prixAchat, double prixVente, String marque, double longueur, double largeur, boolean avoirToucherLourd, int qualiteEchantillonnage) {
        super(nom, prixAchat, prixVente, marque, longueur, largeur);
        this.avoirToucherLourd = avoirToucherLourd;
        this.qualiteEchantillonnage = qualiteEchantillonnage;
    }


    public boolean isAvoirToucherLourd() {
        return avoirToucherLourd;
    }

    public void setAvoirToucherLourd(boolean avoirToucherLourd) {
        this.avoirToucherLourd = avoirToucherLourd;
    }

    public int getQualiteEchantillonnage() {
        return qualiteEchantillonnage;
    }

    public void setQualiteEchantillonnage(int qualiteEchantillonnage) {

        if (qualiteEchantillonnage >= 1 && qualiteEchantillonnage <= 3) {

            this.qualiteEchantillonnage = qualiteEchantillonnage;

        } else {

            System.out.println("La qualité d'échantillonnage est comprise entre 1 et 3.");
        }

    }

}
