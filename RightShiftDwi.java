/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.rightshiftdwi;

import java.util.Scanner;

public class RightShiftDwi {

    public static void main(String[] args) {
        int Nilai3, Nilai4, hasil3;
        Scanner keyboard=new Scanner (System.in);
        System.out.print("Input angka-1: ");
        Nilai3 = keyboard.nextInt();
        System.out.print("Input angka-2: ");
        Nilai4 = keyboard.nextInt();
        // Bitwise Negasi (~)
        hasil3 = Nilai4 >> Nilai3; 
        System.out.println("Bitwise Left Shift");
        System.out.println("Hasil Left Shift " + hasil3);
    }
}
