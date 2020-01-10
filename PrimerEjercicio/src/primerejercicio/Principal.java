/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primerejercicio;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
       int n1, n2;
       n1 = entrada.nextInt();
       n2 = entrada.nextInt();
       if(n1%n2==0)
            System.out.println("Son divisibles");
       
    }
    
}
