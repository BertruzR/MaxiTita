package BACKEND1.G03;

import java.util.Scanner;

/*Implementar un programa que le pida dos números enteros al usuario y
determine si ambos o alguno de ellos es mayor a 25.
 *
 * @author riosb
 */
public class G03EJ6_NumeroMayor {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese un número");
        int num = leer.nextInt();
        System.out.println("Ingrese otro número");
        int num1 = leer.nextInt();

        if (num > 25 && num1 > 25) {
            System.out.println("Ambos números son mayores que 25");
        } else if (num > 25) {
            System.out.println("El 1º número ingresado es mayor que 25");
        } else if (num1 > 25) {
            System.out.println("El 2º número ingresado es mayor que 25");
        } else {
            System.out.println("Ninguno de los números ingresadoses mayor a 25");
        }
    }
}
