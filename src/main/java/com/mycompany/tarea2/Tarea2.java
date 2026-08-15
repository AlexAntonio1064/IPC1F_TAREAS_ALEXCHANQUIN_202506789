package com.mycompany.tarea2;

import java.util.Scanner;

/**
 *
 * @author Ajualip Alex 202506789
 */
public class Tarea2 {

// Scanner para lectura 
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int cantidadDatos = 0;         // cantidad de elementos
        double promedioGlobal = 0.0;   // messirve para la fase 3
        char version = 'A';            
        boolean datosValidos = false; 

        System.out.println("=== TAREA 2: Fundamentos de Java (version " + version + ") ===");
        System.out.println("cantidadDatos = " + cantidadDatos);
        System.out.println("promedioGlobal = " + promedioGlobal);
        System.out.println("datosValidos = " + datosValidos);

        sc.close();
    }
}
