package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Duck mallardDuck = new MallardDuck();
        System.out.println("Mallard Duck:");
        mallardDuck.quack();
        mallardDuck.fly();

        System.out.println("\nTurkeyAdapter:");
        Turkey wildTurkey = new WildTurkey();
        Duck turkeyAdapter = new TurkeyAdapter(wildTurkey);
        turkeyAdapter.quack();
        turkeyAdapter.fly();

        System.out.println("\nWild Turkey:");
        wildTurkey.gobble();
        wildTurkey.flyShortDistance();
    }
    }
