package Ventanas;

import Abstract.Hero;
import ConcreteHeros.Queen;
import ConcreteHeros.Sven;
import ConcreteHeros.Templar;
import Principal.Map1vs1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaMap1vs1 {
    private JPanel rootPanel;
    private JLabel iconhero1;
    private JLabel iconhero2;
    private JButton playTurnButton;
    private JPanel panelStats1;
    private JLabel hpValue2;
    private JLabel manaValue2;
    private JLabel armorValue2;
    private JLabel hpValue1;
    private JLabel manaValue1;
    private JLabel armorValue1;
    private JLabel nameHero1;
    private JLabel nameHero2;
    private JLabel damageValue1;
    private JLabel damageValue2;
    private JPanel panelHero1;
    private JPanel panelHero2;

    private Map1vs1 map1vs1;

    private Hero hero1 ;
    private Hero hero2 ;

    public VentanaMap1vs1(Map1vs1 map1vs1,VentanaPrincipal vp) {
        this.map1vs1 = map1vs1;
        hero1 = map1vs1.getHero1();
        hero2 = map1vs1.getHero2();
        update();
        JFrame v = new JFrame();
        v.setContentPane(getRootPanel());
        v.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        v.pack();
        v.setLocationRelativeTo(null);
        v.setVisible(true);

        playTurnButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(hero1.getVida() <= 0 || hero2.getVida() <= 0 ){
                    v.setVisible(false);
                    v.dispose();
                    VentanaPrincipal Vp = new VentanaPrincipal(vp.getUser(),vp.getDota());
                }
                else{
                    map1vs1.play();
                    update();
                    if (hero1.getVida()<=0)
                        panelHero1.setBackground(Color.RED);
                    if (hero2.getVida()<=0)
                        panelHero2.setBackground(Color.RED);
                }
            }
        });
    }

    public void update(){
        getNameHero1().setText(hero1.getName());
        getIconhero1().setIcon(hero1.getIcon());
        getHpValue1().setText(Integer.toString(hero1.getVida()));
        getManaValue1().setText(Integer.toString(hero1.getMana()));
        getDamageValue1().setText(Integer.toString(hero1.getBasicDamage()));getArmorValue1().setText(Integer.toString(hero1.getArmadura()));

        getNameHero2().setText(hero2.getName());getIconhero2().setIcon(hero2.getIcon());
        getHpValue2().setText(Integer.toString(hero2.getVida()));
        getManaValue2().setText(Integer.toString(hero2.getMana()));
        getDamageValue2().setText(Integer.toString(hero2.getBasicDamage()));
        getArmorValue2().setText(Integer.toString(hero2.getArmadura()));
    }

    public JPanel getRootPanel() {
        return rootPanel;
    }
//////////////////////////////////////////////////////

    public JLabel getDamageValue1() {
        return damageValue1;
    }

    public void setDamageValue1(JLabel damageValue1) {
        this.damageValue1 = damageValue1;
    }

    public JLabel getDamageValue2() {
        return damageValue2;
    }

    public void setDamageValue2(JLabel damageValue2) {
        this.damageValue2 = damageValue2;
    }

    public Map1vs1 getMap1vs1() {
        return map1vs1;
    }

    public void setMap1vs1(Map1vs1 map1vs1) {
        this.map1vs1 = map1vs1;
    }

    public JLabel getNameHero1() {
        return nameHero1;
    }

    public void setNameHero1(JLabel nameHero1) {
        this.nameHero1 = nameHero1;
    }

    public JLabel getNameHero2() {
        return nameHero2;
    }

    public void setNameHero2(JLabel nameHero2) {
        this.nameHero2 = nameHero2;
    }

    public void setRootPanel(JPanel rootPanel) {
        this.rootPanel = rootPanel;
    }

    public JLabel getIconhero1() {
        return iconhero1;
    }

    public void setIconhero1(JLabel iconhero1) {
        this.iconhero1 = iconhero1;
    }

    public JLabel getIconhero2() {
        return iconhero2;
    }

    public void setIconhero2(JLabel iconhero2) {
        this.iconhero2 = iconhero2;
    }

    public JButton getPlayTurnButton() {
        return playTurnButton;
    }

    public void setPlayTurnButton(JButton playTurnButton) {
        this.playTurnButton = playTurnButton;
    }

    public JPanel getPanelStats1() {
        return panelStats1;
    }

    public void setPanelStats1(JPanel panelStats1) {
        this.panelStats1 = panelStats1;
    }

    public JLabel getHpValue2() {
        return hpValue2;
    }

    public void setHpValue2(JLabel hpValue2) {
        this.hpValue2 = hpValue2;
    }

    public JLabel getManaValue2() {
        return manaValue2;
    }

    public void setManaValue2(JLabel manaValue2) {
        this.manaValue2 = manaValue2;
    }

    public JLabel getArmorValue2() {
        return armorValue2;
    }

    public void setArmorValue2(JLabel armorValue2) {
        this.armorValue2 = armorValue2;
    }

    public JLabel getHpValue1() {
        return hpValue1;
    }

    public void setHpValue1(JLabel hpValue1) {
        this.hpValue1 = hpValue1;
    }

    public JLabel getManaValue1() {
        return manaValue1;
    }

    public void setManaValue1(JLabel manaValue1) {
        this.manaValue1 = manaValue1;
    }

    public JLabel getArmorValue1() {
        return armorValue1;
    }

    public void setArmorValue1(JLabel armorValue1) {
        this.armorValue1 = armorValue1;
    }

    public static void main(String[] args) {
        Map1vs1 map = new Map1vs1(new Sven(),new Templar());
        VentanaMap1vs1 v = new VentanaMap1vs1(map,null);
        map.setHero1(new Queen());
    }
}
