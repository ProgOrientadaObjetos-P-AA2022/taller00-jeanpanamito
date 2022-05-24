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
            id = entrada.nextInt();
            entrada.nextLine();
            System.out.println("Ingresar Nombre: ");
            nombre = entrada.nextLine();

            System.out.println("Ingrear Correo");
            correo = entrada.nextLine();
            escribir = new FileWriter(archivo, true); // si pones false elimina lo que hayas escrito y guarda de nuevo
                                                        //mientras que con el true sigue escribiendo en el txt 
           
            linea = new PrintWriter(escribir);
            linea.println(id + "\n" + nombre + "\n" + correo);
            linea.close();
        } catch (Exception e) {
        }
    }

    public void presentar() {
        FileReader leer; 
        String _nombre = "", _id = "", _correo = "", cadena = "";
        BufferedReader almacenamiento;
        try {
            leer = new FileReader(archivo);
            almacenamiento = new BufferedReader(leer);
            while (cadena != null) {
                cadena = almacenamiento.readLine();
                _id = cadena;
                cadena = almacenamiento.readLine();
                _nombre = cadena;
                cadena = almacenamiento.readLine();
                _correo = cadena;
                if(cadena!=null)
                    System.out.println(_id+"\t"+_nombre+"\t"+_correo);
            }
            almacenamiento.close();
            leer.close();
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
                case 2:
                    obj.presentar();

            }

        } while (op != 0);
    }

}
