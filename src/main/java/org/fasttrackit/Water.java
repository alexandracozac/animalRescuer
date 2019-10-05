package org.fasttrackit;

public class Water {

    private double quantity;  //litres
    private double remainedQuantity;
    private boolean stillEnoughWater;

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public double getRemainedQuantity() {
        return remainedQuantity;
    }

    public void setRemainedQuantity(double remainedQuantity) {
        this.remainedQuantity = remainedQuantity;
    }

    public boolean isStillEnoughWater() {
        return stillEnoughWater;
    }

    public void setStillEnoughWater(boolean stillEnoughWater) {
        this.stillEnoughWater = stillEnoughWater;
    }
}
