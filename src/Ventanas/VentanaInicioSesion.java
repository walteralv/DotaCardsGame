package Ventanas;

import Principal.DotaBase;
import Principal.User;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaInicioSesion {
    private JPanel rootPanel;
    private JTextField mailTextF;
    private JPasswordField passwordField1;
    private JButton iniciarSesionButton;
    private JButton registrarseButton;
    private JLabel invalidMail;
    private JLabel invalidPass;

    private DotaBase dota ;
    private String mail ;
    private String pass;
    private User user;

    private final Color purple = new Color(147,129,153);
    private final Color red = new Color(127,33,54);
    VentanaRegistro vr ;
    VentanaPrincipal vp ;

    public VentanaInicioSesion(DotaBase dota) {
        this.dota = dota ;
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
                v.setVisible(false);
                v.dispose();
                vr = new VentanaRegistro(dota);
            }
        });

        iniciarSesionButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mail = mailTextF.getText();
                pass = new String(passwordField1.getPassword());
                boolean c = true ,p = true ;
                System.out.println(mail);
                System.out.println(pass);

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

                if (c && p){
                    user = dota.buscarUser(mail,pass);
                    if (user!=null){
                        System.out.println("exito");///////////////
                        v.setVisible(false);
                        v.dispose();
                        vp = new VentanaPrincipal(user,dota);

                    }else {
                        JOptionPane.showMessageDialog(null,"Usuario no encontrado o contraseña incorrecta!");
                    }
                }
            }
        });
    }

    public static void main(String[] args) {
        DotaBase dota = new DotaBase();
        User walter = new User("walter","mango@gmail.com","hola123");
        dota.registrarUsuario(walter);
        System.out.println(walter == dota.buscarUser("mango@gmail.com","hola123"));

        VentanaInicioSesion v = new VentanaInicioSesion(dota);
    }

}