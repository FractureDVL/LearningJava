package Ejercicio2;

import java.util.Scanner;

public class MayorDosNumeros {

    public static void main(String[] args) {

        int numero1;
        int numero2;

        Scanner s = new Scanner(System.in);

        System.out.println("Ingrese el primer numero:");
        numero1 = Integer.parseInt(s.nextLine());
        System.out.println("Ingrese el segundo numero:");
        numero2 = Integer.parseInt(s.nextLine());

        if ((numero1 != numero2)) {
            if ((numero1 > numero2)) {
                System.out.println(+numero1 + " es mayor que " + numero2);

            } else {
                System.out.println(+numero2 + " es mayor que " + numero1);

            }
        } else {
            System.out.println("Los numeros son iguales");
        }
    }

}
