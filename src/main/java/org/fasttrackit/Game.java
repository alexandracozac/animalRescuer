package org.fasttrackit;

import java.util.ArrayList;
import java.util.List;
import java.lang.NullPointerException;
import java.util.Scanner;

public class Game {

    private Rescuer rescuer;
    private Animal animal;
    private Vet vet;



    private List<AnimalFood> availableFood = new ArrayList<AnimalFood>();
    private Activity[] availableActivities = new Activity[3];

    public void start() throws Exception {

        System.out.println("~~~~~~~~~~ Welcome to Animal Rescuer! ~~~~~~~~~~");

        initRescuer();
        initAnimal();
        nameAnimal();


        //initFood();
        //initActivities();

        //displayActivities();
        //displayFood();

        buyFood();

        int gameNumber = 1;
        boolean winnerNotKnown = true;

        while (winnerNotKnown && gameNumber <= 5) {
            System.out.println("New game...");

            requireFeeding();
            requireActivity();

            if (animal.getMood() <= 2 || animal.getHungerSensation() <= 2) {
                winnerNotKnown = false;
                System.out.println("You haven't look after your animal! You LOST! :(");
                System.out.println("Try again!");
                gameNumber++;
            } else winnerNotKnown = true;


            if (winnerNotKnown) {
                System.out.println("Congratulations! You took care of your animal! YOU WON!");
            }

        }
        if (gameNumber == 5) {
            System.out.println("You can't play with your animal until its recovery!");
        }
    }


    private void initAnimal() {


        System.out.println("Choose your lovely pet ! " +
                "Dog or Bird ?");
        System.out.println("Type your option below ! ");

        Scanner scanner = new Scanner(System.in);
        String animalInput = scanner.nextLine();

        {
            if (animalInput.equals("dog") || animalInput.equals("Dog") || animalInput.equals("DOG")) {
                System.out.println("Your buddy in this game is a dog !");
            } else if (animalInput.equals("bird") || animalInput.equals("Bird") || animalInput.equals("BIRD")) {
                System.out.println("Your buddy in this game is a bird !");
            } else {
                System.out.println("Sorry! You can't start the game without typing a valid value!");
            }
        }

    }

    private void initRescuer() throws Exception{

        try {
            System.out.println("HELLO! Enter your name: ");
            Scanner scanner = new Scanner(System.in);
            String rescuerName = scanner.nextLine();
            if(rescuerName == null){
                throw new NullPointerException();
            } else {
                if(rescuerName.matches("[a-zA-Z]+")) {
                    System.out.println("You can start the game, " + rescuerName + " !");
                }else System.out.println("You can use only use letters!");
            }

        }catch (NullPointerException e){
            System.out.println("Please enter a valid value! You can't start the game otherwise!");
        }
    }

    private void nameAnimal(){

        System.out.println("Choose a name for your pet!");
        Scanner scanner = new Scanner(System.in);
        String animalName = scanner.nextLine();

        if(animalName.matches("[a-zA-Z]+")) {

            System.out.println("Your pet name is: " + animalName + " !");
        }else System.out.println("You can use only letters!");
    }



    private void requireFeeding(){

        System.out.println("Choose food for your animal from the list. ");

        initFood();
        displayFood();

        System.out.println("Type food here: ");
        Scanner scanner = new Scanner(System.in);
        String chosenFoodUser = scanner.nextLine();

        {
            if (chosenFoodUser.equals("pedigree beef food") || chosenFoodUser.equals("Pedigree Beef Food") || chosenFoodUser.equals("1")) {
                System.out.println("Chosen food is: " + chosenFoodUser);
            } else if (chosenFoodUser.equals("chicken flavour biscuits") || chosenFoodUser.equals("Chicken Flavour Biscuits")
                    || chosenFoodUser.equals("2")) {
                System.out.println("Chosen food is: " + chosenFoodUser);
            } else if(chosenFoodUser.equals("seeds mix") || chosenFoodUser.equals("Seeds Mix") || chosenFoodUser.equals("3")) {
                System.out.println("Chosen food is: " + chosenFoodUser);
            }

            else {
                System.out.println("Sorry! You can't start the game without choosing given values!");
            }
        }

    }

    private void requireActivity(){

        System.out.println("Play with your pet! Choose one activity!");

        initActivities();
        displayActivities();

        System.out.println("Select activity here: ");
        Scanner scanner = new Scanner(System.in);
        String chosenActivity = scanner.nextLine();

        {
            if (chosenActivity.equals("ball play") || chosenActivity.equals("Ball Play") || chosenActivity.equals("1")) {
                System.out.println("Chosen activity is: " + chosenActivity);
            } else if (chosenActivity.equals("running") || chosenActivity.equals("Running") || chosenActivity.equals("2")) {
                System.out.println("Chosen activity is: " + chosenActivity);
            } else if(chosenActivity.equals("singing") || chosenActivity.equals("Singing") || chosenActivity.equals("3")) {
                System.out.println("Chosen activity is: " + chosenActivity);
            }

            else {
                System.out.println("Sorry! You can't start the game without choosing given values!");
            }
        }

    }


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


    public void buyFood(){

        System.out.println("Your available money is: " + rescuer.getMoney() + ".");
        System.out.println("You want to buy new food? Y?/N?");
        Scanner scanner = new Scanner(System.in);
        String answer = scanner.nextLine();

        if(answer.equals("Y") || answer.equals("y")){
            System.out.println("Food price at this level is 20.");
            rescuer.setMoney((int) (rescuer.getMoney() - 20));
            System.out.println("You got new food in your cart!");
            System.out.println("Your new budget: " + rescuer.getMoney());
        }
        else if(answer.equals("N") || answer.equals("n")){
            System.out.println("You choose not to buy food! Thank you!");
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



}
