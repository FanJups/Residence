package org.example.residenceapp.batiment.magasin.instrument;

public abstract class Instrument {

    private String nom;
    private double prixAchat, prixVente;

    private String marque;


    public Instrument(String nom, double prixAchat, double prixVente, String marque) {
        this.nom = nom;
        this.prixAchat = prixAchat;
        this.prixVente = prixVente;
        this.marque = marque;
    }

    public Instrument() {

    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public double getPrixAchat() {
        return prixAchat;
    }

    public void setPrixAchat(double prixAchat) {
        this.prixAchat = prixAchat;
    }

    public double getPrixVente() {
        return prixVente;
    }

    public void setPrixVente(double prixVente) {
        this.prixVente = prixVente;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    @Override
    public String toString() {
        return "\n" +
                "Instrument {" +
                "\n" +
                "nom = '" + nom + '\'' +
                "\n" +
                " prixAchat = " + prixAchat +
                "\n" +
                " prixVente = " + prixVente +
                "\n" +
                " marque = '" + marque + '\'' +
                "\n" +
                '}' +
                "\n";
    }

}
