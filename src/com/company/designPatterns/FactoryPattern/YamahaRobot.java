package com.company.designPatterns.FactoryPattern;

public class YamahaRobot extends iRobot {

    String state ="idle";


    @Override
    public void move() {
        System.out.println("Yamaha robot moves!");
        setState("moving");
    }

    @Override
    public void talk() {
        System.out.println("Yamaha robot talks");
        setState("talking");
    }

    public String getState(){
        return this.state;
    }

    public void setState(String state){
        this.state = state;
    }


}
