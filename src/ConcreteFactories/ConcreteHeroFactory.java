package ConcreteFactories;

import Abstract.Hero;
import Abstract.IHeroFactory;
import ConcreteHeros.*;
import Principal.Map1vs1;
import org.w3c.dom.ls.LSOutput;

public class ConcreteHeroFactory implements IHeroFactory {
    String name ;

    public ConcreteHeroFactory(String name) {
        this.name = name;
    }


    @Override
    public Hero getHero() {
        switch (name){
            case "AntiMage": return new AntiMage() ;
            case "Lion": return new Lion();
            case "Necro": return new Necro();
            case "Queen": return new Queen();
            case "Sven": return new Sven();
            case "Templar": return new Templar();
            case "TerrorBlade": return new TerrorBlade();
            default: return null;
        }
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
