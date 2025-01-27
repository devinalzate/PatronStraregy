package com.strategy.Vista;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

import com.strategy.ConcretStrategy.Car;
import com.strategy.ConcretStrategy.MotorBike;
import com.strategy.Controller.StrategyController;
import com.strategy.Vista.Informacion.Opciones;
import com.strategy.Vista.Informacion.pedales.pedales;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Vista extends JFrame {
    private Opciones opciones;
    private JButton seleccionar;
    public Vista(){
        setSize(700, 300);
        setTitle("Strategy");
        setLayout(new BorderLayout());
        

        opciones = new Opciones();

        add(opciones,BorderLayout.CENTER);

        seleccionar = new JButton("Seleccionar Vehiculo");

        add(seleccionar, BorderLayout.SOUTH);

        
        seleccionar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                StrategyController controller;
                if (opciones.getVehiculo() == "Car") {
                    controller = new StrategyController(new Car());
                    SwingUtilities.invokeLater(() -> {
                        new pedales(controller);
                    });
                }else if(opciones.getVehiculo() == "Moto"){
                    controller = new StrategyController(new MotorBike());
                    SwingUtilities.invokeLater(() -> {
                        new pedales(controller);
                    });
                }
                
            }
            
        });

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}
