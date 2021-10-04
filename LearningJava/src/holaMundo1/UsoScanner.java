package holaMundo1;

import java.util.Scanner;

public class UsoScanner {
    
    public static void main(String [] args) {
        
        Scanner s = new Scanner(System.in);
        
        System.out.println("Escribe el nombre del libro: ");
        var titulo = s.nextLine();
        
        System.out.println("Escribe el nombre del autor: ");
        var autor = s.nextLine();
        
        System.out.println("Titulo es: "+titulo);
        System.out.println("Autor es: "+autor);

    }
    
}

