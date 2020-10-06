package ConcreteAbilities;

import Abstract.Hero;
import Abstract.Ability;

import javax.swing.*;

public class VacioDeMana extends Ability {

    public VacioDeMana() {
        setName("Vacio de mana");
        setAnimation(new ImageIcon("src\\icons\\vacioMana.gif"));
    }

    @Override
    public void throwAbility(Hero enemyhero) {
            enemyhero.takeDamage(enemyhero.getMAX_MANA()*2 - enemyhero.getMana());
    }

}
