package sti.abstractions.service;

import sti.abstractions.domain.Owl;
import sti.abstractions.domain.PineTree;
import sti.abstractions.domain.Squirrel;

public interface ForestService {

    public /*abstract*/ Owl createOwl(int wingSpan);

    public Squirrel createSquirrel(int age, String name);

    public PineTree createPineTree(int numOfPineCones);

}
