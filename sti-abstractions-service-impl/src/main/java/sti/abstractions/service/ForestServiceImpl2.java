package sti.abstractions.service;

import sti.abstractions.domain.Owl;
import sti.abstractions.domain.PineTree;
import sti.abstractions.domain.Squirrel;

public class ForestServiceImpl2 implements ForestService{
    @Override
    public Owl createOwl(int wingSpan) {
        Owl owl = new Owl(wingSpan);
        System.out.println("Impl2");
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

    @Override
    public Boolean killOwl(Owl owl) {
        return null;
    }
}
