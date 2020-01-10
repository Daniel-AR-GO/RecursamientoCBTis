/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int n1, n2;
        n1 = entrada.nextInt();
        n2 = entrada.nextInt();
        if(n1>n2){
            System.out.println("Resultado: "+ (n1 +n2));
        }else{
            System.out.println("Resultado: "+ (n1 *n2));
        }
    }
    
}
