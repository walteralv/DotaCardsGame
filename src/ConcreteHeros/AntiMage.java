package ConcreteHeros;

import Abstract.Hero;
import Abstract.Ability;
import ConcreteAbilities.BurnMana;
import ConcreteAbilities.VacioDeMana;

import javax.swing.*;

public class AntiMage extends Hero {

    private Ability burn = new BurnMana();

    public AntiMage() {
        setName("Anti Mage");
        setVida(2000);
        setManaXAttack(20);
        setArmadura(15);
        setBasicDamage(200);
        setAbility(new VacioDeMana());
        setIcon(new ImageIcon("src\\icons\\antimage.jpg"));
    }

    @Override
    public void basicAtack(Hero enemyHero) {
        burn.throwAbility(enemyHero);
        super.basicAtack(enemyHero);
    }

}
