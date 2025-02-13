package com.tallerjava;

import java.util.Scanner;

public class InteresCompuesto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el monto inicial de inversión: ");
        double capitalInicial = scanner.nextDouble();

        System.out.print("Ingrese la tasa de interés anual (%): ");
        double tasaAnual = scanner.nextDouble() / 100;

        System.out.print("Ingrese el número de años de inversión: ");
        int años = scanner.nextInt();

        System.out.println("Seleccione la frecuencia de capitalización:");
        System.out.println("1. Mensual");
        System.out.println("2. Trimestral");
        System.out.println("3. Semestral");
        System.out.println("4. Anual");
        System.out.print("Opción: ");
        int opcion = scanner.nextInt();

        int capitalizaciones;
        switch(opcion) {
            case 1:
                capitalizaciones = 12;
                break;
            case 2:
                capitalizaciones = 4;
                break;
            case 3:
                capitalizaciones = 2;
                break;
            case 4:
                capitalizaciones = 1;
                break;
            default:
                System.out.println("Opción no válida. Se usará capitalización anual.");
                capitalizaciones = 1;
                break;
        }

        double saldo = capitalInicial;

        System.out.printf("%-5s %-20s %-20s %-20s%n", "Año", "Capital Inicial", "Interés Ganado", "Saldo Final");
        for (int i = 1; i <= años; i++) {
            double inicioAño = saldo;
            // Se calcula el saldo tras un año de capitalizaciones
            double nuevoSaldo = saldo * Math.pow(1 + tasaAnual / capitalizaciones, capitalizaciones);
            double interesGanado = nuevoSaldo - saldo;
            saldo = nuevoSaldo;
            System.out.printf("%-5d %-20.2f %-20.2f %-20.2f%n", i, inicioAño, interesGanado, saldo);
        }

        scanner.close();
}
}
