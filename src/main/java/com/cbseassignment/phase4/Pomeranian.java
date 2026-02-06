package com.cbseassignment.phase4;

public class Pomeranian extends Dog {
    public Pomeranian(String name, int age, BarkBehavior barkBehavior) {
        super(name, age, barkBehavior);
    }

    @Override
    public String display() {
        return "Pomeranian: " + getName();
    }
}
