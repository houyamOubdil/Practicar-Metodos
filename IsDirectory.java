/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practicarficheros;

/**
 *
 * @author liberadosecretaria1
 */
import java.io.File;
public class IsDirectory {
        public static void main(String[] args) {
            String Directory = "C:\\Users\\liberadosecretaria1\\Documents";
        File directorio = new File(Directory);

        if (directorio.isDirectory()) {
            System.out.println("Este documento es un directorio");
        } else {
            System.out.println("Este documento no es un directorio");
        }
}
}
