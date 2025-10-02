package com.calculator.operations;

import java.util.Scanner;

public class SquareRoot extends Operation {
    public SquareRoot(Scanner scanner) {
        super(scanner);
    }

    @Override
    public void execute() {
        System.out.print("Introduzca el número: ");
        double num1 = scanner.nextDouble();
        if (num1 < 0) {
            throw new ArithmeticException("No se puede calcular la raíz cuadrada de un número negativo.");
        }
        double result = Math.sqrt(num1);
        System.out.printf("Resultado: La raíz cuadrada de %.2f es %.2f%n", num1, result);
    }
}
