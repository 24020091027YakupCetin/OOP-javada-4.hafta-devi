package StackOflntegers1test;

import stackofıntegers1.StackOfIntegers1;
import stackofıntegers1.StackOfIntegers1;

public class Main {
    public static void main(String[] args) {
        StackOfIntegers1 stack = new StackOfIntegers1();

        for (int i = 2; i < 120; i++) {
            if (isPrime(i)) {
                stack.push(i);
            }
        }

        int count = 0;
        while (!stack.empty()) {
            System.out.printf("%-4d", stack.pop());
            count++;
            if (count % 10 == 0) {
                System.out.println();
            }
        }
        System.out.println();
    }

    public static boolean isPrime(int number) {
        for (int divisor = 2; divisor <= number / 2; divisor++) {
            if (number % divisor == 0) {
                return false;
            }
        }
        return true;
    }
}