package Abstract;

import javax.swing.*;

public abstract class Ability {
    private String name ;
    private ImageIcon icon ;
    private ImageIcon animation ;

    public abstract void throwAbility(Hero enemyhero);

/////////////////////////////////////////////////////////////////
    public ImageIcon getAnimation() {
        return animation;
    }

    public void setAnimation(ImageIcon animation) {
        this.animation = animation;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ImageIcon getIcon() {
        return icon;
    }

    public void setIcon(ImageIcon icon) {
        this.icon = icon;
    }
}
