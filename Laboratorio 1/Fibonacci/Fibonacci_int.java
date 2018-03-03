/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package fibonacci;

/**
 *
 * @author Pedro Valderrama
 */
public class Fibonacci_int {
    public static void main(String[] args) {
        // TODO code application logic here
        int auxiliar;
        int primero = 0;
        int segundo = 1;
        int n = 2;
        System.out.printf("0 %s\n",primero);
        System.out.printf("1 %s\n",segundo);
   
        while(segundo > 0){
          auxiliar = segundo;
          segundo += primero;
          primero = auxiliar;
          System.out.printf("%s %s\n",n, segundo);
          n += 1;
    }
    System.out.printf("Para una variable de tipo Int se produce un overflow para n = %s\n", n-1);;
    
    }
    
}
