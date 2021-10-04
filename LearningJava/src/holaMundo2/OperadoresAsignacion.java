package holaMundo2;

public class OperadoresAsignacion {

    public static void main(String[] args) {

        int a = 10, b = 20, c=10;

        int resultado = a + b - 3;
        System.out.println("resultado = " + resultado);

        //Operador de asignacion: Composicion
        //Composicion suma
        c += 1;
        System.out.println("C mas 1= "+c);
        c= 10;
        //Composicion multiplicacion
        c*=10;
        System.out.println("C multiplicado por 10= "+c);
        c=10;
        //Composicion division
        c/=10;
        System.out.println("C dividido en 10= "+c);
        c=10;
        //Composicion modulo
        c%=9;
        System.out.println("c modulo 10= " + c);
        c=10;

        //Pequenio ejemplo del uso de composicion
        for (int i = 0; b >= a; i++) {
            a += 1;
        }
        System.out.println("El valor es: " + a);

    }
}
