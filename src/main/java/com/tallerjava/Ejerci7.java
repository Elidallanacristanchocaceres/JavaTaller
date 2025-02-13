package com.tallerjava;

import java.util.Random;
import java.util.Scanner;

public class Ejerci7 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int numeroSecreto = random.nextInt(100) + 1;
        int intento;
        
        System.out.println("Adivina el número (entre 1 y 100):");

        do {
            System.out.print("Ingresa tu número: ");
            intento = scanner.nextInt();

            if (intento < numeroSecreto) {
                System.out.println("Frio.");
            } else if (intento > numeroSecreto) {
                System.out.println("Caliente.");
            }
        } while (intento != numeroSecreto);

        System.out.println("El numero es correcto.");

        scanner.close();
    }
}