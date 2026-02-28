package com.cbseassignment.phase3;

public class Pomeranian extends Dog implements Barkable {

    public Pomeranian(String name, int age){
        super(name, age);
    }

    // @Override
    //  public String bark(){
    //     return "Yip yip";
    // }

    @Override
    public String display(){
        return "Pomeranian: Puff";
    }

    @Override
    public String bark(){
        return"Yip yip";
    }

}
