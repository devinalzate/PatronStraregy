/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import InterfaceAcelerate.Acelerate;

/**
 *
 * @author DEVIN ALZATE
 */
public class StrategyController {
    private Acelerate acelerate;

    public StrategyController(Acelerate acelerate) {
        this.acelerate = acelerate;
    }
    
    
    public void EjectStrategy(boolean one, boolean two){
        acelerate.acelerate(one, two);
    }
}
