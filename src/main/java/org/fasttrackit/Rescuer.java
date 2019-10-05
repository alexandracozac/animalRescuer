package org.fasttrackit;

public class Rescuer extends Human {

    private String name;
    private String city;
    private int age;
    private String animalOwned;
    private boolean hasChildren;
    private long salary;

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
