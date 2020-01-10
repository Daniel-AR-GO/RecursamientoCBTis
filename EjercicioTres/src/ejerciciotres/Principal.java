/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciotres;

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
        Scanner  obj= new Scanner(System.in);
        for(int i=0; i<=10;i++){
            int n= obj.nextInt();
            if(n%2==0){
                System.out.println(n + " Es par");
            }else{
                System.out.println(n+" Es Impar");
            }
        }
    }
    
}
