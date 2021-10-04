package holaMundo2;

public class OperadoresRelacional {

    public static void main(String[] args) {

        var a = 3;
        var b = 10;
        //igual a 
        var c = (a == b);

        System.out.println("c = " + c);

        var d = 5;
        var e = 7;
        //diferente a
        var f = (d != e);
        System.out.println("f = " + f);

        var saludo = "Hola";
        var saludo2 = "Adios";
        var comparacion = saludo == saludo2;

        System.out.println("comparacion = " + comparacion);

        //Forma correcta para comparar dos cadenas 
        var comparacion2 = saludo.equals(saludo2);
        System.out.println("comparacion2 = " + comparacion2);

        var g = 10;
        var h = 30;
        
        //Evaluando si g es mayor o igual que la variable h
        var mayorQue = g >= h;
        System.out.println("mayorQue = " + mayorQue);
        //Evaluando si g es menor o igual que la variable h
        var menorQue = g <= h;
        System.out.println("menorQue = " + menorQue);

        //metodo para comprobar si un numero es par o impar
        
        if (g % 2 == 0) {
            
            System.out.println("es par");
        
        } else {
            
            System.out.println("es impar");
        
        }
        

    }
}
