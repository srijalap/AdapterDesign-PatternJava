package org.example;

public class TurkeyAdapter extends Duck{
    private Turkey turkey;

    public TurkeyAdapter(Turkey turkey) {
        this.turkey = turkey;
    }

    @Override
    public String quack() {
        turkey.gobble();
        return "gobble";

    }

    @Override
    public String fly() {
        turkey.flyShortDistance();
        return "flyShortDistance";
    }
}
