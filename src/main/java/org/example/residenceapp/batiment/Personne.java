package org.example.residenceapp.batiment;

import java.util.Objects;

public class Personne {

    static int nombreTotalPersonnes = 0;

    private int idPersonne;
    private String nom;
    private String prenom;

    public Personne(String nom, String prenom) {

        Personne.nombreTotalPersonnes++;
        this.idPersonne = Personne.nombreTotalPersonnes;
        this.nom = nom;
        this.prenom = prenom;
    }

    public int getIdPersonne() {
        return idPersonne;
    }


    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Personne personne = (Personne) o;
        return idPersonne == personne.idPersonne;
    }

    @Override
    public int hashCode() {
        return Objects.hash(idPersonne);
    }

    @Override
    public String toString() {
        return "\n" +
                "Personne {" +
                "\n" +
                "idPersonne = " + idPersonne +
                "\n" +
                " nom = '" + nom + '\'' +
                "\n" +
                " prenom = '" + prenom + '\'' +
                "\n" +
                '}' +
                "\n";
    }
}
