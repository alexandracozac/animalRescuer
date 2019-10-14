package org.fasttrackit;

public class Rescuer extends Human {

    private String name;
    private String city;
    private int age;
    private String animalOwned;
    private boolean hasChildren;
    private long salary;


    public void feed(String animalName, String foodName, int hungerSensation) {

        System.out.println(name + " just gave some " + foodName + " food to " + animalName + ".");

        hungerSensation = hungerSensation - 1;
        System.out.println("Hunger level is now " + hungerSensation + "/10.");
    }



    public void play(String animalName, String activityName, int mood) {

        System.out.println(name + " is playing with " + animalName + " " + activityName + " game.");

        mood = mood + 2;
        System.out.println("Animal mood is rising. This is " + mood + " now.");


    }


    public Rescuer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAnimalOwned() {
        return animalOwned;
    }

    public void setAnimalOwned(String animalOwned) {
        this.animalOwned = animalOwned;
    }

    public boolean isHasChildren() {
        return hasChildren;
    }

    public void setHasChildren(boolean hasChildren) {
        this.hasChildren = hasChildren;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }
}
