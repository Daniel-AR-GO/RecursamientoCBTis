package recursamiento;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int nota;
        System.out.println("Introduzca nota a analizar:");
        nota = entrada.nextInt();
        if(nota > 5){
            System.out.println("Prueba Superada");
        }
    }
    
}
