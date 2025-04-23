package pack;

import java.util.Scanner;

public class MultiplyDivideWithoutOperators {

    // Method to multiply two integers without using '*'
    public static int multiply(int a, int b) {
        int result = 0;
        boolean negative = false;

        // Handle negative values
        if (a < 0) {
            a = -a;
            negative = !negative;
        }
        if (b < 0) {
            b = -b;
            negative = !negative;
        }

        for (int i = 0; i < b; i++) {
            result += a;
        }

        return negative ? -result : result;
    }

    // Method to divide two integers without using '/'
    public static int divide(int dividend, int divisor) {
        if (divisor == 0) {
            throw new ArithmeticException("Division by zero");
        }

        boolean negative = (dividend < 0) ^ (divisor < 0);
        int a = Math.abs(dividend);
        int b = Math.abs(divisor);
        int quotient = 0;

        while (a >= b) {
            a -= b;
            quotient++;
        }

        return negative ? -quotient : quotient;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        try {
            int product = multiply(num1, num2);
            int quotient = divide(num1, num2);

            System.out.println("Multiplication (without *): " + product);
            System.out.println("Division (without /): " + quotient);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}
