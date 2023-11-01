/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.operatorbitwisedwi;

/**
 *
 * @author LENOVO
 */
public class OperatorBitwiseDwi {

    public static void main(String[] args) {
        int a = 50;    /* 50 = 0011 0010 */
        int b = 10;    /* 10 = 0000 1010 */
        int c = 0;

        c = a & b;       /* 2 = 0000 0010 */
        System.out.println("a & b = " + c);

        c = a | b;       /* 58 = 0011 1010 */
        System.out.println("a | b = " + c);

        c = a ^ b;       /* 56 = 0011 1000 */
        System.out.println("a ^ b = " + c);

        c = ~a;          /*-61 = 1100 0011 */
        System.out.println("~a = " + c);

        c = a << 2;     /* 200 = 1100 1000 */
        System.out.println("a << 2 = " + c);

        c = a >> 2;     /* 12 = 0000 1100 */
        System.out.println("a >> 2  = " + c);

        c = a >>> 2;     /* 12 = 0000 1100 */
        System.out.println("a >>> 2 = " + c);
    }
}
