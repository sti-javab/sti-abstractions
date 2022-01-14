package sti.abstractions.domain;

import java.util.Date;

public abstract class Animal {

    protected double weight;

    protected boolean hungry;

    protected Date dateOfBirth;

    public Animal(){}

    public Animal(double weight, boolean hungry, Date dateOfBirth) {
        this.weight = weight;
        this.hungry = hungry;
        this.dateOfBirth = dateOfBirth;
    }

    public double getWeight() {
        return weight;
    }

    //@TODO weight cannot be negative
    public void setWeight(double weight) {
        this.weight = weight;
    }

    public boolean changeHungry() {
        return !hungry;
    }

    abstract boolean eat(Object food);

}
