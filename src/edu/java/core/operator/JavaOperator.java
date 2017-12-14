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
        shiftOperators();
        logicalAndBitwiseOperator();
    }

    private static void printHeading(String header) {
        System.out.println("<<<<<<<<<<" + header + ">>>>>>>>>");
    }

    private static void getUnaryPrefixAndPostfixOperators() {

        printHeading("Unary Prifix and Postfix");

        int x = 5;

        System.out.println("++x : " + ++x); // first x increment by 1 and print
        System.out.println("--x : " + --x); // first x decrement by 1 and print
        System.out.println("x++ : " + x++); // print x print and increment by 1
        System.out.println("x-- : " + x--); // print x print and decrement by 1
    }

    private static void arithmeticOperators() {
        printHeading("Arithmetic Operatos");
        int a = 10;
        int b = 5;

        System.out.println(a % b);//0  
    }

    private static void shiftOperators() {
        printHeading("Shift Operators");
        System.out.println(10 << 2);//10*2^2=10*4=40  

        System.out.println(10 >> 2);//10/2^2=10/4=2  

        //For positive number, >> and >>> works same  
        System.out.println(20 >>> 3);
        //For negative number, >>> changes parity bit (MSB) to 0  
        System.out.println(-20 >>> 2);
    }

    private static void logicalAndBitwiseOperator() {
        printHeading("Logical And Bitwise Operator");
        int a = 10;
        int b = 5;
        int c = 20;
        System.out.println(a < b && a < c);//false && true = false  // this is logical operator //doesnot check second cond. if first cond. fail
        System.out.println(a < b & a < c);//false & true = false  // bit wise operator // but this operator check fisrt and second if either first or second fail

        System.out.println(a > b || a < c);//true || true = true  //this is logical
        System.out.println(a < b | a < c);//true | true = true  //bit wise operator
    }

}
