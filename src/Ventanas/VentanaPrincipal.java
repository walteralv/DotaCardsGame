package Ventanas;

import Principal.DotaBase;
import Principal.User;
import com.ugos.jiprolog.engine.*;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

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

    private VentanaPicks1v1 ventanaPicks1v1;
    private Ventana3vs3Picks ventana3vs3Picks;

    public VentanaPrincipal(User user, DotaBase dota) {
        this.user = user;
        this.dota = dota;
        welcomeUser.setText("Welcome "+user.getName()+"!");
        JFrame v = new JFrame();
        VentanaPrincipal I = this ;
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

        PLAY1VS1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                v.setVisible(false);
                v.dispose();
                ventanaPicks1v1 = new VentanaPicks1v1(I);
            }
        });

        PLAY3Vs3Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                v.setVisible(false);
                v.dispose();
                ventana3vs3Picks = new Ventana3vs3Picks(I);
            }
        });
        ENQUEHEROEESTASButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                // New instance of prolog engine
                JIPEngine jip = new JIPEngine();

                JIPTerm queryTerm = null;

                // parse query
                try
                {
                    // consult file
                    jip.consultFile("src\\Principal\\pro.pl");

                    queryTerm = jip.getTermParser().parseTerm("mano.");

                }
                catch(JIPSyntaxErrorException | IOException ex)
                {
                    ex.printStackTrace();
                    System.exit(0);
                }


                JIPQuery jipQuery = jip.openSynchronousQuery(queryTerm);
                JIPTerm solution;

                solution = jipQuery.nextSolution();

                JIPVariable[] vars = solution.getVariables();

            }
        });
    }
//////////////////////////////////////////////////////
    public JButton getPLAY1VS1Button() {
        return PLAY1VS1Button;
    }

    public void setPLAY1VS1Button(JButton PLAY1VS1Button) {
        this.PLAY1VS1Button = PLAY1VS1Button;
    }

    public JButton getPLAY3Vs3Button() {
        return PLAY3Vs3Button;
    }

    public void setPLAY3Vs3Button(JButton PLAY3Vs3Button) {
        this.PLAY3Vs3Button = PLAY3Vs3Button;
    }

    public JButton getCerrarSesionButton() {
        return cerrarSesionButton;
    }

    public void setCerrarSesionButton(JButton cerrarSesionButton) {
        this.cerrarSesionButton = cerrarSesionButton;
    }

    public JButton getENQUEHEROEESTASButton() {
        return ENQUEHEROEESTASButton;
    }

    public void setENQUEHEROEESTASButton(JButton ENQUEHEROEESTASButton) {
        this.ENQUEHEROEESTASButton = ENQUEHEROEESTASButton;
    }

    public JLabel getWelcomeUser() {
        return welcomeUser;
    }

    public void setWelcomeUser(JLabel welcomeUser) {
        this.welcomeUser = welcomeUser;
    }

    public JPanel getRootPanel() {
        return rootPanel;
    }

    public void setRootPanel(JPanel rootPanel) {
        this.rootPanel = rootPanel;
    }

    public DotaBase getDota() {
        return dota;
    }

    public void setDota(DotaBase dota) {
        this.dota = dota;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public VentanaInicioSesion getVi() {
        return vi;
    }

    public void setVi(VentanaInicioSesion vi) {
        this.vi = vi;
    }

    public VentanaPicks1v1 getVentanaPicks1v1() {
        return ventanaPicks1v1;
    }

    public void setVentanaPicks1v1(VentanaPicks1v1 ventanaPicks1v1) {
        this.ventanaPicks1v1 = ventanaPicks1v1;
    }




}
