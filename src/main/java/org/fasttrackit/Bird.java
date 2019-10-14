package org.fasttrackit;

public class Bird extends Animal {

    private String birdType;
    private boolean canFly;

    public Bird(String name) {
        super(name);
    }

    public String getBirdType() {
        return birdType;
    }

    public void setBirdType(String birdType) {
        this.birdType = birdType;
    }

    public boolean isCanFly() {
        return canFly;
    }

    public void setCanFly(boolean canFly) {
        this.canFly = canFly;
    }
}
