package sti.abstractions.service;

import sti.abstractions.domain.Owl;

public class ForestServiceImpl {

    public Owl createOwl(int wingSpan){
        Owl owl = new Owl(wingSpan);
        return owl;
    }

}
