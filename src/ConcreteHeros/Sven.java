package ConcreteHeros;

import Abstract.Hero;
import ConcreteAbilities.MartilloDeLaTormenta;

import javax.swing.*;

public class Sven extends Hero {
    public Sven() {
        setName("Sven");
        setVida(1200);
        setManaXAttack(40);
        setArmadura(40);
        setBasicDamage(300);
        setAbility(new MartilloDeLaTormenta());
        setIcon(new ImageIcon("src\\icons\\sven.jpg"));

    }
}
