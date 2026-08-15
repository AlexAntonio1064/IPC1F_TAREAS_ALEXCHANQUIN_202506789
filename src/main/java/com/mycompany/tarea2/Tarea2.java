package com.mycompany.tarea2;

import java.util.Scanner;

public class Tarea2 {

    public static void main(String[] args) {
        // Declaración y inicialización de 4 datos primitivos
        int limiteElementos = 5;
        double promedioGeneral = 0.0;
        char identificador = 'A';
        boolean esProgramaActivo = true;

        System.out.println("=== INICIANDO PROGRAMA ===");
    }

// Validacion de rango 
    public static int leerEnteroValido(Scanner scanner, String mensaje, int min, int max) {
        int numero = 0;
        boolean valido = false;

        while (!valido) {
            System.out.print(mensaje + " (" + min + " a " + max + "): ");
            if (scanner.hasNextInt()) {
                numero = scanner.nextInt();
                if (numero >= min && numero <= max) {
                    valido = true;
                } else {
                    System.out.println("Error: El número debe estar entre " + min + " y " + max + ".");
                }
            } else {
                System.out.println("Error: Debe ingresar un número entero válido.");
                scanner.next(); 
            }
        }
        return numero;
    }
// arreglo unidimensional
    public static void procesarArreglo1D(int[] arreglo) {
        int max = arreglo[0];
        int min = arreglo[0];
        int suma = 0;

        for (int num : arreglo) {
            if (num > max) max = num;
            if (num < min) min = num;
            suma += num;
        }

        double promedio = (double) suma / arreglo.length;

        System.out.println("\n--- RESULTADOS ARREGLO 1D ---");
        System.out.println("Valor Máximo: " + max);
        System.out.println("Valor Mínimo: " + min);
        System.out.println("Promedio: " + promedio);
    }
//Matriz bidimensional
    public static void procesarMatriz2D(int[][] matriz) {
        int sumaTotal = 0;

        System.out.println("\n--- MATRIZ (2D) ---");
        for (int i = 0; i < matriz.length; i++) {
            int sumaFila = 0;
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "\t");
                sumaFila += matriz[i][j];
                sumaTotal += matriz[i][j];
            }
            System.out.println("| Suma Fila " + (i + 1) + ": " + sumaFila);
        }
        System.out.println("Suma total de la matriz: " + sumaTotal);
    }

// Mostrar mensaje de final
    public static void finalizarPrograma() {
        System.out.println("\n========================================");
        System.out.println("   Programa finalizado exitosamente.   ");
        System.out.println("========================================");
    }
}