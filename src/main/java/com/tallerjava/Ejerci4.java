package com.tallerjava;

import java.util.Scanner; 
public  class  Ejerci4 { 
    public  static  void  main (String[] args) { 
        Scanner  scanner  =  new  Scanner (System.in); 

         System.out.print( "Ingresa un número: " ); 
        int  number  = scanner.nextInt(); 

        if (number % 2 == 0 ) { 
            System.out.println(number + " es un número par." ); 
        } else { 
            System.out.println(number + " es un número impar." ); 
        } 

         scanner.close(); 
    } 
}