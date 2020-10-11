package Ventanas;

import Abstract.Hero;
import Abstract.IHeroFactory;
import ConcreteFactories.ConcreteHeroFactory;
import ConcreteFactories.RandomFactory;
import Principal.Map3vs3;
import Principal.Senda;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Ventana3vs3Picks {
    private JPanel rootPanel;
    private JComboBox comboBox1;
    private JComboBox comboBox2;
    private JComboBox comboBox3;
    private JButton button1;
    private JLabel iconHero1;
    private JLabel iconHero2;
    private JLabel iconHero3;
    private JFrame v ;

    private Ventana3vs3 ventana3vs3 ;
    private IHeroFactory factory ;

    public Ventana3vs3Picks(VentanaPrincipal vp) {
        JFrame v = new JFrame();
        v.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        v.setContentPane(rootPanel);
        v.pack();
        v.setLocationRelativeTo(null);
        v.setVisible(true);

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (!comboBox1.getSelectedItem().toString().equals("Random"))
                    factory = new ConcreteHeroFactory(comboBox1.getSelectedItem().toString());
                else
                    factory = new RandomFactory();

                Senda top = new Senda(factory.getHero(),new RandomFactory().getHero());


                if (!comboBox2.getSelectedItem().toString().equals("Random"))
                    factory = new ConcreteHeroFactory(comboBox2.getSelectedItem().toString());
                else
                    factory = new RandomFactory();

                Senda mid = new Senda(factory.getHero(),new RandomFactory().getHero());


                if (!comboBox3.getSelectedItem().toString().equals("Random"))
                    factory = new ConcreteHeroFactory(comboBox3.getSelectedItem().toString());
                else
                    factory = new RandomFactory();

                Senda bot = new Senda(factory.getHero(),new RandomFactory().getHero());

                System.out.println(top.getHero1()+" y "+top.getHero2());
                System.out.println(mid.getHero1()+" y "+mid.getHero2());
                System.out.println(bot.getHero1()+" y "+bot.getHero2());

                v.setVisible(false);
                v.dispose();
                ventana3vs3 = new Ventana3vs3(new Map3vs3(top,mid,bot),vp);
            }
        });

        comboBox1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!comboBox1.getSelectedItem().toString().equals("Random")) {
                    factory = new ConcreteHeroFactory(comboBox1.getSelectedItem().toString());
                    iconHero1.setIcon(factory.getHero().getIcon());
                } else
                    iconHero1.setIcon(new ImageIcon("src\\icons\\incognitHero.png"));
            }
        });


        comboBox2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!comboBox2.getSelectedItem().toString().equals("Random")) {
                    factory = new ConcreteHeroFactory(comboBox2.getSelectedItem().toString());
                    iconHero2.setIcon(factory.getHero().getIcon());
                } else
                    iconHero2.setIcon(new ImageIcon("src\\icons\\incognitHero.png"));
            }
        });
        comboBox3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!comboBox3.getSelectedItem().toString().equals("Random")) {
                    factory = new ConcreteHeroFactory(comboBox3.getSelectedItem().toString());
                    iconHero3.setIcon(factory.getHero().getIcon());
                } else
                    iconHero3.setIcon(new ImageIcon("src\\icons\\incognitHero.png"));
            }
        });
    }

    public JPanel getRootPanel() {
        return rootPanel;
    }

    public void setRootPanel(JPanel rootPanel) {
        this.rootPanel = rootPanel;
    }

    public JComboBox getComboBox1() {
        return comboBox1;
    }

    public void setComboBox1(JComboBox comboBox1) {
        this.comboBox1 = comboBox1;
    }

    public JComboBox getComboBox2() {
        return comboBox2;
    }

    public void setComboBox2(JComboBox comboBox2) {
        this.comboBox2 = comboBox2;
    }

    public JComboBox getComboBox3() {
        return comboBox3;
    }

    public void setComboBox3(JComboBox comboBox3) {
        this.comboBox3 = comboBox3;
    }

    public JButton getButton1() {
        return button1;
    }

    public void setButton1(JButton button1) {
        this.button1 = button1;
    }

    public JFrame getV() {
        return v;
    }

    public void setV(JFrame v) {
        this.v = v;
    }

    public Ventana3vs3 getVentana3vs3() {
        return ventana3vs3;
    }

    public void setVentana3vs3(Ventana3vs3 ventana3vs3) {
        this.ventana3vs3 = ventana3vs3;
    }

    public IHeroFactory getFactory() {
        return factory;
    }

    public void setFactory(IHeroFactory factory) {
        this.factory = factory;
    }
}
