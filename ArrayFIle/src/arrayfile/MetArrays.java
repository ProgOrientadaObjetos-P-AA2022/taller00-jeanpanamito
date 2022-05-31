/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayfile;

import java.util.Scanner;

/**
 *
 * @author PERSONAL
 */
public class MetArrays {
    Scanner entrada;
    int [][]myMatriz;
    
    public MetArrays(int n) {
    this.myMatriz=new int [n][n];
    }
    public void showMatriz(){
        for (int i = 0; i < myMatriz.length; i++) {
            for (int j = 0; j < myMatriz[0].length; j++) {
                System.out.print(myMatriz[i][j]+" ");
                
            }
            System.out.println("\n");
           
        }
    }
}
