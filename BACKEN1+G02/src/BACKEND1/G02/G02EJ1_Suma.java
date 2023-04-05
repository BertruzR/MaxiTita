package BACKEND1.G02;

import java.util.Scanner;

/*1. Escribir un programa que pida dos números enteros por teclado y calcule
la suma de los dos. El programa deberá después mostrar el resultado de
la suma*
 *
 * @author riosb
 */
public class G02EJ1_Suma {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa dos números enteros");
        int numero1 = leer.nextInt();
        int numero2 = leer.nextInt();
        int suma = numero1 + numero2;

        System.out.println("La suma es igual a: " + suma);
        System.out.printf("\n%d + %d = %d\n", numero1, numero2, numero1 + numero2);
    
    }
}
