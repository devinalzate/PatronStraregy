/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ConcretStrategy;

import InterfaceAcelerate.Acelerate;

/**
 *
 * @author DEVIN ALZATE
 */
public class Car implements Acelerate{

    @Override
    public void acelerate(boolean closh, boolean acelerate) {
        if(closh == false || acelerate == false){
            System.out.println("El carro esta apagado");
        }else if(closh == true || acelerate == false){
            System.out.println("Falta acelerar");
        }else if(closh == true || acelerate == true){
            System.out.println("Carro acelerado");
        }
    }
    
    
    
}
