package ifanidado;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int contador_positivos =0;
        int contador_negativos =0;
        int contador_ceros =0;
        for(int i=0; i<=10; i++){
            int numero = entrada.nextInt();
            if(numero > 0){
                contador_positivos++;
            }
            else if(numero < 0){
                contador_negativos++;
            }else{
                contador_ceros++;
            }
        }
        System.out.println("Numeros Positivos: "+contador_positivos);
        System.out.println("Numeros Negativos: "+contador_negativos);
        System.out.println("Ceros: "+contador_ceros);
    }
    
}
