package holaMundo1;

import java.util.Scanner;

public class DatosPrimitivosBoolean {

    public static void main(String[] args) {

        boolean miVariableBoolean = false;

        System.out.println("miVariableBoolean = " + miVariableBoolean);

        if (miVariableBoolean) {
            System.out.println("La bandera es verdadera");
        } else {
            System.out.println("La bandera es falsa");
        }

        //Algoritmo para saber si una persona es mayor de edad
        System.out.println("Ingrese la edad a comprobar: ");

        Scanner s = new Scanner(System.in);
        
        int edad = s.nextInt();
        boolean esMayor = edad>=18;

        if (esMayor) {
            System.out.println("Esta persona es mayor de edad");
        } else {

            System.out.println("Esta persona es menor de edad");
        }

    }
}
