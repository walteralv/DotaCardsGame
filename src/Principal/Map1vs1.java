package Principal;

import Abstract.Hero;
import Abstract.IMap;
import ConcreteHeros.*;
import Ventanas.VentanaMap1vs1;

import javax.swing.*;

public class Map1vs1 implements IMap {
    Senda sendaCentral ;
    Hero hero1;
    Hero hero2;

    VentanaMap1vs1 map1vs1 ;

    public Map1vs1(Hero hero1,Hero hero2) {
        map1vs1 = new VentanaMap1vs1(this);
        this.hero1 = hero1;
        this.hero2 = hero2;
        this.sendaCentral = new Senda(hero1,hero2);
        update();
        JFrame v = new JFrame();
        v.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        v.setContentPane(map1vs1.getRootPanel());
        v.pack();
        v.setLocationRelativeTo(null);
        v.setVisible(true);
    }
    public void update(){
        map1vs1.getNameHero1().setText(hero1.getName());
        map1vs1.getIconhero1().setIcon(hero1.getIcon());
        map1vs1.getHpValue1().setText(Integer.toString(hero1.getVida()));
        map1vs1.getManaValue1().setText(Integer.toString(hero1.getMana()));
        map1vs1.getDamageValue1().setText(Integer.toString(hero1.getBasicDamage()));
        map1vs1.getArmorValue1().setText(Integer.toString(hero1.getArmadura()));

        map1vs1.getNameHero2().setText(hero2.getName());
        map1vs1.getIconhero2().setIcon(hero2.getIcon());
        map1vs1.getHpValue2().setText(Integer.toString(hero2.getVida()));
        map1vs1.getManaValue2().setText(Integer.toString(hero2.getMana()));
        map1vs1.getDamageValue2().setText(Integer.toString(hero2.getBasicDamage()));
        map1vs1.getArmorValue2().setText(Integer.toString(hero2.getArmadura()));
    }

    @Override
    public void play() {
            sendaCentral.playTurn();
            update();
    }

    public static void main(String[] args) {

        Hero templar = new Templar();
        Hero terror = new TerrorBlade();
        Hero lion = new Lion();
        Hero queen = new Queen();
        Hero sven = new Sven();


        Map1vs1 sendaCentral = new Map1vs1(terror,sven);

    }
}
