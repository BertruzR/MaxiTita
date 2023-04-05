package BACKEND1.G02;

import java.util.Scanner;

/*5. Escribir un programa que lea un número entero por teclado y muestre
por pantalla el doble, el triple y la raíz cuadrada de ese número.
Nota: investigar la función Math.sqrt().
 *
 * @author riosb
 */
public class G02EJ5_ImprimirDobleTripleRaizCuadrada {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresá un número para calcular su doble, triple y raiz cuadrada");
        int num = leer.nextInt();

        int doble = num * 2;
        int triple = num * 3;
        double cuadrado = Math.sqrt(num);

        System.out.println("El doble del número es " + doble);
        System.out.println("El triple del número es " + triple);
        System.out.println("El cuadrado del número es " + cuadrado);
        
    }
}
