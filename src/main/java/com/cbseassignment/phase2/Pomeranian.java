package com.cbseassignment.phase2;

public class Pomeranian extends Dog {

    public Pomeranian(String name, int age){
        super(name, age);
    }

    @Override
     public String bark(){
        return "Yip yip";
    }

    @Override
    public String display(){
        return "Pomeranian: Puff";
    }

}
