/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package multiplicacion_matrices;
import java.util.Scanner;

/**
 *
 * @author Pedro Valderrama
 */
public class Multiplicacion_matrices {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i;
        int j;
        int k;
        int matrizA[][] = new int[n][n];
        int matrizB[][] = new int[n][n];
        int matrizC[][] = new int[n][n];
        double tiempo_inicial;
        double tiempo_final; 
        double tiempo_total;

        for (i = 0; i < n; i++){
          for (j = 0; j < n; j++){
            matrizA[i][j] = 1;
          }
        }

        for (i = 0; i < n; i++){
          for (j = 0; j < n; j++){
            matrizB[i][j] = 2;
          }
        }

        for (i = 0; i < n; i++){
          for (j = 0; j < n; j++){
            matrizC[i][j] = 0;
          }
        } 
          tiempo_total = 0.0;
          tiempo_inicial = System.currentTimeMillis();
          for (i = 0; i < n; i++){
            for (j = 0; j < n; j++){
              for (k = 0; k < n; k++){
                matrizC[i][j] += matrizA[i][k]*matrizB[k][j];
              }
            }
          }
          tiempo_final = System.currentTimeMillis();
          tiempo_total = tiempo_final - tiempo_inicial;
          System.out.println("el tiempo de ejecución fue: "+ tiempo_total/1000);

        for (i = 0; i < matrizC.length; i++){
          for (j = 0; j < matrizC[i].length; j++){
            System.out.println(matrizC[i][j] + " " ); 
          }
         System.out.println();
        }

        System.out.print(n);
      }

    
    
}
