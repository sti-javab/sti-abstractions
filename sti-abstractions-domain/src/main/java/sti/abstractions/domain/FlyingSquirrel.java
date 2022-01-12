package sti.abstractions.domain;

public class FlyingSquirrel extends Squirrel implements Aviator{

    int wingspan;

    @Override
    public int fly(int minutesOfFlight, double distanceInMeters) {
        return 0;
    }
}
