package com.calculator;

import com.calculator.operations.*;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class CliCalculator {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            Map<Integer, Operation> operations = new HashMap<>();
            operations.put(1, new Addition(scanner));
            operations.put(2, new Subtraction(scanner));
            operations.put(3, new Multiplication(scanner));
            operations.put(4, new Division(scanner));
            operations.put(5, new Power(scanner));
            operations.put(6, new SquareRoot(scanner));

            while (true) {
                printMenu();
                try {
                    System.out.print("Elija una opción: ");
                    int choice = scanner.nextInt();

                    if (choice == 0) {
                        System.out.println("Saliendo de la calculadora. ¡Adiós!");
                        break;
                    }

                    Operation operation = operations.get(choice);
                    if (operation != null) {
                        operation.execute();
                    } else {
                        System.out.println("Error: Opción no válida. Por favor, elija una opción del menú.");
                    }

                } catch (InputMismatchException e) {
                    System.out.println("Error: Entrada no válida. Por favor, introduzca un número.");
                    scanner.next(); // Limpiar el buffer de entrada
                } catch (ArithmeticException e) {
                    System.out.println("Error: " + e.getMessage());
                }

                System.out.println("
----------------------------------------
");
            }
        }
    }

    private static void printMenu() {
        System.out.println("===== Calculadora CLI =====");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicación");
        System.out.println("4. División");
        System.out.println("5. Potencia (x^y)");
        System.out.println("6. Raíz Cuadrada");
        System.out.println("0. Salir");
        System.out.println("===========================");
    }
}