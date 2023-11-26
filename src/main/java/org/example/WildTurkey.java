package org.example;

public class WildTurkey extends Turkey{
    @Override
    public String gobble() {
        System.out.println("Wild Turkey gobbling");
        return "Wild Turkey gobbling";
    }

    @Override
    public String flyShortDistance() {
        System.out.println("Wild Turkey flying a short distance");
        return "Wild Turkey flying a short distance";

    }
}
