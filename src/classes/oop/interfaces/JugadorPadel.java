package classes.oop.interfaces;

import classes.oop.Remates;

public class JugadorPadel implements Jugador, Persona {
    private int puntos;

    @Override
    public void competir() {

    }

    @Override
    public void ganar() {

    }

    @Override
    public void perder() {

    }

    @Override
    public void enfadar() {

    }
    private String remate(String tipo){
        if (Remates.x3.name().equals(tipo)){
            System.out.println("La he sacado por 3" + Remates.x3.getPotencia());
        }
        if (Remates.x4.name().equals(tipo)) {
            System.out.println("La he sacado por 4 y he ganado el punto directo");
            puntos++;
        }

        return "";
    }
}
