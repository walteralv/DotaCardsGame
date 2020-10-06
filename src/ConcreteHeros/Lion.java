package ConcreteHeros;

import Abstract.Hero;
import ConcreteAbilities.DedoDeLaMuerte;

import javax.swing.*;

public class Lion extends Hero {

    public Lion() {
        setName("Lion");
        setVida(1800);
        setManaXAttack(25);
        setArmadura(10);
        setBasicDamage(100);
        setAbility(new DedoDeLaMuerte());
        setIcon(new ImageIcon("src\\icons\\lion.jpg"));
    }


}
