package datatypes;

import java.util.Scanner;

public class ArrancarCalculator {
    public static void main(String[] args){
        Calculator casio = new Calculator();
        System.out.println("Esta es la calculadora casio, estas son las funciones que puedes utilizar");
        Scanner sc = new Scanner(System.in) ;
        boolean toContinue= true;
        while(toContinue) {
            System.out.println("Este es el menu");
            System.out.println("1 operación suma");
            System.out.println("2 operación área de un triangulo ");
            System.out.println("3 conversor de segundos a horas");
            System.out.println("4 conversor de años a días");
            System.out.println("5 convertir a mayusculas");
            System.out.println("6 encontrar texto");
            System.out.println("7 Resolver ecuación de 2º grado");
            System.out.println("8 para salir ");
            System.out.println("elige una opción");
            int opcion = sc.nextInt();
            if (opcion == 1) {
                System.out.println("Dame los dos números a sumar");
                int x = sc.nextInt();
                int y = sc.nextInt();
                casio.addition(x, y);
            } else if (opcion == 2) {
                System.out.println("Dame la base y la altura");
                int base = sc.nextInt();
                int altura = sc.nextInt();
                casio.calculateTriangleArea(base, altura);
            } else if (opcion == 3) {
                System.out.println("Dame los segundos para pasarloas a horas");
                int seconds = sc.nextInt();
                casio.convertSecondsToHours(seconds);
            } else if (opcion == 4) {
                System.out.println("Dame los años para convertirlos a días");
                int ages = sc.nextInt();
                casio.convertAgesToDays(ages);
            } else if (opcion == 5) {
                System.out.println("Dame las letras para ponerlas en mayusculas");
                String letras = sc.next();
                casio.uppercase(letras);
            } else if (opcion == 6) {
                System.out.println("Dame la palabra para buscarla en el texto");
                String palabra = sc.next();
                String texto = sc.next();
                casio.findInTheText(palabra, texto);
            } else if (opcion == 7) {
                System.out.println("Dame los valores para hacer la equación de 2º grado");
                String x = sc.next();
                String y = sc.next();
                String z = sc.next();
                casio.solveQuadraticEquation(x, y, z);
            } else if (opcion == 8) {
                System.out.println("Salir del menu");
                System.out.println("Vete a tomar por culo ");
                toContinue = false;
            }
            String i = casio.result();
            if (opcion !=8){
                System.out.println("el resultado es " + i);
            }
        }
    }
}
