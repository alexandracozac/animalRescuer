package org.fasttrackit;

import java.time.LocalDate;

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
        vet.yearsOfExperience = 5;
        vet.city = "London";
        vet.graduatedCollege = "Royal Veterinary College";

        Animal animal = new Animal();
        animal.name = "Ginger";
        animal.age = 1;
        animal.healthRange = 8;
        animal.hungerSensation = 5;
        animal.mood = 8;
        animal.favouriteFood = "Beef Dog Food";
        animal.favouriteActivity = "Ball Play";
        animal.energyLevel = 8.5;
        animal.weight = 25;
        animal.ownerName = "R. Michael";

        Rescuer rescuer = new Rescuer();
        rescuer.name = "Mark George";
        rescuer.salary = 2500;
        rescuer.age = 25;
        rescuer.city = "London";
        rescuer.animalOwned = "Ginger";
        rescuer.hasChildren = false;

        AnimalFood animalFood = new AnimalFood();
        animalFood.name = "Purina Lamb Taste";
        animalFood.price = 20;
        animalFood.quantity = 3;
        animalFood.expirationDate = LocalDate.of(2020,06,12);
        animalFood.stockAvailability = true;
        animalFood.dose = 200;
        animalFood.foodFor = "Dogs";
        animalFood.foodType = "Wet Food";
        animalFood.recommendedForAge = "2-4";


        Activity activity = new Activity();
        activity.name = "Ball Play";
        activity.involvedObjects = "Ball";
        activity.duration = 30;
        activity.timesPerDay = 2;
        activity.energyRequired = 3;

        Adoptions adoptions = new Adoptions();
        adoptions.adoptionDate = LocalDate.of(2019,9,2);
        adoptions.adoptionNumber = 1;
        adoptions.animalName = "Nero";
        adoptions.animalType = "Dog";
        adoptions.rescuerName = "Anne Marie";

        Medication medication = new Medication();
        medication.doseInMg = 20;
        medication.nameOfDrug = "Amoxicilin";
        medication.adverseEffects = "Skin Rashes";
        medication.notRecommendedIf = "Gestant";
        medication.medicationFor = "Antibacterial";

        VetControl vetControl = new VetControl();
        vetControl.animalName = "Nero";
        vetControl.controlDate = LocalDate.of(2019,8,27);
        vetControl.diagnosis = "Urinary Infection";
        vetControl.dose = 30;
        vetControl.hospitalization = false;
        vetControl.medicationName = "Ceftiofur";
        vetControl.ownerName = "John Legend";
        vetControl.vetName = "L. Travis";

        Water water = new Water();
        water.quantity = 2;
        water.remainedQuantity = 0.5;
        water.stillEnoughWater = true;

        Dog dog = new Dog();
        dog.allergicTo = "Baytril";
        dog.breed = "Shiba Inu";

        Bird bird = new Bird();
        bird.birdType = "Parrot";
        bird.canFly = true;

        Human human = new Human();
        human.eyesColor = "blue";
        human.hairColor = "black";
        human.gender = "male";
        human.nationality = "british";
















    }
}
