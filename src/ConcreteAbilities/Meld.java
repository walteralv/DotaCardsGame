package ConcreteAbilities;

import Abstract.Hero;
import Abstract.Ability;
import ConcreteHeros.Templar;

import javax.swing.*;

public class Meld extends Ability {
    String name = "Meld";
    Templar templar ;

    public Meld(Templar templar) {
        this.templar = templar;
        setName("Meld");
        setAnimation(new ImageIcon("src\\icons\\meldAnimation.jpg"));

    }

    @Override
    public void throwAbility(Hero enemyhero) {
        if(enemyhero.getArmadura()>=0) {
            enemyhero.setArmadura(enemyhero.getArmadura() - 5);
            enemyhero.takeDamage(templar.getBasicDamage() * 2);
        }
    }


}
