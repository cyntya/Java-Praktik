/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ratarata;

/**
 *
 * @author windows10
 */
public class NilaiTertinggi {
    public static void main(String[] args) {
        int num1 = 10, num2 = 23, num3 = 5;
        int maks;
        System.out.println("number 1 = " + num1);
        System.out.println("number 2 = " + num2);
        System.out.println("number 3 = " + num3);
        maks = (num2 >= num1)? num2 : num1;
        maks = (num3 >= maks)? num3 : maks;
        System.out.println("Nilai tertingginya adalah angka = " + maks);
    }
}
    
