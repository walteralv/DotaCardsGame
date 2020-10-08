package ConcreteHeros;

import Abstract.Hero;
import ConcreteAbilities.Metamorphosis;

import javax.swing.*;

public class TerrorBlade extends Hero {
    public TerrorBlade() {
        setName("TerrorBlade");
        setVida(1800);
        setManaXAttack(50);
        setArmadura(15);
        setBasicDamage(250);

        setAbility(new Metamorphosis(this));
        setIcon(new ImageIcon("src\\icons\\terror.jpg"));
    }
}
