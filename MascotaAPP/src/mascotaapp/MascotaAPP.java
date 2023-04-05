package mascotaapp;

import java.util.Scanner;
import mascotaapp.entidades.Mascota;

/**
 *
 * @author riosb
 */
public class MascotaAPP {

    /*  // public static void main(String[] args) {
        
     //   Perro p1 = new Perro(); // se importa Perro de la clase
     //   Perro p2 = new Perro(); // se pueden crear los Perros que se quiera
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

//crear objeto con new
        Mascota m1 = new Mascota(nombre, Apodo, tipo);

        m1.apodo = "Chiquito";
        m1.nombre = "Fernando Chiquito";// o leer.next()para digitar el nombre
        m1.tipo = "Perro";
        m1.edad = 14;
        m1.raza = "Beagle";
        m1.cola = true;
        m1.color = "tricolor";

        System.out.println(m1.apodo + " " + m1.edad + " " + m1.tipo + " ");

    }

}
