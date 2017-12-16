/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.java.core.controlStatement.forloop;

/**
 *
 * @author Nuwan Danushka
 */
public class ForLoop {
    
    public static void main(String[] args) {
        javaLabeledForLoop();
        javaInfinitiveForLoop();
    }

    /* labes are used to identify the for loop*/
    private static void javaLabeledForLoop() {
        a:
        for(int i=0; i<=10; i++){
            if(i==5){
                b:
                for(int j=0; j<=5; j++){
                    if(j==4){
                        break a;
                    }
                }
            }
        }
    }
    
    /* For loop will be continue again and agin until we stop*/
    private static void javaInfinitiveForLoop() {
        for(;;){
            System.out.println("Hi i am Nuwan");
        }
    }
    
}
