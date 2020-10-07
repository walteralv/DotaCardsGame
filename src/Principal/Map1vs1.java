package Principal;

import Abstract.Hero;
import Abstract.IMap;
import ConcreteHeros.*;
import Ventanas.VentanaMap1vs1;
import Ventanas.VentanaPicks1v1;

import javax.swing.*;

public class Map1vs1 implements IMap {
    Senda sendaCentral ;
    Hero hero1;
    Hero hero2;

    VentanaMap1vs1 vantanaMap1vs1 ;

    VentanaPicks1v1 ventanaPicks1v1;

    public Map1vs1(Hero hero1,Hero hero2) {
        this.hero1 = hero1;
        this.hero2 = hero2;

        this.sendaCentral = new Senda(hero1,hero2);

    }

    @Override
    public void play() {
            sendaCentral.playTurn();

    }

    public Senda getSendaCentral() {
        return sendaCentral;
    }

    public void setSendaCentral(Senda sendaCentral) {
        this.sendaCentral = sendaCentral;
    }

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

    public VentanaMap1vs1 getVantanaMap1vs1() {
        return vantanaMap1vs1;
    }

    public void setVantanaMap1vs1(VentanaMap1vs1 vantanaMap1vs1) {
        this.vantanaMap1vs1 = vantanaMap1vs1;
    }

    public VentanaPicks1v1 getVentanaPicks1v1() {
        return ventanaPicks1v1;
    }

    public void setVentanaPicks1v1(VentanaPicks1v1 ventanaPicks1v1) {
        this.ventanaPicks1v1 = ventanaPicks1v1;
    }
}
