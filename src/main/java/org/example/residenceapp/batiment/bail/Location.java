package org.example.residenceapp.batiment.bail;

public abstract class Location {

    private Locataire locataire;

    public Location(Locataire locataire) {

        this.locataire = locataire;
    }

    public Locataire getLocataire() {
        return locataire;
    }

    public void setLocataire(Locataire locataire) {
        this.locataire = locataire;
    }

    protected abstract void bail(Locataire locataire);
}
