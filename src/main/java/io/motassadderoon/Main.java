package io.motassadderoon;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator("5 + 3 - 2 + 7");
        System.out.println("Result: " + calculator.evaluate());  // Output: 13
    }
}
