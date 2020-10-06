package ConcreteFactories;

import Abstract.Hero;
import Abstract.IHeroFactory;
import ConcreteHeros.*;
import Principal.Map1vs1;

public class RandomFactory implements IHeroFactory {
    public Hero RandomFactory() {
        return getHero();
    }

    @Override
    public Hero getHero() {
        int random = (int) (6*Math.random())+1 ;
        System.out.println(random);
        switch (random){
            case 1: return new AntiMage() ;
            case 2: return new Templar();
            case 3: return new Lion();
            case 4: return new Necro();
            case 5: return new Queen();
            case 6: return new Sven();
            case 7: return new TerrorBlade();
            default: return null;
        }

    }

    public static void main(String[] args) {
        IHeroFactory cf = new ConcreteHeroFactory("Sven");
        IHeroFactory rf = new RandomFactory();

        Map1vs1 map = new Map1vs1(cf.getHero(),rf.getHero());
    }
}

