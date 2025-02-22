public class Palindrome {

    public static void main(String[] args) {
        int number = 151;
        boolean result = isPalindrome(number);
        System.out.print("The number " + number + " is ");
        if (!result) {
            System.out.print("not ");
        }
        System.out.println("palindrome");
    }

    public static boolean isPalindrome(int number) {
        int digits = getDigitsNumber(number);
        System.out.println(digits);
        int unit;
        switch (digits) {
            case 1:
                return true;
            case 2:
                unit = number % 10;
                int deca = number / 10;
                return unit == deca;
            case 3:
                unit = number % 10;
                int centa = number / 100;
                return unit == centa;

        }
        return true;
    }

    private static int getDigitsNumber(int number) {
        //return (int) Math.log10(number) + 1;
        int count = 0;
        while (number > 0) {
            number = number / 10;
            count++;
        }
        return count;
    }
}
