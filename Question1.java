import java.util.*;
public class Question1 {
    public static void multiply(int a, int b){
        if(a==0||b==0)
            throw new ArithmeticException("Multiplication by zero not allowed");
        else {
            System.out.println(a*b);
        }
    }
    public static void divide(int a, int b){
        if(a==0||b==0)
            throw new ArithmeticException("Division by zero not allowed");
        else {
            System.out.println(a/b);
        }
    }
    public static void main(String []args){
        Scanner scn = new Scanner(System.in);
        System.out.print("Input first number : ");
        int a = scn.nextInt();
        System.out.print("Input second number : ");
        int b = scn.nextInt();
        try {
            divide(a,b);
        }
        catch(ArithmeticException e) {
            System.out.println(e);
        }
        try{
            multiply(a,b);
        }
        catch(ArithmeticException e) {
            System.out.println(e);
        }
    }
}
