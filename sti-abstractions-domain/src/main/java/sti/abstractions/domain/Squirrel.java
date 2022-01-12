package sti.abstractions.domain;

public class Squirrel extends Animal{

    @Override
    boolean eat(Object cone) {
        if(cone instanceof PineTree.PineCone){

        }
        return true;
    }

}
