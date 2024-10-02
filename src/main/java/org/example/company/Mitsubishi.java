package org.example.company;

public class Mitsubishi extends Car{
    public Mitsubishi(int cylinders, String name) {
        super(cylinders, name);
    }
    @Override
    public String startEngine(){
        return this.getName() +"'s engine is starting";
    }
    @Override
    public String accelerate(){
        return this.getName() +" is accelerating";
    }
    @Override
    public String  brake(){
        return this.getName() +" is braking";
    }

}
