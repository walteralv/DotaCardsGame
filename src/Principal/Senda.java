package Principal;

import Abstract.Hero;
import Ventanas.VentanaAbility;

import javax.swing.*;

public class Senda {
   private Hero hero1;
   private Hero hero2;
    private boolean playing = true;
    private VentanaAbility vHero1;
   private  VentanaAbility vHero2;

    public Senda(Hero hero1, Hero hero2) {
        this.hero1 = hero1;
        this.hero2 = hero2;
    }

    public void playTurn(){
        if (hero1.getMana() >= hero1.getMAX_MANA()){
            hero1.throwAbility(hero2);
            System.out.println(hero1.getName()+" throw "+hero1.getAbility().getName());
            vHero1 = new VentanaAbility(hero1);

        }
        else
            hero1.basicAtack(hero2);

        if (hero2.getMana() >= hero2.getMAX_MANA()) {
            hero2.throwAbility(hero1);
            System.out.println(hero2.getName()+" usó "+hero2.getAbility().getName());
            vHero2 = new VentanaAbility(hero2);
        }
        else
            hero2.basicAtack(hero1);
        System.out.println(hero1);
        System.out.println(hero2);
        if (hero1.getVida() <= 0) {
            playing = false;
            hero1 = null;
        }
        if (hero2.getVida() <= 0) {
            hero2 = null;
            playing = false;
        }
    }

    ////////////////////////////////////////

    public Hero getHero1() {
        return hero1;
    }

    public void setHero1(Hero hero1) {
        this.hero1 = hero1;
    }

    public Hero getHero2() {
        return hero2;
    }

    public void setHero2(Hero hero2) {
        this.hero2 = hero2;
    }

    public boolean isPlaying() {
        return playing;
    }

    public void setPlaying(boolean playing) {
         playing = playing;
    }
}
