package com.cbseassignment.phase2;

public class ShibaInu extends Dog {
    public ShibaInu(String name, int age) {
        super(name, age);
    }

    @Override
    public String bark() {
        return "Woof";
    }

    @Override
    public String display() {
        return "ShibaInu: " + getName();
    }
}
