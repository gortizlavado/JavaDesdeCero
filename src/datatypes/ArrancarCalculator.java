package datatypes;

import java.util.Scanner;

public class ArrancarCalculator {
    public static void main(String args[]){
        Calculator casio = new Calculator();

        /*
        casio.solveQuadraticEquation("57","-97","2");
        String resultado = casio.result();
        System.out.println("el resultado es "+ resultado );
         */

        System.out.println("Hi! this is a program that catch a text and a number");
        Scanner input = new Scanner(System.in);
        String s = input.next();
        int i = input.nextInt();
        System.out.println("I get: " + s + " " + i + " from console");

    }
}
