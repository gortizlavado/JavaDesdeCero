package loops;

public class Playground {
    public static void main(String[] args) {
        System.out.println("Playground for looping exercises");

        String text = "12345";
        //printReverseText(text);
        System.out.println(reverseText(text));

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

}

/*
#1
Write a program that reads a set of characters like 12345 and then outputs the number with the digits reversed. The output should be 54321.

#2
Write a program that reads a set of integers, and then prints the sum of the even and odd integers.

#3
Write a program that prompts the user to input a positive integer. It should then output a message indicating whether the number is a prime number. If not the program ask for another number.
Tip: Scanner in = new Scanner(System.in);

#4
Write a program to enter the numbers till the user wants and at the end the program should display the biggest and smallest numbers entered.
*/
