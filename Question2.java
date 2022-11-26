import java.util.*;

public class Question2 {
    public static void addition(int a, int b) {
        if(a< 0||b < 0) {
            throw new ArithmeticException("Negative numbers not allowed");
        }
        else {
            System.out.println(a+b);
        }
    }
    public static void subtraction(int a, int b) {
        if(a< 0 || b< 0) {
            throw new ArithmeticException("Negative numbers not allowed");
        }
        else {
            System.out.println(a-b);
        }
    }
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        System.out.print("Input first number : ");
        int num1 = scn.nextInt();

        System.out.print("Input second number : ");
        int num2 = scn.nextInt();

        try {
            addition(num1, num2);
        }
        catch(ArithmeticException e) { // catch block for handling arithmetic exception
            System.out.println(e);
        }
        try {
            subtraction(num1, num2);
        }
        catch(ArithmeticException e) { // catch block for handling arithmetic exception
            System.out.println(e);
        }
    }
}
