package sti.abstractions.domain;

public class Main {

    //@TODO make it a story!
    public static void main(String[] args) {
        Owl oliver = new Owl(-10);
        System.out.println("olivers wingSpan: "+ oliver.getWingSpan());
        Squirrel squiggie = new Squirrel();
        PineTree pine = new PineTree(12);
        System.out.println(pine.pineCones.size());
        squiggie.eat(pine.pineCones.get(0));
    }

}
