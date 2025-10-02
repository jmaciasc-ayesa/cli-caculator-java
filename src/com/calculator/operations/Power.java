package com.calculator.operations;

import java.util.Scanner;

public class Power extends Operation {
    public Power(Scanner scanner) {
        super(scanner);
    }

    @Override
    public void execute() {
        System.out.print("Introduzca la base: ");
        double num1 = scanner.nextDouble();
        System.out.print("Introduzca el exponente: ");
        double num2 = scanner.nextDouble();
        double result = Math.pow(num1, num2);
        System.out.printf("Resultado: %.2f ^ %.2f = %.2f%n", num1, num2, result);
    }
}
