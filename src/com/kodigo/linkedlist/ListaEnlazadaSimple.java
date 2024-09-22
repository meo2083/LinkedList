package com.kodigo.linkedlist;

/**
 * Clase con métodos de una lista enlazada simple: insertar, buscar, eliminar e imprimir
 */
public class ListaEnlazadaSimple {

    private Nodo cabeza;

    /**
     * Constructor que inicializa cabeza en null
     */
    public ListaEnlazadaSimple() {
        this.cabeza = null;
    }

    /**
     * Inserta un nuevo nodo al inicio de la lista
     * @param dato número entero que se añadirá al inicio de la lista
     */
    public void insertarAlInicio(int dato) {
        //Crea un nuevo nodo con el número entero proporcionado
        Nodo nuevoNodo = new Nodo(dato);

        //Hace que siguiente del nuevo nodo apunte a la cabeza actual
        nuevoNodo.setSiguiente(cabeza);

        //Actualizar la cabeza para que apunte al nuevo nodo (dato al inicio de la lista)
        cabeza = nuevoNodo;
    }

    /**
     * Inserta un nuevo nodo al final de la lista
     * @param dato número entero que se añadirá al final de la lista
     */
    public void insertarAlFinal(int dato) {
        // Crear un nuevo nodo con el dato proporcionado
        Nodo nuevoNodo = new Nodo(dato);

        // Si la lista está vacía, el nuevo nodo se convierte en la cabeza
        if (cabeza == null) {
            cabeza = nuevoNodo;
            return; // Salir del método
        }

        // Si no, recorrer la lista hasta el último nodo
        Nodo actual = cabeza;
        while (actual.getSiguiente() != null) {
            actual = actual.getSiguiente();
        }

        // Enlazar el nuevo nodo al final de la lista
        actual.setSiguiente(nuevoNodo);
    }

    /**
     * Elimina el nodo al inicio de la lista
     */
    public void eliminarAlInicio() {
        //Comprobar si la lista no está vacía
        if (cabeza != null) {
            //Actualizar la cabeza para que apunte al siguiente nodo
            cabeza = cabeza.getSiguiente();
        } else {
            //Si la lista está vacía mostrar un mensaje indicándolo
            System.out.println("La lista está vacía, no se puede eliminar.");
        }
    }

    /**
     * Elimina el nodo al final de la lista
     */
    public void eliminarAlFinal() {
        // Comprobar si la lista está vacía
        if (cabeza == null) {
            System.out.println("La lista está vacía, no se puede eliminar.");
            return; // Salir del método si la lista está vacía
        }

        // Si solo hay un nodo, se elimina la cabeza
        if (cabeza.getSiguiente() == null) {
            cabeza = null; // La lista queda vacía
            return; // Salir del método
        }

        // Recorrer la lista hasta el penúltimo nodo
        Nodo actual = cabeza;
        while (actual.getSiguiente().getSiguiente() != null) {
            actual = actual.getSiguiente();
        }

        // Establecer el siguiente del penúltimo nodo a null, eliminando el último nodo
        actual.setSiguiente(null);
    }

    /**
     * Método que imprime la lista
     */
    public void imprimirLista() {
        //Iniciar desde la cabeza de la lista
        Nodo actual = cabeza;

        //Recorrer la lista mientras el nodo actual no sea nulo
        while (actual != null) {
            // Imprimir el dato del nodo actual seguido de una flecha
            System.out.print(actual.getDato() + " -> ");

            // Moverse al siguiente nodo
            actual = actual.getSiguiente();
        }
        System.out.println("null");
    }

    /**
     * Método para buscar un elemento de la lista
     * @param dato número entero que se buscará en la lista
     * @return true si lo encuentra y false en caso contrario
     */
    public boolean buscar(int dato) {
        Nodo actual = cabeza;
        while (actual != null) {
            if (actual.getDato() == dato) {
                return true;
            }
            actual = actual.getSiguiente();
        }
        return false;
    }
}
