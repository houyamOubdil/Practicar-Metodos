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
public class GetPath {
           public static void main(String[] args) {
            File archivo = new File ("C:\\Users\\liberadosecretaria1\\Documents\\Fichero.txt");
        String ruta = archivo.getPath();

        // Imprimir la ruta
        System.out.println("La ruta del archivo es: " + ruta);
} 
}
