package ConcreteAbilities;

import Abstract.Hero;
import Abstract.Ability;
import ConcreteHeros.TerrorBlade;

import javax.swing.*;

public class Metamorphosis extends Ability {
    TerrorBlade hero;


    public Metamorphosis(TerrorBlade hero) {
        this.hero = hero;
        setName("Metamorphosis");
        setAnimation(new ImageIcon("src\\icons\\terrorMeta.gif"));
    }

    @Override
    public void throwAbility(Hero enemyhero) {
        hero.setIcon(new ImageIcon("src\\icons\\terrorMetaGif.gif"));
        hero.setBasicDamage(hero.getBasicDamage()+100);
        hero.basicAtack(enemyhero);

    }

    public TerrorBlade getHero() {
        return hero;
    }

    public void setHero(TerrorBlade hero) {
        this.hero = hero;
    }

}
