package holaMundo1;

import java.util.Scanner;


public class ConversionDeTipos {

    public static void main(String[] args) {

        //Conversion de String a Integer
        int miEdad = Integer.parseInt("10");

        System.out.println("La suma es: " + (miEdad + 1));

        //Ejemplo 2
        var consola = new Scanner(System.in);
        System.out.println("------------------------------");
        System.out.println("Proporciona una edad: ");
        int edad = Integer.parseInt(consola.nextLine());
        System.out.println("La edad es: " + edad);

        var edadText = String.valueOf(10);

        System.out.println("Edad en texto es: " + "\"" + edadText + "\"");
        System.out.println("-----------------------------");
        System.out.println("Ingrese un saludo:");

        //Obtencion de caracteres de una cadena
        var saludoChar = consola.nextLine().charAt(0);
        System.out.println("El primer caracter de este saludo es: " + saludoChar);

        System.out.println("----------------------------");
        System.out.println("Ingrese un numero:");

        var numeroChar = consola.nextLine().charAt(0);

        System.out.println("El primer caracter de este numero es: " + numeroChar);
        
    }
}
