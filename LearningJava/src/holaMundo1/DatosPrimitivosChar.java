/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holaMundo1;

/**
 *
 * @author joseb
 */
public class DatosPrimitivosChar {

    public static void main(String[] args) {

        //Declaracion con el caracter
        char miCaracter = 'a';
        System.out.println("miCaracter = " + miCaracter);

        //Declaracion con unicode
        char variableChar = '\u1F64';
        System.out.println("variableChar = " + variableChar);
        
        //declaracion con numero Decimal
        char variableCharDecimal = 34;
        System.out.println("variableCharDecimal = " + variableCharDecimal);

        //Declaracion con el caracter
        char variableCharSimbolo = '*';
        System.out.println("variableCharSimbolo = " + variableCharSimbolo);

        //Declaracion por unicode con inferencia
        var variableCharVar = '\u1F12';
        System.out.println("variableCharVar = " + variableCharVar);
        
        //Los caracteres se pueden guardar en un int pero retornaran su decimal
        int variableIntChar = '?';
        System.out.println("variableIntChar = " + variableIntChar);
    }
}

