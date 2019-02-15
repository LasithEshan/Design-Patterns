package com.company.designPatterns.FactoryPattern;

public class HondaRobot extends  iRobot {

    String state = "Idle";

    public String getState(){
        return this.state;
    }

    public void setState(String state){
        this.state = state;
    }

    @Override
    public void move() {
        System.out.println("Honda robot moves!");
        setState("moving");
    }

    @Override
    public void talk() {
        System.out.println("Honda robot talks!");
        setState("talking");
    }
}
