package com.calculator.operations;

import java.util.Scanner;

public class Division extends Operation {
    public Division(Scanner scanner) {
        super(scanner);
    }

    @Override
    public void execute() {
        System.out.print("Introduzca el dividendo: ");
        double num1 = scanner.nextDouble();
        System.out.print("Introduzca el divisor: ");
        double num2 = scanner.nextDouble();
        if (num2 == 0) {
            throw new ArithmeticException("No se puede dividir por cero.");
        }
        double result = num1 / num2;
        System.out.printf("Resultado: %.2f / %.2f = %.2f%n", num1, num2, result);
    }
}
