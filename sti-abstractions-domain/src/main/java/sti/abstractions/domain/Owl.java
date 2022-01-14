package sti.abstractions.domain;

import java.util.Date;

public class Owl extends Animal implements Aviator{

    int wingSpan;

    public Owl(){}

    public Owl(int wingSpan){
        setWingSpan(wingSpan);
    }

    public Owl(double weight, boolean hungry, Date dateOfBirth,int wingSpan){
        super(weight, hungry, dateOfBirth);
        setWingSpan(wingSpan);
    }

    public int getWingSpan() {
        return wingSpan;
    }

    public void setWingSpan(int wingSpan) {
        if(wingSpan >= 75 && wingSpan <= 100) {
            this.wingSpan = wingSpan;
        }else{
            this.wingSpan = 90;
        }
    }

    @Override
    boolean eat(Object food) {
        return false;
    }

    @Override
    public int fly(int minutesOfFlight, double distanceInMeters) {
        int speedInKmPerHour = 0; //@TODO fyll i algoritmen för distance
        return speedInKmPerHour;
    }
}
