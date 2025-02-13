package com.tallerjava;


import java.util.Scanner;

public class Ejerci6 {
    public static void main (String [] args){
        int Multiplicando ;
     
        System.out.println("Ingresa que tabla quieres hacer: ");
        Scanner valor1 = new Scanner(System.in);
        Multiplicando = valor1.nextInt();

        int multiplicador = 1;
        while(multiplicador <=10){
        System.out.println(Multiplicando + " X " + multiplicador + " = " + Multiplicando * multiplicador );
        multiplicador++;
    
        }
    } 
}