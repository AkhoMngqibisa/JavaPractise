package MethodsAndParameters;

public class Calculator {

    static void main(String[] args) {
        int sum = addNumbers(5, 7);
        System.out.println("Sum " + sum);
    }

    public static int addNumbers(int num1, int num2) {
        return num1 + num2;
    }
}
