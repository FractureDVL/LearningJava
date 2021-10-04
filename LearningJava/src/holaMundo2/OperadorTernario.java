package holaMundo2;

public class OperadorTernario {

    public static void main(String[] args) {

        var resultado = (3 < 2) ? "Verdadero" : "Falso";

        System.out.println("Resultado: " + resultado);

        var numero = 8;
        
        //Condicional para saber si un numero es par o impar
        if (numero % 2 == 0) {
        
            System.out.println("El " + numero + " numero es par");
        
        } else {
            
            System.out.println("El " + numero + " numero es impar");
        
        }
        
        //

    }
}
