package pooej01;

import java.util.Scanner;

/**
 *
 * @author riosb
 */
public class POOEj01 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        
        Persona person1 = new Persona();

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
//public String nombre;
//public int id;
//public Date nacimiento;
