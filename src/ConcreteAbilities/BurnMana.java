package ConcreteAbilities;

import Abstract.Hero;
import Abstract.Ability;

import javax.swing.*;

public class BurnMana extends Ability {
    private String name = "Burn mana";
    private int burn = 20 ;
    private ImageIcon icon;

    @Override
    public void throwAbility(Hero enemyHero) {
        enemyHero.removeMana(burn);
    }

    @Override
    public String getName() {
        return name;
    }
}
