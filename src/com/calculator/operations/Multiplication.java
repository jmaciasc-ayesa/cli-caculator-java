package com.calculator.operations;

import java.util.Scanner;

public class Multiplication extends Operation {
    public Multiplication(Scanner scanner) {
        super(scanner);
    }

    @Override
    public void execute() {
        System.out.print("Introduzca el primer número: ");
        double num1 = scanner.nextDouble();
        System.out.print("Introduzca el segundo número: ");
        double num2 = scanner.nextDouble();
        double result = num1 * num2;
        System.out.printf("Resultado: %.2f * %.2f = %.2f%n", num1, num2, result);
    }
}
