package Abstract;

import javax.swing.*;

public abstract class Hero {
    private String name;
    private int vida ;
    private int basicDamage;
    private int manaXAttack ;
    private int mana = 0 ;
    private final int MAX_MANA = 100;
    private int armadura;

    private ImageIcon icon ;
    private Ability ability;

    @Override
    public String toString() {
        return "Hero{" +
                "name='" + name + '\'' +
                ", vida=" + vida +
                ", mana=" + mana +
                ", armadura=" + armadura +
                '}';
    }

    public void basicAtack(Hero enemyHero){
        mana += manaXAttack;
        enemyHero.takeDamage(basicDamage);
    };

    public void throwAbility(Hero enemyHero){
         getAbility().throwAbility(enemyHero);
         mana = 0 ;
    }

    public void takeDamage(int damage){
        if (armadura >= 100)
            return;
        else
            setVida(vida - damage*(100-armadura)/100);
    }

    public void removeMana(int remove){
        if (mana == 0)
            return;
        else
            setMana(mana - remove);
    }

    ///////////////////////////////////////////


    public ImageIcon getIcon() {
        return icon;
    }

    public void setIcon(ImageIcon icon) {
        this.icon = icon;
    }

    public int getMAX_MANA() {
        return MAX_MANA;
    }

    public int getBasicDamage() {
        return basicDamage;
    }

    public void setBasicDamage(int basicDamage) {
        this.basicDamage = basicDamage;
    }

    public int getManaXAttack() {
        return manaXAttack;
    }

    public void setManaXAttack(int manaXAttack) {
        this.manaXAttack = manaXAttack;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public int getArmadura() {
        return armadura;
    }

    public void setArmadura(int armadura) {
        this.armadura = armadura;
    }

    public Ability getAbility() {
        return ability;
    }

    public void setAbility(Ability ability) {
        this.ability = ability;
    }
}