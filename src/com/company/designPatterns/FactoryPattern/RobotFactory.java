package com.company.designPatterns.FactoryPattern;

public class RobotFactory {


    public RobotFactory() {
    }

    public iRobot createRobot(int level){
//        switch (level) {
//            case 1:
//                return new HondaRobot();
//            break;
//            case 2:
//                return new YamahaRobot();
//        }
        if( level == 1){
            return new HondaRobot();
        } else return new YamahaRobot();

    }
}
