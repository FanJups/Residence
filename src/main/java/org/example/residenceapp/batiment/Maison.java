package org.example.residenceapp.batiment;

import org.example.residenceapp.Impot;

public class Maison extends Batiment {
    private int nombrePiece;
    private double surfaceJardin;

    public Maison(){super();}

    public Maison(String adresse, double surfaceHabitable, Proprietaire proprietaire, int nombrePiece, double surfaceJardin) {

        super(adresse, surfaceHabitable, proprietaire);
        this.nombrePiece = nombrePiece;
        this.surfaceJardin = surfaceJardin;

    }

    public Maison(String adresse, double surfaceHabitable, int nombrePiece, double surfaceJardin) {

        super(adresse, surfaceHabitable);
        this.nombrePiece = nombrePiece;
        this.surfaceJardin = surfaceJardin;

    }

    public int getNombrePiece() {
        return nombrePiece;
    }

    public void setNombrePiece(int nombrePiece) {
        this.nombrePiece = nombrePiece;
    }

    public double getSurfaceJardin() {
        return surfaceJardin;
    }

    public void setSurfaceJardin(double surfaceJardin) {
        this.surfaceJardin = surfaceJardin;
    }


    @Override
    public double getImpot() {
        return super.getImpot() + Impot.TAUXB.getValue() * getSurfaceJardin();
    }

    @Override
    public String toString() {
        return "\n" +
                "Maison {" +
                "\n" +
                super.toString() +
                "\n" +
                "nombrePiece = " + nombrePiece +
                "\n" +
                "surfaceJardin = " + surfaceJardin +
                "\n" +
                "} " +
                "\n";
    }
}
