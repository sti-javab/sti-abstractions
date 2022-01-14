package sti.abstractions.service;

import sti.abstractions.domain.Owl;
import sti.abstractions.domain.PineTree;
import sti.abstractions.domain.Squirrel;

public class ForestServiceImpl implements ForestService{

    public Owl createOwl(int wingSpan){
        Owl owl = new Owl(wingSpan);
        return owl;
    }

    @Override
    public Squirrel createSquirrel(int age, String name) {
        return null;
    }

    @Override
    public PineTree createPineTree(int numOfPineCones) {
        return null;
    }

}
