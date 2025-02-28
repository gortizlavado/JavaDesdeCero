package classes.oop.interfaces;

import classes.oop.utils.Dices;

public class PistaPadel {

    public static void main(String[] args) {
        JugadorPadel[] jugadores = new JugadorPadel[4];

        System.out.println(Dices.rollDieOf4());
        System.out.println(Dices.rollDieOf5());
        System.out.println(Dices.isPassProbability(90));
    }
}
