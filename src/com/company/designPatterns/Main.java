package com.company.designPatterns;

import com.company.designPatterns.FactoryPattern.RobotFactory;
import com.company.designPatterns.FactoryPattern.iRobot;

public class Main {

    public static void main(String[] args) {

        RobotFactory rf1 = new RobotFactory();
        iRobot robot = rf1.createRobot(1);
        robot.move();
        robot.talk();







    }
}
