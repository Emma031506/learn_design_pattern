package com.cbseassignment.phase3;

public class Dog {
    private String name;
    private int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
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

    public String display() {
        return "Dog: " + name;
    }
}
