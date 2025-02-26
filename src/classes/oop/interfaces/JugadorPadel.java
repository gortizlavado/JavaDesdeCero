package classes.oop.interfaces;

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
        if (tipo =="x3"){
            System.out.println("La he sacado por 3");
        }
        if (tipo=="x4"){
            System.out.println("La he sacado por 4 y he ganado el punto directo");
            puntos++;
        }
    }
}
