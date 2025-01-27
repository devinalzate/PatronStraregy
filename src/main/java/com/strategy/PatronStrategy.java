package com.strategy;

import javax.swing.SwingUtilities;

import com.strategy.ConcretStrategy.Car;
import com.strategy.ConcretStrategy.MotorBike;
import com.strategy.Controller.StrategyController;
import com.strategy.Vista.Vista;
public class PatronStrategy {

    public static void main(String[] args) {
        StrategyController controller = new StrategyController(new Car());
        controller.EjectStrategy(false, false);
        
        StrategyController controller2 = new StrategyController(new MotorBike());
        controller2.EjectStrategy(true, true);
        

        SwingUtilities.invokeLater(new Runnable(){

            @Override
            public void run() {
                new Vista();
            }

        });
    }
}
