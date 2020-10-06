package ConcreteAbilities;

import Abstract.Hero;
import Abstract.Ability;

import javax.swing.*;

public class GuadanaDeLaMuerte extends Ability {

    public GuadanaDeLaMuerte() {
        setName("Guadaña de la muerte");
        setAnimation(new ImageIcon("src\\icons\\guadaña.gif"));
    }

    @Override
    public void throwAbility(Hero enemyhero) {
        enemyhero.takeDamage( enemyhero.getVida() - enemyhero.getVida()/2);
    }
}
