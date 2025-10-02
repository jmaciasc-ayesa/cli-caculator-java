package com.calculator;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CliCalculator {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                printMenu();
                try {
                    System.out.print("Elija una opción: ");
                    int choice = scanner.nextInt();

                    if (choice == 0) {
                        System.out.println("Saliendo de la calculadora. ¡Adiós!");
                        break;
                    }

                    performOperation(choice, scanner);

                } catch (InputMismatchException e) {
                    System.out.println("Error: Entrada no válida. Por favor, introduzca un número.");
                    scanner.next(); // Limpiar el buffer de entrada
                } catch (ArithmeticException e) {
                    System.out.println("Error: " + e.getMessage());
                }

                System.out.println("\n----------------------------------------\n");
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

    private static void performOperation(int choice, Scanner scanner) {
        double num1, num2;
        double result = 0;

        switch (choice) {
            case 1: // Suma
                System.out.print("Introduzca el primer número: ");
                num1 = scanner.nextDouble();
                System.out.print("Introduzca el segundo número: ");
                num2 = scanner.nextDouble();
                result = num1 + num2;
                System.out.printf("Resultado: %.2f + %.2f = %.2f%n", num1, num2, result);
                break;

            case 2: // Resta
                System.out.print("Introduzca el primer número: ");
                num1 = scanner.nextDouble();
                System.out.print("Introduzca el segundo número: ");
                num2 = scanner.nextDouble();
                result = num1 - num2;
                System.out.printf("Resultado: %.2f - %.2f = %.2f%n", num1, num2, result);
                break;

            case 3: // Multiplicación
                System.out.print("Introduzca el primer número: ");
                num1 = scanner.nextDouble();
                System.out.print("Introduzca el segundo número: ");
                num2 = scanner.nextDouble();
                result = num1 * num2;
                System.out.printf("Resultado: %.2f * %.2f = %.2f%n", num1, num2, result);
                break;

            case 4: // División
                System.out.print("Introduzca el dividendo: ");
                num1 = scanner.nextDouble();
                System.out.print("Introduzca el divisor: ");
                num2 = scanner.nextDouble();
                if (num2 == 0) {
                    throw new ArithmeticException("No se puede dividir por cero.");
                }
                result = num1 / num2;
                System.out.printf("Resultado: %.2f / %.2f = %.2f%n", num1, num2, result);
                break;

            case 5: // Potencia
                System.out.print("Introduzca la base: ");
                num1 = scanner.nextDouble();
                System.out.print("Introduzca el exponente: ");
                num2 = scanner.nextDouble();
                result = Math.pow(num1, num2);
                System.out.printf("Resultado: %.2f ^ %.2f = %.2f%n", num1, num2, result);
                break;

            case 6: // Raíz Cuadrada
                System.out.print("Introduzca el número: ");
                num1 = scanner.nextDouble();
                if (num1 < 0) {
                    throw new ArithmeticException("No se puede calcular la raíz cuadrada de un número negativo.");
                }
                result = Math.sqrt(num1);
                System.out.printf("Resultado: La raíz cuadrada de %.2f es %.2f%n", num1, result);
                break;

            default:
                System.out.println("Error: Opción no válida. Por favor, elija una opción del menú.");
                break;
        }
    }
}
