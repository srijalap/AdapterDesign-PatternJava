package org.example;

public class MallardDuck extends Duck {
    @Override
    public String quack() {
        System.out.println("Mallard Duck quacking");
        return "Mallard Duck quacking";

    }

    @Override
    public String fly() {
        System.out.println("Mallard Duck flying");
        return "Mallard Duck flying";

    }
}
