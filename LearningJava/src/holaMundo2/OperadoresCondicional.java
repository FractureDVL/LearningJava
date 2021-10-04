package holaMundo2;

public class OperadoresCondicional {

    public static void main(String[] args) {

        var a = 5;
        var valorMax = 0;
        var valorMin = 10;

        //Condicional &&
        var enRango = a > 0 && a < 10;

        //Condicional para saber si la variable a esta dentro del rango estimado
        //Aplicando condicional and
        System.out.println("--------------------------------------------");
        if (enRango) {

            System.out.println("La variable esta entre 1-9");

        } else {

            System.out.println("La variable no esta entre 1-9s");

        }

        //Condicional ||
        var esVacaciones = false;
        var esDiaDescanso = true;

        //Condicional para saber si un padre puede asistir al juego de su hijo
        //Aplicando condicional or 
        
        System.out.println("--------------------------------------------");

        if (esVacaciones || esDiaDescanso) {

            System.out.println("Puede asistir al juego de su hijo");
        
        } else {
        
            System.out.println("No puede asistir a el juego de su hijo");
        
        }

    }

}
