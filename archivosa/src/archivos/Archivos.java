/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package archivos;

import java.io.*;
import java.util.Scanner;

/**
 *
 * @author UTPL
 */
public class Archivos {

    Scanner entrada = new Scanner(System.in);
    File archivo = new File("myFile.txt");

    public int menu() {
        int opc;
        System.out.println("Escribir en archivo        [1]");
        System.out.println("Leer desde el archivo      [2]");
        System.out.println("Salir [0]");
        opc = entrada.nextInt();
        return opc;
    }

    public void escribir() {
        FileWriter escribir;
        PrintWriter linea;
        int id;
        String nombre = "", correo = "";
        if (!archivo.exists()) {
            try {
                archivo.createNewFile();
            } catch (Exception e) {
            }

        }
        try {
            
            System.out.println("Ingresar ID: ");
            id=entrada.nextInt();
             entrada.nextLine();
            System.out.println("Ingresar Nombre: ");
            nombre = entrada.nextLine();
           
            System.out.println("Ingrear Correo");
            correo = entrada.nextLine();
            escribir = new FileWriter(archivo,false);
            linea = new PrintWriter(escribir);
            linea.println(id+"\n"+nombre+"\n"+correo);
            linea.close();
        } catch (Exception e) {
        }
    }

    public static void main(String[] args) {
        // TODO code application logic here
        Archivos obj = new Archivos();
        int op;
        do {
            op = obj.menu();
            switch (op) {
                case 1:
                    obj.escribir();
                    break;
         //       case 2:
           //         obj.presentar();

            }

        } while (op != 0);
    }

}