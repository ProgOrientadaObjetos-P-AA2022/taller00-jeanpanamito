/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myarray;

import static java.lang.System.out;
import java.util.Scanner;

/**
 *
 * @author JEanpa
 */
public class MyArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      matrices01 obj = new matrices01(4, 4);
        Scanner entrada = new Scanner(System.in);

        int op;
        int[][] A = new int[3][4];
        int[][] B = new int[4][2];
        int [][]C= new int [3][2];
        int [][] alumnos = new int [5][10];
        
        do {
            op = obj.menu();
            switch (op) {
                case 1:
                    obj.leerMatriz();

                    break;
                case 2:
                    obj.presentaMatriz();
                    break;
                case 3:
                    obj.trasponer();
                    break;
                case 4:
                    obj.transponerDiagonalSecundaria();
                    break;
                case 5:
                    obj.leerMatriz(A);
                    obj.leerMatriz(B);
                    obj.multiplica(A,B,C);
                    obj.presentaMatriz(C);
                    break;
                case 6:
                    System.out.println("__________________");
                    obj.leerMatriz(A);
                    obj.presentaMatriz(A);
                    System.out.println("--------------------");
                     System.out.println(obj.determinante(A));
                    System.out.println("____________________");
                    break;
                case 7:
                    obj.sumaPareseImpares();
                    
                   
                    break;
                case 8:
                     obj.asignarNotas(alumnos);
                   // obj.mediaAlumno(alumnos);
                    //obj.mediaClase(alumnos);
                   
                    obj.presentaAlumnos(alumnos);
                    
                    break;
                case 9:
                    obj.signo();
                break;
                    
                default: break;

            }
        } while (op != 0);
    }

}



    
    

