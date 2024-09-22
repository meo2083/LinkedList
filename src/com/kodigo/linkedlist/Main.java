package com.kodigo.linkedlist;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Clase principal con menú de opciones para insertar, eliminar, buscar e imprimar
 * con una lista enlazada simple
 */
public class Main {
    /**
     * Método main que muestra el menú de opciones y realiza la operación seleccionada por el usuario
     * @param args array de cadenas para que se pueden pasar argumentos desde la línea de comandos al ejecutar el programa
     */
    public static void main(String[] args) {

        ListaEnlazadaSimple lista = new ListaEnlazadaSimple();
        Scanner scanner = new Scanner(System.in);
        int opcion, dato;

        opcion = -1;

        do {
            System.out.println("1. INSERTAR AL INICIO");
            System.out.println("2. ELIMINAR AL INICIO");
            System.out.println("3. IMPRIMIR LISTA");
            System.out.println("4. BUSCAR ELEMENTO");
            System.out.println("5. INSERTAR AL FINAL");
            System.out.println("6. ELIMINAR AL FINAL");
            System.out.println("0. SALIR");
            System.out.print("Elige una opción: ");
            try {
                opcion = scanner.nextInt();
                switch (opcion) {
                    case 1:
                        System.out.print("Introduce un dato: ");
                        dato = scanner.nextInt();
                        lista.insertarAlInicio(dato);
                        break;
                    case 2:
                        lista.eliminarAlInicio();
                        break;
                    case 3:
                        lista.imprimirLista();
                        break;
                    case 4:
                        System.out.print("Introduce el dato a buscar: ");
                        dato = scanner.nextInt();
                        if (lista.buscar(dato)) {
                            System.out.println("Elemento encontrado.");
                        } else {
                            System.out.println("Elemento no encontrado.");
                        }
                        break;
                    case 5:
                        System.out.print("Introduce un dato: ");
                        dato = scanner.nextInt();
                         lista.insertarAlFinal(dato);
                         break;
                    case 6:
                        lista.eliminarAlFinal();
                        break;
                    case 0:
                        System.out.println("Saliendo...");
                        break;
                    default:
                        System.out.println("Opción inválida. Intenta de nuevo.");
                }
            }catch (InputMismatchException e)
            {
                System.out.println("La opción debe ser un número entero entre 0 y 4");
                scanner.next();
            }
        } while (opcion != 0);
        scanner.close();
    }
}