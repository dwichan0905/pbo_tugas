/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dwichan.AritMetikaSederana;

/**
 *
 * @author Dwi Candra Permana
 * 18.11.0004
 * TI 2018 A
 * 
 */
public class MainClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Object a = new Object();
        Object b = new Object();
        Object hasil = new Object();
        int i = 0;
        String y;
        MathOperate mo = new MathOperate();
        java.util.Scanner sc = new java.util.Scanner(System.in);
        
        System.out.println("SELAMAT DATANG DI KALKULATOR SEDERHANA!");
        System.out.println("Created by 18.11.0004 (Dwi Candra Permana)");
        System.out.println("=========================================");
        for(int k = 1; k > 0; k++) {
            System.out.print("Masukkan bilangan pertama: ");
            a = sc.nextDouble();
            System.out.print("Masukkan bilangan kedua: ");
            b = sc.nextDouble();
            System.out.println("=========================================");
            System.out.println("MENU:");
            System.out.println("1. Penjumlahan");
            System.out.println("2. Pengurangan");
            System.out.println("3. Perkalian");
            System.out.println("4. Pembagian");
            System.out.println("5. Modulus (Sisa Pembagian)");
            System.out.println("-----------------------------------------");
        
        
            System.out.print("Pilih [1..5]: ");
            i = sc.nextInt();
            
            switch(i) {
                case 1:
                    hasil = mo.showTambah(a, b);
                    System.out.println("Hasil " + a + " + " + b + " = " + hasil);
                    break;
                case 2:
                    hasil = mo.showKurang(a, b);
                    System.out.println("Hasil " + a + " - " + b + " = " + hasil);
                    break;
                case 3:
                    hasil = mo.showKali(a, b);
                    System.out.println("Hasil " + a + " x " + b + " = " + hasil);
                    break;
                case 4:
                    hasil = mo.showBagi(a, b);
                    System.out.println("Hasil " + a + " / " + b + " = " + hasil);
                    break;
                case 5:
                    hasil = mo.showMod(a, b);
                    System.out.println("Hasil " + a + " / " + b + " sisanya " + hasil);
                    break;
                default:
                    System.out.println("Pilihan invalid.");
                    break;
            }
            while(true) {
                System.out.print("Lagi? (Y/n) ");
                y = sc.next();
                if (y.equalsIgnoreCase("n")) {
                    System.exit(0);
                } else if (y.equalsIgnoreCase("y")) {
                    break;
                } else {
                    System.out.println("Pilihan invalid.");
                }
            }
        }
    }
}
