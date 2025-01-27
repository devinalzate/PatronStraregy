package com.strategy.Vista.Informacion;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class Opciones extends JPanel {
    private ImageIcon imageMoto;
    private ImageIcon imageCarro;
    private JButton carroButton;
    private JButton motoButton;
    private JPanel vehiculos;
    private JLabel selecVehiculo;

    private String vehiculo = "";
    public Opciones(){
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        vehiculos = new JPanel();
        vehiculos.setLayout(new BoxLayout(vehiculos, BoxLayout.X_AXIS));

        imageMoto = new ImageIcon(getClass().getResource("./Images/moto.png"));
        motoButton = new JButton(imageMoto);
        motoButton.setPreferredSize(new Dimension(120,120));
        
        imageCarro = new ImageIcon(getClass().getResource("./Images/coche.png"));
        carroButton = new JButton(imageCarro);
        carroButton.setPreferredSize(new Dimension(120,120));

        selecVehiculo = new JLabel("Seleccione su vehiculo");
        selecVehiculo.setAlignmentX(CENTER_ALIGNMENT);
        carroButton.setAlignmentX(CENTER_ALIGNMENT);
        motoButton.setAlignmentX(CENTER_ALIGNMENT);

        vehiculos.add(carroButton);
        vehiculos.add(motoButton);
        add(selecVehiculo);
        add(vehiculos);
        
        carroButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                vehiculo = "Car";
            }
        });
        motoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                vehiculo = "Moto";
            }
        });
    }

    public String getVehiculo(){
        return vehiculo;
    }
}
