/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.patronstrategy;

import ConcretStrategy.Car;
import ConcretStrategy.MotorBike;
import Controller.StrategyController;

/**
 *
 * @author DEVIN ALZATE
 */
public class PatronStrategy {

    public static void main(String[] args) {
        StrategyController controller = new StrategyController(new Car());
        controller.EjectStrategy(false, false);
        
        StrategyController controller2 = new StrategyController(new MotorBike());
        controller2.EjectStrategy(true, true);
        
    }
}
