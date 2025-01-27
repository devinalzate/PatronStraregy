/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.patronstrategy;

import ConcretStrategy.Bike;
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
        System.out.println(controller.EjectStrategy());
        
        
    }
}
