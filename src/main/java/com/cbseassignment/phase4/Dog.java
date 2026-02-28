package com.cbseassignment.phase4;

public abstract class Dog{

    String name;
    int age;
    BarkBehavior barkBehavior;


    public Dog(String name, int age, BarkBehavior barkBehavior) {
        this.name = name;
        this.age = age;
        this.barkBehavior= barkBehavior;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // public String bark(){
    //     return null;
    // }

    public abstract String display();

    public String performBark(){
        return barkBehavior.bark();
    }

    public void  setBarkBehavior(BarkBehavior barkBehavior){
        this.barkBehavior=barkBehavior;
    }
    

}
