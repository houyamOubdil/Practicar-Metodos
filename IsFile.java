/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practicarficheros;

import java.io.File;

/**
 *
 * @author liberadosecretaria1
 */
public class IsFile {
        public static void main(String[] args) {
        // Ruta del archivo
         File archivo = new File("C:\\Users\\liberadosecretaria1\\Documents\\Fichero.txt");
        // Verificar si la ruta es un archivo
        if (archivo.isFile()) {
            System.out.println("Esta ruta es un archivo.");
        } else {
            System.out.println("Esta ruta no es un archivo.");
        }
    }
}


