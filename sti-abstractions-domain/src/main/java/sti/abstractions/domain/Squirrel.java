package sti.abstractions.domain;

public class Squirrel extends Animal{

    private int age;

    private String name;

    private int numOfEatenCones = 0;

    private boolean hungry;

    public Squirrel(){}

    public Squirrel(int age, String name){
        this.age = age;
        this.name = name;
    }

    @Override
    boolean eat(Object cone) {
        if(cone instanceof PineTree.PineCone){
            numOfEatenCones++;
            return true;
        }
        return false;
    }

}
