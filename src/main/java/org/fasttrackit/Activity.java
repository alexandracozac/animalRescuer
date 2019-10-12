package org.fasttrackit;

public class Activity {

    private String name;
    private String involvedObjects;
    private int energyRequired; //on a scale from 1 to 5
    private double duration; //in minutes
    private int timesPerDay;


    public Activity() {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInvolvedObjects() {
        return involvedObjects;
    }

    public void setInvolvedObjects(String involvedObjects) {
        this.involvedObjects = involvedObjects;
    }

    public int getEnergyRequired() {
        return energyRequired;
    }

    public void setEnergyRequired(int energyRequired) {
        this.energyRequired = energyRequired;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    public int getTimesPerDay() {
        return timesPerDay;
    }

    public void setTimesPerDay(int timesPerDay) {
        this.timesPerDay = timesPerDay;
    }
}
