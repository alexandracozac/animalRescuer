package org.fasttrackit;

import java.util.ArrayList;
import java.util.List;
import java.lang.NullPointerException;

public class Game {

    private Rescuer rescuer;
    private Animal animal;
    private Vet vet;


    private List<AnimalFood> availableFood = new ArrayList<AnimalFood>();
    private Activity[] availableActivities = new Activity[3];



    private void initFood(){

        AnimalFood food1 = new AnimalFood("1. Pedigree Beef Food");
        availableFood.add(food1);

        AnimalFood food2 = new AnimalFood("2. Chicken Flavour Biscuits");
        availableFood.add(food2);

        AnimalFood food3 = new AnimalFood("3. Seeds Mix");
        availableFood.add(food3);


    }

    private void displayFood() {
        System.out.println("Available food: ");
        for (AnimalFood food : availableFood) {
            if(food != null){
                System.out.println(food.getName());
            }

        }
    }

    private void initActivities(){
        Activity activity1 = new Activity("1. Ball Play");
        availableActivities[0]=activity1;

        Activity activity2 = new Activity("2. Running");
        availableActivities[1]=activity2;

        Activity activity3 = new Activity("3. Singing");
        availableActivities[2]=activity3;


    }


    private void displayActivities() {
        System.out.println("Available activities: ");
        for( int i = 0; i <availableActivities.length; i++) {
            if(availableActivities[i] != null) {
                System.out.println(availableActivities[i].getName());
            }
            }
        }



    public Rescuer getRescuer() {
        return rescuer;
    }

    public void setRescuer(Rescuer rescuer) {
        this.rescuer = rescuer;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public Vet getVet() {
        return vet;
    }

    public void setVet(Vet vet) {
        this.vet = vet;
    }


    public void start(){

        initFood();
        initActivities();

        displayActivities();
        displayFood();

    }

}
