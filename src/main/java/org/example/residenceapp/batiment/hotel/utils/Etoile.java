package org.example.residenceapp.batiment.hotel.utils;

public enum Etoile {


    UN("\u2605\u2606\u2606\u2606\u2606"),
    DEUX("\u2605\u2605\u2606\u2606\u2606"),
    TROIS("\u2605\u2605\u2605\u2606\u2606"),
    QUATRE("\u2605\u2605\u2605\u2605\u2606"),
    CINQ("\u2605\u2605\u2605\u2605\u2605");

    private String stars;

    /**
     * @param stars
     */
    private Etoile(String stars) {
        this.stars = stars;
    }

    /**
     * @return the stars
     */
    public String getStars() {
        return stars;
    }

}
