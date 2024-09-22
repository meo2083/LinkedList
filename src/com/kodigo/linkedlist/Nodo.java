package com.kodigo.linkedlist;

/**
 * Clase nodo con atributos dato que representa el dato en la lista y
 * Nodo que representa el siguiente nodo de la lista
 */
public class Nodo {

    private int dato;
    private Nodo siguiente;

    /**
     * Constructor que inicializa el atributo dato y siguiente en null
     * @param dato número entero con el que se inicializa el nodo
     */
    public Nodo(int dato) {
        this.dato = dato;
        this.siguiente = null;
    }

    /**
     * Obtiene el valor de atributo dato
     * @return número entero de atributo dato
     */
    public int getDato() {
        return dato;
    }

    /**
     * Establece el valor del atributo dato
     * @param dato número entero que será el nuevo valor de dato
     */
    public void setDato(int dato) {
        this.dato = dato;
    }

    /**
     * Obtiene el nodo siguiente
     * @return nodo siguiente
     */
    public Nodo getSiguiente() {
        return siguiente;
    }

    /**
     * Establece el nuevo valor del nodo siguiente
     * @param siguiente Valor de nodo siguiente
     */
    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }
}
