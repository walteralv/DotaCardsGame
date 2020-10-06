package Ventanas;

import Abstract.Hero;

import javax.swing.*;

public class VentanaAbility {
    private JPanel rootPanel;
    private JLabel abylity;
    private JLabel mensaje;
    private Hero hero;

    public VentanaAbility(Hero hero) {
        this.hero = hero;
        JFrame v = new JFrame();
        abylity.setIcon(hero.getAbility().getAnimation());
        mensaje.setText(hero.getName()+" usó "+hero.getAbility().getName());
        v.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
        v.setContentPane(rootPanel);
        v.pack();
        v.setLocationRelativeTo(null);
        v.setVisible(true);
    }
}
