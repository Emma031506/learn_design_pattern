package com.cbseassignment.phase4;

public class ShibaInu extends Dog  {

    public ShibaInu(String name, int age,BarkBehavior barkBehavior){
        super(name,age, barkBehavior);
    }

    public String eat(){ 
        
        return "Dog is eating";
    }

    public String sleep(){
        
        return "Dog is sleeping";
    }

    

    @Override
    public String display(){
        return "ShibaInu: Hana";
    }
}
