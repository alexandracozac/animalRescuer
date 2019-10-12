package org.fasttrackit;

import java.time.LocalDate;


public class Adoptions {

    private String rescuerName;
    private int adoptionNumber;
    private String animalName;
    private String animalType;
    private LocalDate adoptionDate;

    public Adoptions() {
        this.rescuerName = rescuerName;
        this.animalName = animalName;
    }

    public String getRescuerName() {
        return rescuerName;
    }

    public void setRescuerName(String rescuerName) {
        this.rescuerName = rescuerName;
    }

    public int getAdoptionNumber() {
        return adoptionNumber;
    }

    public void setAdoptionNumber(int adoptionNumber) {
        this.adoptionNumber = adoptionNumber;
    }

    public String getAnimalName() {
        return animalName;
    }

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    public String getAnimalType() {
        return animalType;
    }

    public void setAnimalType(String animalType) {
        this.animalType = animalType;
    }

    public LocalDate getAdoptionDate() {
        return adoptionDate;
    }

    public void setAdoptionDate(LocalDate adoptionDate) {
        this.adoptionDate = adoptionDate;
    }
}
