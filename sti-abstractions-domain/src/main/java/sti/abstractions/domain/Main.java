package sti.abstractions.domain;

import java.util.Scanner;

public class Main {

    //@TODO make it a story!
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Owl oliver = new Owl(-10);
        System.out.println("olivers wingSpan: "+ oliver.getWingSpan());
        Squirrel squiggie = new Squirrel();
        //PineTree pine = new PineTree(12);
        PineTree pine = null; //will result in NullPointerException

        squiggie.eat(pine.pineCones.get(0));

    }

}
