/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.strategy.ConcretStrategy;

import com.strategy.InterfaceAcelerate.Acelerate;

/**
 *
 * @author DEVIN ALZATE
 */
public class MotorBike implements Acelerate{

    @Override
    public String acelerate(boolean closh, boolean acelerate) {
        if(closh == false && acelerate == false){
            return "La moto esta apagada";
        }else if(closh == true && acelerate == false){
            return "Falta acelerar la moto";
        }else if(closh == true && acelerate == true){
            return " !BRRRM BRRM¡ Moto acelerada";
        }else if(closh == false && acelerate == true){
            return "La moto intento acelerar pero se apago";

        }
            return null;
    }
    
    
    
    
    
}
