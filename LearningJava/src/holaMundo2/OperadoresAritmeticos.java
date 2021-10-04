package holaMundo2;

import java.util.Scanner;

public class OperadoresAritmeticos {

    public static void main(String[] args) {

        //Operadores aritmeticos en Java
        int a = 3, b = 4, c = 16;

        //Operacion de suma
        var resultado = a + b;
        System.out.println("resultado suma= " + resultado);

        //Operacion de resta
        resultado = a - b;
        System.out.println("resultado resta = " + resultado);

        //Operacion de multiplicacion
        resultado = a * b;
        System.out.println("resultado multiplicacion = " + resultado);
        
        //Operacion de tipo flotante (Tomar en cuenta el tipo de variable)
        var resultadoFlotante = 3D / b;
        System.out.println("resultado division = " + resultadoFlotante);
        
        //operacion de modulo 16%10 = 6;
        resultado = c%10;
        System.out.println("resultado modulo = " + resultado);
        
        //Pequenio algoritmo para saber si numero es par
        Scanner s= new Scanner(System.in);
        
        System.out.println("------------------------------------------");
        System.out.println("Ingrese un numero para verificar si es par: ");
        int numero = Integer.parseInt(s.nextLine());
        
        if(numero%2 == 0){
            System.out.println("Es par");
        }
        else{
            System.out.println("Es impar");
        }

    }
}
