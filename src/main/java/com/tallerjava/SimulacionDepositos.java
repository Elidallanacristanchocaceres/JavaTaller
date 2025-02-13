package com.tallerjava;

import java.util.Scanner;

public class SimulacionDepositos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el saldo inicial de la cuenta: ");
        double saldoInicial = scanner.nextDouble();

        System.out.print("Ingrese el depósito mensual fijo: ");
        double deposito = scanner.nextDouble();

        System.out.print("Ingrese la tasa de interés anual (%): ");
        double tasaAnual = scanner.nextDouble() / 100;

        System.out.print("Ingrese el número de meses de simulación: ");
        int meses = scanner.nextInt();

        double saldo = saldoInicial;
        double tasaMensual = tasaAnual / 12;

        System.out.printf("%-5s %-15s %-15s %-15s %-15s%n", "Mes", "Saldo Inicial", "Depósito", "Interés", "Saldo Final");
        for (int i = 1; i <= meses; i++) {
            double saldoAntesDeposito = saldo;
            // Se realiza el depósito al inicio del mes
            saldo += deposito;
            // Se calcula el interés sobre el saldo actualizado
            double interes = saldo * tasaMensual;
            double saldoFinal = saldo + interes;
            System.out.printf("%-5d %-15.2f %-15.2f %-15.2f %-15.2f%n", i, saldoAntesDeposito, deposito, interes, saldoFinal);
            saldo = saldoFinal;
        }

        scanner.close();
    }
}
