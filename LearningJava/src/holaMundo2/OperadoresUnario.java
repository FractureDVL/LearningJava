/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holaMundo2;

/**
 *
 * @author joseb
 */
public class OperadoresUnario {
 
    public static void main(String[] args) {
        
        int a= 10;
        int b= -a;
        
        System.out.println("a = "+a);
        System.out.println("b = "+b);
        
        boolean c = true;
        boolean d = !c;
        
        System.out.println("c = "+c);
        System.out.println("d = "+d);
        
        //incremento
        //1. preincremento simbolo antes de la variable
        
        var e =3;
        var f = ++e; //incrementa luego usa su valor
        
        System.out.println("e = "+e);
        System.out.println("f = "+f);
        
        //1. postIncremento simbolo despues de la variable
        var g = 5;
        var h = g++; //primero se utiliza la variable y se incrementa
        
        System.out.println("g = " + g);
        System.out.println("h = " + h);
        
        //decremento
        //1. predecremento
        
        var i=10;
        var j= --i;
        System.out.println("i = " + i);
        System.out.println("j = " + j);
        
        //2.postDecremento
        
        var k = 15;
        var l = k--;
        
        System.out.println("k = " + k);
        System.out.println("l = " + l);
    }
}
