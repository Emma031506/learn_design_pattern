package com.cbseassignment.phase4;

public class ShibaInu extends Dog {
    public ShibaInu(String name, int age, BarkBehavior barkBehavior) {
        super(name, age, barkBehavior);
    }

    @Override
    public String display() {
        return "ShibaInu: " + getName();
    }
}
