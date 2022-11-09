package sti.abstractions.garage;

public class Boat extends Vehicle{

    private int numOfMasts;

    public Boat(String color, int numOfMasts) {
        super(color);
        this.numOfMasts = numOfMasts;
    }

    public int getNumOfMasts() {
        return numOfMasts;
    }

    public void setNumOfMasts(int numOfMasts) {
        this.numOfMasts = numOfMasts;
    }
}
