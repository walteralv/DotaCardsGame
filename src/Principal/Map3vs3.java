package Principal;

import Abstract.Hero;
import ConcreteHeros.Lion;
import ConcreteHeros.Queen;
import ConcreteHeros.Sven;
import ConcreteHeros.Templar;

public  class Map3vs3 {

    private Senda top ;
    private Senda mid ;
    private Senda bot ;

    public void intercambiarHeroes1(Senda senda1 , Senda senda2){
        Hero aux = senda1.getHero1();

        senda1.setHero1(senda2.getHero1());
        senda2.setHero1(aux);
    }

    public void intercambiarHeroes2(Senda senda1 , Senda senda2){
        Hero aux = senda1.getHero1();

        senda1.setHero1(senda2.getHero1());
        senda2.setHero1(aux);
    }
    public void play() {
        top.playTurn();
        mid.playTurn();
        bot.playTurn();
    }

    public Map3vs3(Senda top, Senda mid, Senda bot) {
        this.top = top;
        this.mid = mid;
        this.bot = bot;
    }

    public Senda getTop() {
        return top;
    }

    public void setTop(Senda top) {
        this.top = top;
    }

    public Senda getMid() {
        return mid;
    }

    public void setMid(Senda mid) {
        this.mid = mid;
    }

    public Senda getBot() {
        return bot;
    }

    public void setBot(Senda bot) {
        this.bot = bot;
    }

    public static void main(String[] args) {
        Hero h1 = new Queen();
        Hero h2 = new Lion();
        Hero h3 = new Templar();
        Hero h4 = new Sven();

        Senda mid = new Senda(h1 ,h2);
        Senda top = new Senda(h3,h4);

        System.out.println("mid : " + mid.getHero1().getName()+" and  "+ mid.getHero2().getName());
        System.out.println("top: " + top.getHero1().getName() +" and  "+ top.getHero2().getName());

//        intercambiarHeroes1(mid , top);

        System.out.println("mid : " + mid.getHero1().getName()+" and  "+ mid.getHero2().getName());
        System.out.println("top: " + top.getHero1().getName() +" and  "+ top.getHero2().getName());

    }

}
