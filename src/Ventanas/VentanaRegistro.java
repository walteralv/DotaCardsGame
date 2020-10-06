package Ventanas;

import Principal.DotaBase;
import Principal.User;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaRegistro {

    private JPanel rootPanel;
    private JButton registrarseButton;
    private JButton iniciarSesionButton;
    private JTextField mailTextF;
    private JPasswordField passwordField1;
    private JTextField nameTextF;
    private JLabel invalidName;
    private JLabel invalidMail;
    private JLabel invalidPass;

    private DotaBase dota ;
    private Color purple = new Color(147,129,153);
    private Color red = new Color(127,33,54);
    private VentanaInicioSesion vi ;

    public VentanaRegistro(DotaBase dota) {

        this.dota = dota;

        invalidName.setForeground(purple);
        invalidMail.setForeground(purple);
        invalidPass.setForeground(purple);

        JFrame v = new JFrame();
        v.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        v.setContentPane(rootPanel);
        v.pack();
        v.setLocationRelativeTo(null);
        v.setVisible(true);


        registrarseButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String mail = mailTextF.getText();
                String pass = new String(passwordField1.getPassword());
                String name =   nameTextF.getText();

                boolean n = true, c = true ,p = true ;
                System.out.println(name);
                System.out.println(mail);
                System.out.println(pass);

                if (pass.matches("^[\\w-_]{6,16}$")){
                    invalidName.setForeground(purple);
                }else {
                    invalidName.setForeground(red);
                    n = false;
                }
                if ((mail.matches("^[\\w-.]+@([\\w-]+\\.)+[\\w-]{2,4}$"))) {
                    invalidMail.setForeground(purple);
                } else {
                    invalidMail.setForeground(red);
                    c = false;
                }

                if (pass.matches("^[\\w-_]{6,16}$")){
                    invalidPass.setForeground(purple);
                }else {
                    invalidPass.setForeground(red);
                    p = false;
                }

                if (n && c && p){
                    dota.registrarUsuario(new User(name,mail,pass));
                    JOptionPane.showMessageDialog(null,"Registro Exitoso!");
                    v.setVisible(false);
                    v.dispose();
                    vi = new VentanaInicioSesion(dota);
                }

            }
        });

        iniciarSesionButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                v.setVisible(false);
                v.dispose();
                vi = new VentanaInicioSesion(dota);
            }
        });
    }

    public static void main(String[] args) {
            VentanaRegistro v = new VentanaRegistro(null);

    }
}
