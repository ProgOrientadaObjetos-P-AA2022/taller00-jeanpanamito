/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayfile;

import java.io.*;

public class metFiles {

    File archivo = new File("myArchivo.txt");
    MetArrays objArrays;

    public void llenarM() {
        FileReader leer;
        String _cadena = "";
        int numero;
        BufferedReader almacenamiento;
        try {
            leer = new FileReader(archivo);
            almacenamiento = new BufferedReader(leer);
            _cadena = almacenamiento.readLine();
            numero = Character.getNumericValue(_cadena.charAt(0));
            objArrays = new MetArrays(numero);
            for (int i = 0; i < objArrays.myMatriz.length; i++) {
                for (int j = 0; j < objArrays.myMatriz[0].length; j++) {
                    _cadena = almacenamiento.readLine();
                    numero = Character.getNumericValue(_cadena.charAt(0));
                    objArrays.myMatriz[i][j]=numero;

                }

            }
            almacenamiento.close();
            leer.close();
        } catch (Exception e) {
        }
           objArrays.showMatriz();
    }
 
}
