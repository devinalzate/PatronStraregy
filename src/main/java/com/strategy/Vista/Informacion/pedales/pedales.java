package com.strategy.Vista.Informacion.pedales;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import com.strategy.Controller.StrategyController;


public class pedales extends JFrame{
    private JLabel acel;
    private JLabel clutch;
    private JPanel acelPanel;
    private JPanel clutchPanel;
    private ImageIcon imageAcel;
    private ImageIcon imageClutch;
    private JButton acelButton;
    private JButton clutchButton;
    private JPanel pedales;
    private JButton aplicar;
    private JButton volver;

    private Boolean acelerar = false;
    private Boolean embrague = false;
    public pedales (StrategyController vehiculo){
        // Configuración básica del JFrame
        setTitle("Ventana Pedales");
        setSize(500, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Centrar la ventana

        // Crear un JPanel principal con BoxLayout
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));

        // Configurar el panel para el acelerador
        imageAcel = new ImageIcon(getClass().getResource("../Images/acelerador.png"));
        acelButton = new JButton(imageAcel);
        acelButton.setPreferredSize(new Dimension(120, 120));
        acel = new JLabel("Acelerar");
        acel.setAlignmentX(CENTER_ALIGNMENT);
        acelButton.setAlignmentX(CENTER_ALIGNMENT);

        acelPanel = new JPanel();
        acelPanel.setLayout(new BoxLayout(acelPanel, BoxLayout.Y_AXIS));
        acelPanel.add(acel);
        acelPanel.add(acelButton);

        // Configurar el panel para el embrague
        imageClutch = new ImageIcon(getClass().getResource("../Images/embrague.png"));
        clutchButton = new JButton(imageClutch);
        clutchButton.setPreferredSize(new Dimension(120, 120));
        clutch = new JLabel("Embrague");
        clutch.setAlignmentX(CENTER_ALIGNMENT);
        clutchButton.setAlignmentX(CENTER_ALIGNMENT);
        

        clutchPanel = new JPanel();
        clutchPanel.setLayout(new BoxLayout(clutchPanel, BoxLayout.Y_AXIS));
        clutchPanel.add(clutch);
        clutchPanel.add(clutchButton);

        // Configurar el panel de pedales
        pedales = new JPanel();
        pedales.setLayout(new BoxLayout(pedales, BoxLayout.X_AXIS));
        pedales.add(acelPanel);
        pedales.add(clutchPanel);

        // Botón aplicar
        aplicar = new JButton("Aplicar");
        aplicar.setAlignmentX(CENTER_ALIGNMENT);

        volver = new JButton("Volver");
        volver.setAlignmentX(CENTER_ALIGNMENT);

        // Añadir todo al panel principal
        mainPanel.add(pedales);
        mainPanel.add(Box.createRigidArea(new Dimension(0, 10))); // Espaciado
        mainPanel.add(aplicar);
        mainPanel.add(Box.createRigidArea(new Dimension(0, 10))); // Espaciado
        mainPanel.add(volver);
        // Añadir el panel principal al JFrame
        add(mainPanel);

        setVisible(true);


        acelButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                
               
                    acelerar = !acelerar;
                
                System.out.println(acelerar);
            }
            
        });

        clutchButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                
                    embrague = !embrague;
                
                System.out.println(embrague);
            }
            
        });

        aplicar.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                String salida = vehiculo.EjectStrategy(getEmbrague(), getAcelerar());
                JOptionPane.showMessageDialog(null, salida);
            }
            
        });

        volver.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
            
        });
    }
    public Boolean getAcelerar(){
        return acelerar;
    }
    public Boolean getEmbrague(){
        return embrague;
    }
}
