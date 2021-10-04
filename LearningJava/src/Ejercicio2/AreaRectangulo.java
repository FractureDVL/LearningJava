package Ejercicio2;

import java.util.Scanner;

public class AreaRectangulo {

    public static void main(String[] args) {

        int alto;
        int ancho;

        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese el alto:");
        alto = Integer.parseInt(s.nextLine());

        System.out.println("Ingrese el ancho:");
        ancho = Integer.parseInt(s.nextLine());

        int area = alto * ancho;
        int perimetro = (alto + ancho) / 2;
        
        System.out.println("El area es = "+area);
        System.out.println("El perimetro es = "+perimetro);
    }
}
