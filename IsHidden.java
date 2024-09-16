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
public class IsHidden {
      public static void main(String[] args) {
        String File = "C:\\Users\\liberadosecretaria1\\Documents\\Fichero.txt";
        File file = new File(File);

        if (file.isHidden()) {
            System.out.println("El archivo esta ocultado");
        } else {
            System.out.println("El archivo no esta ocultado.");
        }
    }
}
