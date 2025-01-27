/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.strategy.Controller;

import com.strategy.InterfaceAcelerate.Acelerate;

/**
 *
 * @author DEVIN ALZATE
 */
public class StrategyController {
    private Acelerate acelerate;

    public StrategyController(Acelerate acelerate) {
        this.acelerate = acelerate;
    }
    
    
    public String EjectStrategy(boolean one, boolean two){
        return acelerate.acelerate(one, two);
    }
}
