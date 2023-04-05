package BACKEND1.G02;

import java.util.Scanner;

/*2. Escribir un programa que pida tu nombre, lo guarde en una variable y lo
muestre por pantalla.
 *
 * @author riosb
 */
public class G02EJ2_LeerImprimir {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa tu nombre: ");

        String nombre = leer.next();

        System.out.println("Hola " + nombre);
    }
}
