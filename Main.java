package com.uea.tarea9;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        GestorDeArchivo gestor = new GestorDeArchivo();
        ValidadorArchivo validador = new ValidadorArchivo();

        String archivo = "archivo_prueba.txt";
        String contenido = "Hola, este es un ejemplo de la tarea.\nLínea 2: Aprendiendo manejo de archivos en Java.";

        try {
            // Guardar contenido en el archivo
            gestor.guardar(archivo, contenido);

            // Leer el contenido del archivo
            String textoLeido = gestor.leer(archivo);
            System.out.println("\nContenido leído del archivo:");
            System.out.println(textoLeido);

            // Verificar si el archivo está vacío
            validador.verificarNoVacio(archivo);

        } catch (ArchivoVacioException ave) {
            System.err.println("Error: " + ave.getMessage());
        } catch (IOException e) {
            System.err.println("Se produjo un error: " + e.getMessage());
        }
    }
}