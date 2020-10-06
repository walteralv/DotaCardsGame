package ConcreteAbilities;

import Abstract.Hero;
import Abstract.Ability;

import javax.swing.*;

public class DedoDeLaMuerte extends Ability {
    int Damage = 1000;

    public DedoDeLaMuerte() {
        setName("Dedo de la muerte");
        setAnimation(new ImageIcon("src\\icons\\dedoGif.gif"));
    }

    @Override
    public void throwAbility(Hero enemyHero) {
        enemyHero.takeDamage(Damage);
        Damage += 100;
    }
}
