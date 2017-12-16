/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.java.core.algorithms.fibonacciNumber;

/**
 *
 * @author Nuwan Danushka
 */
public class FibonacciNumbers {

    static int i;
    static int j;
    static int count = 10;
    static int index = 2;
    static int temp;

    /*
     Printing 10 finonacci Numbers from 0
     */
    public static void main(String[] args) {
        recursionWay(index);
        System.out.println("");
        withoutRecursionWay();
    }

    private static void recursionWay(int index) {
        if (index <= count) {
            if (index == 2) {
                initialPrint();
                index++;
            }
            temp = i + j;
            System.out.print(" " + temp);
            i = j;
            j = temp;
            index++;
            recursionWay(index);
        }
    }

    private static void withoutRecursionWay() {
        initialPrint();
        for (index = 3; index <= count; index++) {
            temp = i + j;
            System.out.print(" " + temp);
            i = j;
            j = temp;
        }
    }

    private static void initialPrint() {
        i = 0;
        j = 1;
        System.out.print(i + " " + j);
    }
}
