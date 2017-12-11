/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.java.core.operator;

/**
 *
 * @author Nuwan Danushka
 */
public class JavaOperator {

    //urnary prefix 
    public static void main(String[] args) {
        getUnaryPrefixAndPostfixOperators();
        arithmeticOperators();
    }

    private static void getUnaryPrefixAndPostfixOperators() {
        int x = 5;

        System.out.println("++x : " + ++x); // first x increment by 1 and print
        System.out.println("--x : " + --x); // first x decrement by 1 and print
        System.out.println("x++ : " + x++); // print x print and increment by 1
        System.out.println("x-- : " + x--); // print x print and decrement by 1
    }

    private static void arithmeticOperators() {
        int a = 10;
        int b = 5;
        
        System.out.println(a%b);//0  
    }
    
    

}
