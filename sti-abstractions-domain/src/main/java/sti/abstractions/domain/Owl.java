package sti.abstractions.domain;

public class Owl extends Animal implements Aviator{

    int wingSpan;

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
