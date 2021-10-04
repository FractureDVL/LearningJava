
package holaMundo1;

public class ConcatenacionJava{
    public static void main(String[] args) {
        
        var usuario= "FractureDVL";
        var titulo= "Enginer";
        
        var union = titulo+" "+ usuario;
        
        System.out.println("Union :"+ union);
        
        var i = 3;
        var j = 4;
        //contexto cadena en Java ---->
        System.out.println( i + j );
        System.out.println(i + j +" "+ union);
        System.out.println(union +" "+ ( i + j ));
        
        
    }
}
