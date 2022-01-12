package sti.abstractions.domain;

public class Owl extends Animal implements Aviator{

    private int wingSpan;

    private static final int DEFAULT_WINGSPAN = 90;

    public Owl(int wingSpan){
        setWingSpan(wingSpan);
    }

    public int getWingSpan() {
        return wingSpan;
    }

    public void setWingSpan(int wingSpan) {
        if(wingSpan >=75 && wingSpan <= 110) {
            this.wingSpan = wingSpan;
        }else{
            this.wingSpan = DEFAULT_WINGSPAN;
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
