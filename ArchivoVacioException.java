package com.uea.tarea9;

// Excepción personalizada
public class ArchivoVacioException extends Exception {
    public ArchivoVacioException(String mensaje) {
        super(mensaje);
    }
}
