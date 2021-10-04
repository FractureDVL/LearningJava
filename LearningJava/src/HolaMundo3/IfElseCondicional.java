package HolaMundo3;

public class IfElseCondicional {

    public static void main(String[] args) {

        boolean condicion = true;

        if (!condicion) {
            
            System.out.println("Condicion es verdadera.");
            
        } else {
            
            System.out.println("Condicion es falsa.");
            
        }
        
        //Pequeño algoritmo para convertir un numero a texto usando condicional if
        //Rango va ser igual a 0 - 3;
        var numero = 0;
        var mensaje = "Numero desconocido";
        if(numero == 0){
            System.out.println("Numero cero");
        }else if(numero == 1){
       
            System.out.println("Numero uno");
        }
        else if (numero == 2){
        
            System.out.println("Numero dos");
        }else if (numero == 3){
        
            System.out.println("Numero tres");
        } else {
            System.out.println(mensaje);
        }
    }
}
