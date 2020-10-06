package ConcreteHeros;

import Abstract.Hero;
import ConcreteAbilities.GritoDelDolor;

import javax.swing.*;

public class Queen extends Hero {
    public Queen() {
        setName("Queen Of Pain");
        setVida(1500);
        setManaXAttack(25);
        setArmadura(15);
        setBasicDamage(150);
        setAbility(new GritoDelDolor());
        setIcon(new ImageIcon("src\\icons\\queen.jpg"));
    }

    @Override
    public void basicAtack(Hero enemyHero) {
        int armor = enemyHero.getArmadura();
        enemyHero.setArmadura(0);
        super.basicAtack(enemyHero);
        enemyHero.setArmadura(armor);
    }
}
