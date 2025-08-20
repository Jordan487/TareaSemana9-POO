package com.uea.tarea9;

import java.io.*;

public class GestorDeArchivo {

    // Método para guardar contenido en un archivo
    public void guardar(String nombreArchivo, String contenido) throws IOException {
        FileWriter fw = new FileWriter(nombreArchivo);
        try (BufferedWriter bw = new BufferedWriter(fw)) {
            bw.write(contenido);
        }
        System.out.println("Contenido guardado en el archivo: " + nombreArchivo);
    }

    // Método para leer el contenido del archivo línea por línea
    public String leer(String nombreArchivo) throws IOException {
        FileReader fr = new FileReader(nombreArchivo);
        StringBuilder contenido;
        try (BufferedReader br = new BufferedReader(fr)) {
            contenido = new StringBuilder();
            String linea;
            while ((linea = br.readLine()) != null) {
                contenido.append(linea).append("\n");
            }
        }
        return contenido.toString();
    }
}