package BACKEND1.G02;

import java.util.Scanner;

/*4. Dada una cantidad de grados centígrados se debe mostrar su
equivalente en grados Fahrenheit. La fórmula correspondiente es: F = 32
+ (9 * C / 5).
 *
 * @author riosb
 */
public class G02EJ4_GradosCF {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa los grados C° que desea convertir a F°");
        int gradosC = leer.nextInt();

        int gradosF = 32 + (9 * gradosC / 5);

        System.out.println("Los grados convertidos a Fahrenheit son " + gradosF);

    }
}
