package datatypes;

import java.util.List;
import java.util.Scanner;

public class ArrancarCalculator {
    public static void main(String[] args){
        Calculator casio = new Calculator();
        System.out.println("Esta es la calculadora casio, estas son las funciones que puedes utilizar");
        Scanner sc = new Scanner(System.in);
        List<String> option = List.of("a", "b", "c", "d", "e", "f", "g", "h", "A", "B", "C", "D", "E", "F", "G", "H");
        String choice;
        
        boolean toContinue= true;
        while(toContinue) {
            do {
                System.out.println("Este es el menu");
                System.out.println("a. operación suma");
                System.out.println("b. operación área de un triangulo ");
                System.out.println("c. conversor de segundos a horas");
                System.out.println("d. conversor de años a días");
                System.out.println("e. convertir a mayusculas");
                System.out.println("f. encontrar texto");
                System.out.println("g. Resolver ecuación de 2º grado");
                System.out.println("h. para salir ");
                System.out.print("Elige una opción: ");
                choice = sc.next();
            } while (-1 == option.indexOf(choice));

            if ("a".equals(choice)) {
                System.out.println("Dame los dos números a sumar");
                int x = sc.nextInt();
                int y = sc.nextInt();
                casio.addition(x, y);
            } else if ("b".equals(choice)) {
                System.out.println("Dame la base y la altura");
                int base = sc.nextInt();
                int altura = sc.nextInt();
                casio.calculateTriangleArea(base, altura);
            } else if ("c".equals(choice)) {
                System.out.println("Dame los segundos para pasarloas a horas");
                int seconds = sc.nextInt();
                casio.convertSecondsToHours(seconds);
            } else if ("d".equals(choice)) {
                System.out.println("Dame los años para convertirlos a días");
                int ages = sc.nextInt();
                casio.convertAgesToDays(ages);
            } else if ("e".equals(choice)) {
                System.out.println("Dame las letras para ponerlas en mayusculas");
                String letras = sc.next();
                casio.uppercase(letras);
            } else if ("f".equals(choice)) {
                System.out.println("Dame la palabra para buscarla en el texto");
                String palabra = sc.next();
                String texto = sc.next();
                casio.findInTheText(palabra, texto);
            } else if ("g".equals(choice)) {
                System.out.println("Dame los valores para hacer la equación de 2º grado");
                String x = sc.next();
                String y = sc.next();
                String z = sc.next();
                casio.solveQuadraticEquation(x, y, z);
            } else if ("h".equals(choice)) {
                System.out.println("Salir del menu");
                System.out.println("Vete a tomar por culo ");
                toContinue = false;
            }
            String i = casio.result();
            if (!"h".equals(choice)) {
                System.out.println("el resultado es " + i);
            }
        }
    }
}
