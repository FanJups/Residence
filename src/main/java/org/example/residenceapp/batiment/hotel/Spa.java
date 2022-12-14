package org.example.residenceapp.batiment.hotel;

import org.example.residenceapp.batiment.Proprietaire;

public class Spa {

    private Hotel hotel;


    public Hotel getHotel() {
        return hotel;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }

    public Proprietaire getProprietaire() {

        return hotel.getProprietaire();
    }

    @Override
    public String toString() {
        return "\n" +
                "Spa {" +
                "\n" +
                "Nombre d etoiles de l' hotel = " + hotel.getNbreEtoiles() +
                "\n" +
                "Proprietaire  de l' hotel = " + hotel.getProprietaire() +
                "\n" +
                '}' +
                "\n";
    }
}
