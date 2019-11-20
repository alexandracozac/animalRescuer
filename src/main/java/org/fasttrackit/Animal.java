package org.fasttrackit;

public class Animal {

    private String name;
    private int age;
    private double healthRange; //on a scale from 1 to 10
    private double hungerSensation; //on a scale from 1 to 10
    private double mood; //on a scale from 1 to 10
    private String favouriteFood;
    private String favouriteActivity;
    private double energyLevel; // on a scale from 1 to 10
    private double weight; // in kg
    private String ownerName;



    public void positiveMood() {
        System.out.println(getName() + " is happy!");
    }


    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHealthRange() {
        return healthRange;
    }

    public void setHealthRange(double healthRange) {
        this.healthRange = healthRange;
    }

    public double getHungerSensation() {
        return hungerSensation;
    }

    public void setHungerSensation(double hungerSensation) {
        this.hungerSensation = hungerSensation;
    }

    public double getMood() {
        return mood;
    }

    public void setMood(double mood) {
        this.mood = mood;
    }

    public String getFavouriteFood() {
        return favouriteFood;
    }

    public void setFavouriteFood(String favouriteFood) {
        this.favouriteFood = favouriteFood;
    }

    public String getFavouriteActivity() {
        return favouriteActivity;
    }

    public void setFavouriteActivity(String favouriteActivity) {
        this.favouriteActivity = favouriteActivity;
    }

    public double getEnergyLevel() {
        return energyLevel;
    }

    public void setEnergyLevel(double energyLevel) {
        this.energyLevel = energyLevel;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }
}
