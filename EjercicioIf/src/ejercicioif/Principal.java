package ejercicioif;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int n,d;
        System.out.println("Introduzca dos enteros:");
        n= entrada.nextInt();
        d= entrada.nextInt();
        if(n%d==0)
            System.out.println(n +  " es divisible por  " + d);
    }
    
}
