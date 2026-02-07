package com.cbseassignment.phase2;

public class ToyDog extends Dog {

public ToyDog(String name, int age){
    super(name,age);
}

@Override
     public String bark(){
        return "...";
    }

    @Override
    public String display(){
        return "ToyDog: Tiny";
    }

    

}
