package BACKEND1.G02;

import java.util.Scanner;

/*3. Escribir un programa que pida una frase y la muestre toda en mayúsculas
y después toda en minúsculas.
Nota: investigar la función toUpperCase() y toLowerCase() en Java.
 *
 * @author riosb
 */
public class G02EJ3_MayusMinusculas {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa una frase");
        String frase = leer.nextLine();

        frase = frase.toLowerCase();
        System.out.println(frase);
        frase = frase.toUpperCase();
        System.out.println(frase);

    }
}
