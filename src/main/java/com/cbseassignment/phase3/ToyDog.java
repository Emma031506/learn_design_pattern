package com.cbseassignment.phase3;

public class ToyDog extends Dog {
    public ToyDog(String name, int age) {
        super(name, age);
    }

    @Override
    public String display() {
        return "ToyDog: " + getName();
    }
}
