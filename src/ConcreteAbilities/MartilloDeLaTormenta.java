package ConcreteAbilities;

import Abstract.Hero;
import Abstract.Ability;

import javax.swing.*;

public class MartilloDeLaTormenta extends Ability {

    public MartilloDeLaTormenta() {
        setName("Martillo de la tormenta");
        setAnimation(new ImageIcon("src\\icons\\martillo.gif"));
    }
    @Override
    public void throwAbility(Hero enemyhero){
        enemyhero.takeDamage(200);
    }

}
