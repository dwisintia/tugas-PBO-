/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.operatorpenugasandwi;

/**
 *
 * @author LENOVO
 */
public class OperatorPenugasanDwi {

    public static void main(String[] args){
        int a;
        int b;

        // PENGISIAN NILAI
        a = 3;
        b = 12;

        // PENAMBAHAN
        b += a;
        // MAKA b = 15
        System.out.println("Penambahan : " + b);

        // PENGURANGAN
        b -= a;
        // MAKA b = 12 (karena 15-3)
        System.out.println("Pengurangan : " + b);

        // PERKALIAN
        b *= a;
        // MAKA b = 36 (karena 12*3)
        System.out.println("Perkalian : " + b);

        // PEMBAGIAN
        b /= a;
        // MAKA b=12
        System.out.println("Pembagian : " + b);

        // SISA BAGI
        b %= a;
        // sekarang b=0
        System.out.println("Sisa Bagi: " + b);
    }
}
