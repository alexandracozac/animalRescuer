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

        Vet vet = new Vet("L. Travis","Surgery");
        vet.setName("L. Travis");
        vet.setSpecialty("Surgery");
        vet.setYearsOfExperience(5);
        vet.setCity("London");
        vet.setGraduatedCollege("Royal Veterinary College");

        Animal animal = new Animal("Ginger");
        animal.setName("Ginger");
        animal.setAge(1);
        animal.setHealthRange(8);
        animal.setHungerSensation(5);
        animal.setMood(8);
        animal.setFavouriteFood("Beef Dog Food");
        animal.setFavouriteActivity("Ball Play");
        animal.setEnergyLevel(8.5);
        animal.setWeight(25);
        animal.setOwnerName("R. Michael");

        Rescuer rescuer = new Rescuer("Mark George");
        rescuer.setName("Mark George");
        rescuer.setSalary(2500);
        rescuer.setAge(25);
        rescuer.setCity("London");
        rescuer.setAnimalOwned("Ginger");
        rescuer.setHasChildren(false);

        rescuer.feed("Lucky", "Purina Beef", 8);
        rescuer.play("Ginger","ball",7);

        AnimalFood animalFood = new AnimalFood("Purina Lamb Taste");
        animalFood.setName("Purina Lamb Taste");
        animalFood.setPrice(20);
        animalFood.setQuantity(3);
        animalFood.setExpirationDate(LocalDate.of(2020,06,12));
        animalFood.setStockAvailability(true);
        animalFood.setDose(200);
        animalFood.setFoodFor("Dogs");
        animalFood.setFoodType("Wet Food");
        animalFood.setRecommendedForAge("2-4");


        Activity activity = new Activity("Ball Play");
        activity.setName("Ball Play");
        activity.setInvolvedObjects("Ball");
        activity.setDuration(30);
        activity.setTimesPerDay(2);
        activity.setEnergyRequired(3);

        Adoptions adoptions = new Adoptions("Anne Marie");
        adoptions.setAdoptionDate(LocalDate.of(2019,9,2));
        adoptions.setAdoptionNumber(1);
        adoptions.setAnimalName("Nero");
        adoptions.setAnimalType("Dog");
        adoptions.setRescuerName("Anne Marie");

        Medication medication = new Medication("Amoxicilin","Skin Rashes");
        medication.setDoseInMg(20);
        medication.setNameOfDrug("Amoxicilin");
        medication.setAdverseEffects("Skin Rashes");
        medication.setNotRecommendedIf("Gestant");
        medication.setMedicationFor("Antibacterial");

        VetControl vetControl = new VetControl("Derek Dawson","Nero","Urinary infection","Ceftiofur");
        vetControl.setAnimalName("Nero");
        vetControl.setControlDate(LocalDate.of(2019,8,27));
        vetControl.setDiagnosis("Urinary Infection");
        vetControl.setDose(30);
        vetControl.setHospitalization(false);
        vetControl.setMedicationName("Ceftiofur");
        vetControl.setOwnerName("John Legend");
        vetControl.setVetName("L. Travis");

        Water water = new Water();
        water.setQuantity(2);
        water.setRemainedQuantity(0.5);
        water.setStillEnoughWater(true);

        Dog dog = new Dog("Bella");
        dog.setAllergicTo("Baytril");
        dog.setBreed("Shiba Inu");

        Bird bird = new Bird("Coco");
        bird.setBirdType("Parrot");
        bird.setCanFly(true);

        Human human = new Human();
        human.setEyesColor("blue");
        human.setHairColor("black");
        human.setGender("male");
        human.setNationality("british");

        //System.out.println("My new dog is " + animal.getName() + ".");














    }
}
