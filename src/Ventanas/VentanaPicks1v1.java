package Ventanas;

import Abstract.IHeroFactory;
import ConcreteFactories.ConcreteHeroFactory;
import ConcreteFactories.RandomFactory;
import Principal.Map1vs1;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaPicks1v1 {
    private JPanel rootPanel;
    private JButton lionButton;
    private JButton queenButton;
    private JButton terrorButton;
    private JButton necroButton;
    private JButton svenButton;
    private JButton templarButton;
    private JButton antimageButton;
    private JButton randomButton;

    IHeroFactory factory ;
    IHeroFactory randonFactory = new RandomFactory();

    VentanaPrincipal vp ;
    VentanaMap1vs1 map1vs1;


    public VentanaPicks1v1(VentanaPrincipal vp) {

        JFrame v = new JFrame();
        v.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        v.setContentPane(rootPanel);
        v.pack();
        v.setLocationRelativeTo(null);
        v.setVisible(true);


        randomButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                factory = new RandomFactory();
                v.setVisible(false);
                v.dispose();
                map1vs1 = new VentanaMap1vs1(new Map1vs1(factory.getHero(),randonFactory.getHero()),vp);
            }
        });

        lionButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                v.setVisible(false);
                v.dispose();
                factory = new ConcreteHeroFactory("Lion");
                map1vs1 = new VentanaMap1vs1(new Map1vs1(factory.getHero(),randonFactory.getHero()),vp);

            }
        });


        queenButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                v.setVisible(false);
                v.dispose();
                factory = new ConcreteHeroFactory("Queen");
                map1vs1 = new VentanaMap1vs1(new Map1vs1(factory.getHero(),randonFactory.getHero()),vp);
            }
        });
        necroButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                v.setVisible(false);
                v.dispose();
                factory = new ConcreteHeroFactory("Necro");
                map1vs1 = new VentanaMap1vs1(new Map1vs1(factory.getHero(),randonFactory.getHero()),vp);
            }
        });
        antimageButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                v.setVisible(false);
                v.dispose();
                factory = new ConcreteHeroFactory("AntiMage");
                map1vs1 = new VentanaMap1vs1(new Map1vs1(factory.getHero(),randonFactory.getHero()),vp);
            }

        });
        terrorButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                v.setVisible(false);
                v.dispose();
                factory = new ConcreteHeroFactory("TerrorBlade");
                map1vs1 = new VentanaMap1vs1(new Map1vs1(factory.getHero(),randonFactory.getHero()),vp);

            }
        });
        svenButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                v.setVisible(false);
                v.dispose();
                factory = new ConcreteHeroFactory("Sven");
                map1vs1 = new VentanaMap1vs1(new Map1vs1(factory.getHero(),randonFactory.getHero()),vp);
            }
        });
        templarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                v.setVisible(false);
                v.dispose();
                factory = new ConcreteHeroFactory("Templar");
                map1vs1 = new VentanaMap1vs1(new Map1vs1(factory.getHero(),randonFactory.getHero()),vp);
            }
        });
    }
}
