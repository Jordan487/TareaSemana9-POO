package com.uea.tarea9;

import java.io.*;

public class ValidadorArchivo {

    // Método para verificar si un archivo está vacío
    public void verificarNoVacio(String nombreArchivo) throws IOException, ArchivoVacioException {
        try (BufferedReader br = new BufferedReader(new FileReader(nombreArchivo))) {
            if (br.readLine() == null) {
                br.close();
                throw new ArchivoVacioException("El archivo " + nombreArchivo + " está vacío.");
            }
        }
        System.out.println("El archivo " + nombreArchivo + " tiene contenido.");
    }
}