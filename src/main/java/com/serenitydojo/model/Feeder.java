package com.serenitydojo.model;

public class Feeder {
    public FoodType feeds(String animal, boolean isPremium) {
        if (animal.equals("Cat")) {
            return (isPremium) ? FoodType.SALMON : FoodType.TUNA;
        } else if (animal.equals("Dog")) {
            return (isPremium) ? FoodType.DELUXE_DOG_FOOD : FoodType.DOG_FOOD;
        } else if (animal.equals("Hamster")) {
            return (isPremium) ? FoodType.LETTUCE : FoodType.CABBAGE;
        }
        return FoodType.UNKNOWN;

    }
}
