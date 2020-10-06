package ConcreteHeros;

import Abstract.Hero;
import ConcreteAbilities.GuadanaDeLaMuerte;

import javax.swing.*;

public class Necro extends Hero {
    public Necro() {
        setName("Necrophos");
        setArmadura(10);
        setManaXAttack(25);
        setBasicDamage(100);
        setVida(1500);
        setAbility(new GuadanaDeLaMuerte());
        setIcon(new ImageIcon("src\\icons\\necro.jpg"));

    }
}
