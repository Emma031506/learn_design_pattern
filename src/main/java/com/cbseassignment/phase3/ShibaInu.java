package com.cbseassignment.phase3;

public class ShibaInu extends Dog implements Barkable {

    public ShibaInu(String name, int age){
        super(name,age);
    }

    public String eat(){ 
        
        return "Dog is eating";
    }

    public String sleep(){
        
        return "Dog is sleeping";
    }

    @Override
     public String bark(){
        return "Woof";
    }

    @Override
    public String display(){
        return "ShibaInu: Hana";
    }
}
