/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.practicarficheros;

/**
 *
 * @author liberadosecretaria1
 */
 import java.io.File;
public class Exists {
    public static void main(String[] args) {
        String File = "C:\\Users\\liberadosecretaria1\\Documents\\Fichero.txt";
        File file = new File(File);

        if (file.exists()) {
            System.out.println("El archivo existe.");
        } else {
            System.out.println("El archivo no existe.");
        }
    }
}
