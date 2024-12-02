package loops;

import java.util.Arrays;
import java.util.Scanner;

public class Playground {
    public static void main(String[] args) {
        System.out.println("Playground for looping exercises");
        primo();
//        String text = "12345";
//        int[] numbers = {1,2,3,4,5,6};
//        //printReverseText(text);
//        System.out.println(reverseText(text));
//        sumNumbers(numbers);

    }

    private static void printReverseText(String textToReverse) {
        //String textToReverse = "12345";
        //String text = textToReverse; text = "12345";
        char[] charArray = textToReverse.toCharArray(); //"12345" => {"1","2",..."5"}
        int length = charArray.length;
        for (int i = length-1; i > -1; i--) {
            //#1 i = 5-1 = 4 -> charArray[0] = 1 ; ... ; charArray[4] = 5
            //#2 i = 3 ->  charArray[3] = 4
            System.out.println("index: " + i + " --> " + charArray[i]);

        }
    }

    private static String reverseText(String textToReverse) {
        String result = new String();
        char[] charArray = textToReverse.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            result = charArray[i] + result;

        }
        return result; //"54321"
    }

    public static void sumNumbers (int[] numbers ) {
        int result = 0;
        for (int i = 0; i < numbers.length; i++) {
            result = numbers[i] + result;
        }
        System.out.println("la suma de los números "+ Arrays.toString(numbers) +" es: "+result);

    }

    public static void primo () {
        Scanner in = new Scanner(System.in);
        System.out.println("Dame un número positivo");
        int numero = -1;
        while (numero<=1){
            numero =in.nextInt();
            int contador = 0;
            for (int i=1; i<= numero; i++){
                boolean k = numero % i == 0;
                System.out.println( i +" es divisible " + k);
                if (k){
                    contador = contador + 1;
                    System.out.println("Es true "+contador+ " veces");
                }
            }
            if (contador>2){
                System.out.println("No es primo");
            } else System.out.println("Es primo");
        }
    }
}

/*
#4
Write a program to enter the numbers till the user wants and at the end the program should display the biggest and smallest numbers entered.
*/
