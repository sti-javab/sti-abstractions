package sti.abstractions.domain;

import java.util.ArrayList;
import java.util.List;

public class PineTree extends Tree{

    List<PineCone> pineCones;

    public PineTree(int numOfPineCones){
        pineCones = new ArrayList<>();

        while(numOfPineCones > 0){
            pineCones.add(new PineCone());
            numOfPineCones--;
        }
    }

    static class PineCone{

        int calories;

        PineCone(){
            calories = Integer.parseInt(Math.round(Math.random()*10)+"");
        }

    }

}
