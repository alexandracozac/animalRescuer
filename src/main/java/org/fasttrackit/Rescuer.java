package org.fasttrackit;

public class Rescuer extends Human {

    private String name;
    private String city;
    private int age;
    private String animalOwned;
    private boolean hasChildren;
    private int money;


    public void feed(Animal animal, AnimalFood animalFood ) {

        System.out.println("Hunger level of " + animal.getName() + " is now " + animal.getHungerSensation() + " /10.");

        //System.out.println(getName() + " just gave some " + animalFood.getName() + " food to " + animal.getName() + ".");

           if (animalFood.getName().equals(animal.getFavouriteFood())) {

               animal.setHungerSensation(animal.getHungerSensation() - 1);

           } System.out.println("Hunger lever changed and it is " + animal.getHungerSensation() + " /10.");
       }


    public void play(Animal animal, Activity activity) {

        System.out.println("Mood of " + animal.getName() + " is now " + animal.getMood() + " /10.");

        //System.out.println(getName() + " is playing with " + animal.getName() + " " + activity.getName() + " game.");
        //System.out.println(animal.getName() + "'s favourite activity is " + animal.getFavouriteActivity() + ".");

        if(activity.getName().equals(animal.getFavouriteActivity())) {

            animal.setMood(animal.getMood() + 1);

            System.out.println(animal.getName() + "'s mood is increasing and it is " + animal.getMood() + " /10.");
        }
        else System.out.println(animal.getName() + "'s mood hasn't changed and it is " + animal.getMood() + ".");



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

    public long getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}
