package sti.abstractions.dao;

import sti.abstractions.domain.Owl;
import sti.abstractions.domain.PineTree;
import sti.abstractions.domain.Squirrel;

public interface ForestDao {

    Owl createOwl(int wingSpan);

    Squirrel createSquirrel(int age, String name);

    PineTree createPineTree(int numOfPineCones);

    Boolean killOwl(Owl owl);

}
