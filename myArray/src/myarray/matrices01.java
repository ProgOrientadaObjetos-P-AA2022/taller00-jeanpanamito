/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myarray;

import java.util.Scanner;

/**
 *
 * @author JEanpa
 */
public class matrices01 {

    Scanner entrada;
    int[][] myMatriz;

    public matrices01(int fil, int col) {
        this.entrada = new Scanner(System.in);
        this.myMatriz = new int[fil][col];

    }

    public int menu() {
        int op;
        System.out.println("Leer Matriz                     [1]:");
        System.out.println("Presentar Matriz                [2]:");
        System.out.println("Transponer                      [3]:");
        System.out.println("Transponer matriz Secundario:   [4]");
        System.out.println("Multiplicacion de matrices      [5]:");
        System.out.println("Determinante                    [6]:");
        System.out.println("Suma de Pares e Impares         [7]:");
        System.out.println("Calcular la media de una clase  [8]:");
        System.out.println("Salir                           [0]:");

        op = entrada.nextInt();
        return op;
    }

    public void leerMatriz() {
        for (int i = 0; i < myMatriz.length; i++) {
            for (int j = 0; j < myMatriz.length; j++) {
                System.out.println("Ingrese elemento [" + i + "][" + j + "]:");
                myMatriz[i][j] = entrada.nextInt();

            }

        }
    }

    public void sumaPareseImpares() {
        int sp = 0;
        int si = 0;
        for (int i = 0; i < myMatriz.length; i++) {
            for (int j = 0; j < myMatriz[0].length; i++) {
                if (myMatriz[i][j] % 2 == 0) {
                    sp += myMatriz[i][j];
                    System.out.println("valores Pares");
                    System.out.println(myMatriz[i][j] + " ");
                } else {
                    si += myMatriz[i][j];
                }
                System.out.println("valores Impares");
                System.out.print(myMatriz[i][j] + " ");

            }
        }
    }

    public void leerMatriz(int[][] x) {
        int l = 0;
        System.out.println("Matriz " + (l + 1));
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[0].length; j++) {
                System.out.println("Ingrese elemento [" + i + "][" + j + "]:");
                x[i][j] = entrada.nextInt();

            }

        }
    }

    public void multiplica(int[][] a, int[][] b, int[][] c) {
        int S;
        for (int i = 0; i < a.length; i++) {
            for (int l = 0; l < b[0].length; l++) {
                S = 0;
                for (int j = 0; j < a[0].length; j++) {
                    S += a[i][j] * b[j][l];
                }
                c[i][l] = S;
            }
        }
    }

    public void presentaMatriz(int[][] x) {
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[0].length; j++) {
                System.out.print(x[i][j] + " ");

            }
            System.out.println(" ");

        }
    }

    public void presentaMatriz() {
        for (int i = 0; i < myMatriz.length; i++) {
            for (int j = 0; j < myMatriz.length; j++) {
                System.out.print(myMatriz[i][j] + " ");

            }
            System.out.println(" ");

        }
    }

    public void trasponer() {
        int aux;
        for (int i = 0; i < myMatriz.length - 1; i++) {
            for (int j = i + 1; j < myMatriz[0].length; j++) {
                aux = myMatriz[i][j];
                myMatriz[i][j] = myMatriz[j][i];
                myMatriz[j][i] = aux;

            }

        }
    }

    public void transponerDiagonalSecundaria() {
        int aux;
        int l;
        int k;
        k = myMatriz.length - 1;
        for (int i = 0; i < myMatriz.length - 1; i++) {
            l = myMatriz.length - 1;
            for (int j = 0; j < (myMatriz.length - 1 - i); j++) {
                aux = myMatriz[i][j];
                myMatriz[i][j] = myMatriz[l][k];
                myMatriz[l][k] = aux;

                l--;
            }
            k--;

        }

    }

    public int determinante(int[][] X) {
        int Sp = 0, Sn = 0, Ap, An, j, l;
        for (var k = 0; k < X.length; k++) {
            j = X.length - 1 - k;
            l = X.length - 1 - k;
            Ap = 1;
            An = 1;
            for (var X1 : X) {
                Ap *= X1[j];
                An *= X1[l];
                if (j == X.length - 1) {
                    j = 0;
                } else {
                    j++;
                }
                if (l == 0) {
                    l = X.length - 1;
                } else {
                    l--;
                }
            }
            Sp += Ap;
            Sn += An;
        }
        return Sp - Sn;
    }

    /*public int inicializarMatriz(int[][]x, int n ,int m) {
        int[][] A = new int[n][m];
        int[] filas = new int[n];
        int[] columas = new int[m];
        
        
        return 
     */

    public void asignarNotas(int[][] alumnos) {
        int l = 0;
        System.out.println("Matriz " + (l + 1));
        for (int i = 0; i < alumnos.length; i++) {
            for (int j = 0; j < alumnos[0].length; j++) {
                System.out.println("Ingrese elemento [" + i + "][" + j + "]:");
                alumnos[i][j] = entrada.nextInt();

            }

        }
    }

    public void mediaAlumno(int[][] alumnos) {
        int[][] est;
        int[][] mat;
        
        double c = 0;
         double pt = 0;
         double pAus =0;
  
         for (int i = 0; i < alumnos.length; i++) {
            for (int j = 0; j < alumnos[0].length; j++) {
            }
            }
    }

   

    public void presentaAlumnos(int[][] alumnos) {
   for (int i = 0; i < alumnos.length; i++) {
            for (int j = 0; j < alumnos[0].length; j++) {
                System.out.print(alumnos[i][j] + " ");

            }
            System.out.println(" ");

        }
    }
}
