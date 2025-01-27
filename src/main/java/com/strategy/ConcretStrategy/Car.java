package com.strategy.ConcretStrategy;

import com.strategy.InterfaceAcelerate.Acelerate;

/**
 *
 * @author DEVIN ALZATE
 */
public class Car implements Acelerate{

    @Override
    public String acelerate(boolean closh, boolean acelerate) {
        if(closh == false && acelerate == false){
            return ("El carro esta apagado");
        }else if(closh == true && acelerate == false){
            return ("Falta acelerar el carro");
        }else if(closh == true && acelerate == true){
            return ("¡BEEP BEEP! Carro acelerado");
        }else if(acelerate == true && closh == false){
            return "El carro intento acelerar pero se apago";
        }
            return null;
    }
    
    
    
}
