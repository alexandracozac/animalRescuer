package org.fasttrackit;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Vet vet = new Vet();
        vet.name = "L. Travis";
        vet.specialty = "Surgery";

        Animal animal = new Animal();
        animal.name = "Ginger";
        animal.age = 1;
        animal.healthRange = 8;
        animal.hungerSensation = 5;
        animal.mood = 8;
        animal.favouriteFood = "Beef Dog Food";
        animal.favouriteActivity = "Ball Play";

        Rescuer rescuer = new Rescuer();
        rescuer.name = "Mark George";
        rescuer.salary = 2500;

        AnimalFood animalFood = new AnimalFood();
        animalFood.name = "Purina Wet Lamb Food";
        animalFood.price = 20;
        animalFood.quantity = 3;
        animalFood.expirationDate = "11-11-2019";
        animalFood.stockAvailability = true;


        Activity activity = new Activity();
        activity.name = "Playing outside";

        Game game = new Game();
        game.animalName = "Rocky";
        game.rescuerName = "Jane Marie";
        game.vetName = "C. Jackson";


    }
}
