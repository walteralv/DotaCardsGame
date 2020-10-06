package ConcreteAbilities;

import Abstract.Hero;
import Abstract.Ability;

import javax.swing.*;

public class GritoDelDolor extends Ability {

    public GritoDelDolor() {
        setName("Grito del Dolor");
        setAnimation(new ImageIcon("src\\icons\\grito.gif"));
    }

    public void throwAbility(Hero enemyHero) {
        int armor = enemyHero.getArmadura();
        enemyHero.setArmadura(0);
        enemyHero.takeDamage(700);
        enemyHero.setArmadura(armor);
    }
}
