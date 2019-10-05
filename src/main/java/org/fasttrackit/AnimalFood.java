package org.fasttrackit;


import java.time.LocalDate;


public class AnimalFood {

    private String name;
    private double price;
    private int quantity; //in kg
    private LocalDate expirationDate;
    private boolean stockAvailability;
    private String foodType;
    private String foodFor;
    private String recommendedForAge;
    private double dose; //in mg

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public LocalDate getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(LocalDate expirationDate) {
        this.expirationDate = expirationDate;
    }

    public boolean isStockAvailability() {
        return stockAvailability;
    }

    public void setStockAvailability(boolean stockAvailability) {
        this.stockAvailability = stockAvailability;
    }

    public String getFoodType() {
        return foodType;
    }

    public void setFoodType(String foodType) {
        this.foodType = foodType;
    }

    public String getFoodFor() {
        return foodFor;
    }

    public void setFoodFor(String foodFor) {
        this.foodFor = foodFor;
    }

    public String getRecommendedForAge() {
        return recommendedForAge;
    }

    public void setRecommendedForAge(String recommendedForAge) {
        this.recommendedForAge = recommendedForAge;
    }

    public double getDose() {
        return dose;
    }

    public void setDose(double dose) {
        this.dose = dose;
    }
}
