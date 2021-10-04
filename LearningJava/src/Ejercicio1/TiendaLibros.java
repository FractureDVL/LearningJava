package Ejercicio1;

import java.util.Scanner;

public class TiendaLibros {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Proporciona el nombre:");
        String nombre = s.nextLine();
        System.out.println("Proporciona el id:");
        int id = Integer.parseInt(s.nextLine());
        System.out.println("Proporciona el precio:");
        double precio = Double.parseDouble(s.nextLine());
        System.out.println("Proporciona el envio gratuito:");
        boolean envioGratuito = s.nextBoolean();
        System.out.println("----------------------------------");

        System.out.println("Los datos se han registrado correctamente: "+"\n" + nombre + " #" + id);
        System.out.println("Precio:" + " $" + precio);
        System.out.println("Envio gratuito: " + envioGratuito);
    }
}
