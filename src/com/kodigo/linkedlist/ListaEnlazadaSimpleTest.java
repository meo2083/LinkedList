package com.kodigo.linkedlist;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Clase con test unitarios JUnit para métodos de insertar eliminar y buscar en lista enlazada
 */
public class ListaEnlazadaSimpleTest {

    private ListaEnlazadaSimple lista;

    /**
     * Inicializa una nueva lista enlazada antes de cada prueba
     */
    @Before
    public void setUp() {
        lista = new ListaEnlazadaSimple();
    }

    /**
     * Test unitario para método de insertar al inicio
     */
    @Test
    public void testInsertarAlInicio() {
        lista.insertarAlInicio(10);
        assertTrue("El elemento 10 debería estar en la lista.", lista.buscar(10));

        lista.insertarAlInicio(20);
        assertTrue("El elemento 20 debería estar en la lista.", lista.buscar(20));
    }

    /**
     * Test unitario para método de insertar al final
     */
    @Test
    public void testInsertarAlFinal() {
        lista.insertarAlFinal(10);
        assertTrue("El elemento 10 debería estar en la lista.", lista.buscar(10));

        lista.insertarAlFinal(20);
        assertTrue("El elemento 20 debería estar en la lista.", lista.buscar(20));
    }

    /**
     * Test unitario para método de eliminar al inicio
     */
    @Test
    public void testEliminarAlInicio() {
        lista.insertarAlInicio(10);
        lista.insertarAlInicio(20);
        lista.eliminarAlInicio();

        assertFalse("El elemento 20 debería haber sido eliminado.", lista.buscar(20));
        assertTrue("El elemento 10 debería estar en la lista.", lista.buscar(10));
    }

    /**
     * Test unitario para método de eliminar al final
     */
    @Test
    public void testEliminarAlFinal() {
        lista.insertarAlFinal(10);
        lista.insertarAlFinal(20);
        lista.eliminarAlFinal();

        assertFalse("El elemento 20 debería haber sido eliminado.", lista.buscar(20));
        assertTrue("El elemento 10 debería estar en la lista.", lista.buscar(10));
    }

    /**
     * Test unitario para eliminar al final si solo existe un nodo en la lista
     */
    @Test
    public void testEliminarAlFinalConUnSoloElemento() {
        lista.insertarAlFinal(10);
        lista.eliminarAlFinal();

        assertFalse("La lista debería estar vacía después de eliminar el único elemento.", lista.buscar(10));
    }

    /**
     * Test unitario de eliminar al inicio cuando solo existe un nodo en la lista
     */
    @Test
    public void testEliminarAlInicioConUnSoloElemento() {
        lista.insertarAlInicio(10);
        lista.eliminarAlInicio();

        assertFalse("La lista debería estar vacía después de eliminar el único elemento.", lista.buscar(10));
    }

    /**
     * Test unitario para buscar un nodo en la lista
     */
    @Test
    public void testBuscar() {
        lista.insertarAlInicio(10);
        assertTrue("El elemento 10 debería estar en la lista.", lista.buscar(10));
        assertFalse("El elemento 20 no debería estar en la lista.", lista.buscar(20));
    }

}
