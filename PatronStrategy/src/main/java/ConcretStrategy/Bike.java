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
public class Bike implements Acelerate{
    
    
    @Override
    public String acelerate() {
        return "La cicla ha comenzado a ser acelerada";
    }
}
