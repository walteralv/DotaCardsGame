package Principal;

import Abstract.Hero;
import ConcreteHeros.*;
import Ventanas.VentanaInicioSesion;

import java.time.temporal.Temporal;

public class principal {
    public static void main(String[] args) {
        DotaBase dota = new DotaBase();
        User walter = new User("walter","mangoou54@gmail.com","hola123");
        dota.registrarUsuario(walter);
        System.out.println(walter == dota.buscarUser("mangoou54@gmail.com","hola123"));

        VentanaInicioSesion v = new VentanaInicioSesion(dota);

    }
}
