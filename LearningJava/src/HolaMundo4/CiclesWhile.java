package HolaMundo4;

public class CiclesWhile {

    public static void main(String[] args) {

        var numero = 10;
        //Ciclo while
        while (numero < 20) {

            numero++;
            System.out.println("Numero = " + numero);
        }
        System.out.println("----------------------------------");

        var numero2 = 0;

        do {
        
            System.out.println("numero"+numero2);
            numero2++;
        } 
        while (numero2 <= 10);
    }

}
