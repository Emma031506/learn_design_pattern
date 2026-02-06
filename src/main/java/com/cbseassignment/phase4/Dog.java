package com.cbseassignment.phase4;

public abstract class Dog {
    private String name;
    private int age;
    private BarkBehavior barkBehavior;

    public Dog(String name, int age, BarkBehavior barkBehavior) {
        this.name = name;
        this.age = age;
        this.barkBehavior = barkBehavior;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String eat() {
        return "Dog is eating";
    }

    public String sleep() {
        return "Dog is sleeping";
    }

    public String performBark() {
        return barkBehavior.bark();
    }

    public void setBarkBehavior(BarkBehavior barkBehavior) {
        this.barkBehavior = barkBehavior;
    }

    public abstract String display();
}
