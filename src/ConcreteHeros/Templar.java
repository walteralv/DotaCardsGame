package ConcreteHeros;

import Abstract.Hero;
import ConcreteAbilities.Meld;

import javax.swing.*;

public class Templar extends Hero {
    public Templar() {
        setName("Templar Asassin");
        setVida(1700);
        setManaXAttack(50);
        setBasicDamage(250);
        setArmadura(10);
        setAbility(new Meld(this));
        setIcon(new ImageIcon("src\\icons\\templar.jpg"));

    }
}
