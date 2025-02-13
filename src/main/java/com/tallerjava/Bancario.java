
package com.tallerjava;

import java.util.Scanner;

public class Bancario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa el monto del préstamo: ");
        double monto = scanner.nextDouble();

        System.out.print("Ingresa la tasa de interés anual (%): ");
        double tasaAnual = scanner.nextDouble() / 100;

        System.out.print("Ingresa el plazo del préstamo (en años): ");
        int años = scanner.nextInt();

        int meses = años * 12;
        double tasaMensual = tasaAnual / 12;
        double cuota = (monto * tasaMensual) / (1 - Math.pow(1 + tasaMensual, -meses));

        System.out.printf("%-10s %-15s %-15s %-15s %-15s %-15s%n",
                "Cuota", "Saldo Inicial", "Cuota Mensual", "Interés", "Capital", "Saldo Pendiente");

        double saldo = monto;
        for (int i = 1; i <= meses; i++) {
            double interes = saldo * tasaMensual;
            double capital = cuota - interes;
            saldo -= capital;
            System.out.printf("%-10d %-15.2f %-15.2f %-15.2f %-15.2f %-15.2f%n",
                i, monto, cuota, interes, capital, saldo);
        }

        scanner.close();
    }
}