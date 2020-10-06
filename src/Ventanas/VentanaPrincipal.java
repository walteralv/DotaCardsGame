package Ventanas;

import Principal.DotaBase;
import Principal.User;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaPrincipal {
    private JButton PLAY1VS1Button;
    private JButton PLAY3Vs3Button;
    private JButton cerrarSesionButton;
    private JButton ENQUEHEROEESTASButton;
    private JLabel welcomeUser;
    private JPanel rootPanel;

    private DotaBase dota ;
    private User user ;
    private VentanaInicioSesion vi;

    public VentanaPrincipal(User user, DotaBase dota) {
        this.user = user;
        this.dota = dota;
        welcomeUser.setText("Welcome "+user.getName()+"!");
        JFrame v = new JFrame();

        v.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        v.setContentPane(rootPanel);
        v.pack();
        v.setLocationRelativeTo(null);
        v.setVisible(true);

        cerrarSesionButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                v.setVisible(false);
                v.dispose();
                vi = new VentanaInicioSesion(dota);
            }
        });
    }
}
