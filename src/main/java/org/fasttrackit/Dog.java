package org.fasttrackit;

public class Dog extends Animal {

    private String breed;
    private String allergicTo;


    @Override
    public void positiveMood() {
        System.out.println(getName() + " is wagging his/her tail! ");
    }

    public Dog(String name) {
        super(name);
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getAllergicTo() {
        return allergicTo;
    }

    public void setAllergicTo(String allergicTo) {
        this.allergicTo = allergicTo;
    }


}
