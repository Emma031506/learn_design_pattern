package com.cbseassignment.phase4;

public class ToyDog extends Dog {
    public ToyDog(String name, int age, BarkBehavior barkBehavior) {
        super(name, age, barkBehavior);
    }

    @Override
    public String display() {
        return "ToyDog: " + getName();
    }
}
