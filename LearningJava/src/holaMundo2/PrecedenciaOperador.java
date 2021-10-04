package holaMundo2;

public class PrecedenciaOperador {

    public static void main(String[] args) {

        var x = 10;
        var y = 10;

        var z = ++x + y--;

        System.out.println("x = " + x);
        System.out.println("y = " + y);

        System.out.println("z = " + z);

        //Evaluacion de operaciones basicas por jerarquia
        var resultado = 4 + 5 * 6 / 3;
        System.out.println("Resultado = " + resultado);

        //Aplicando parentesis para modificar la jerarquia de operadores
        var resultado2 = (5 + 4) * 6 / 3;
        System.out.println("resultado2 = " + resultado2);
    }
}
