package com.cbseassignment.phase3;

public class ShibaInu extends Dog implements Barkable {
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
