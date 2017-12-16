/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.java.core.controlStatement.switchStatement;

/**
 *
 * @author Nuwan Danushka
 */
public class CaseStatements {

    public static void main(String[] args) {
        int number = 30;
        /* it executes all statement after first match if break statement is not used with switch cases*/
        switch (number) {

            case (10):
                System.out.println("Success 1");
                break;
            case (20):
                System.out.println("success 2");
                break;
            case (30):
                System.out.println("Success 3");
            case (40):
                System.out.println("Success 4");
            default:
                System.out.println("nothing");
                break;

        }
    }

}
