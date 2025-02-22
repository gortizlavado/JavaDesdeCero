package loops;

public class Recursive {

    public static final String ABECEDARY = "abcdefghijk";

    public static void main(String[] args) {
        readAbecedary(0);
        System.out.println();
        System.out.println("--------------");
        counterBack(10);
        System.out.println();
        System.out.println("--------------");
        int factorial = factorialOf(5);
        System.out.println(factorial);
        System.out.println("--------------");
        int fibonacci = getNumberInFibonacciSequence(11);
        System.out.println("Fibonacci: "+fibonacci);
        System.out.println("--------------");
        fibonacciSequence(0, 1, 4181);
        System.out.println("--------------");
//        if(isPalindrome(1551)) {
//            System.out.println("Number given is palindrome");
//        }
    }

    private static void counterBack(int i) {
        if (i == -1) {
            return;
        }

        System.out.print(i + " ");
        //i--;
        counterBack(--i);
    }

    private static void readAbecedary(int i) {
        if (i > ABECEDARY.length() - 1) {
            return;
        }

        char[] array = ABECEDARY.toCharArray();
        char c = array[i];
        System.out.print(c + " ");
        i++;
        readAbecedary(i);
    }
    private static int calculateFactorialUsingArray(int a){
        int factorial=1;
        for (int i=1;i<=a;i++){
            factorial=i*factorial;
        }
        return factorial;

    }
    private static int factorialOf(int a){
        if(a ==1){
            return a;
        }
        return a* factorialOf(--a);
    }
    private static int getNumberInFibonacciSequence(int num){
        if (num==0 || num==1) {
            return num;
        } else {
            return getNumberInFibonacciSequence(num-1)+ getNumberInFibonacciSequence(num-2);
        }
    }
    private static void fibonacciSequence(int x, int b, int end) {
        if (b == end) {
            return;
        }

        int i = x + b;
        System.out.print(i + " ");
        fibonacciSequence(b, i, end);
    }
}
