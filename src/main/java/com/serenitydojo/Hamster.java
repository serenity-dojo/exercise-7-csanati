package com.serenitydojo;

public class Hamster extends Pet {
    private String favoriteToy;

    public Hamster(String name, String favoriteToy, int age) {
        super(name, age);
        this.favoriteToy = favoriteToy;
    }

    public String getFavoriteToy() {
        return favoriteToy;
    }
    @Override
    public String play() {
        return "runs in wheel";
    }
}