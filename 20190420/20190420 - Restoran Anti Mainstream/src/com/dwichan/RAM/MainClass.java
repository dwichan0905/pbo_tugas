/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dwichan.RAM;

import java.util.Scanner;

/**
 *
 * @author Dwi Candra Permana
 * 18.11.0004
 * TI 2018 A
 * 
 */
public class MainClass {
    
    protected int harga;
    
    public int showHarga() {
        return harga;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Persiapan sebelum program dijalankan
        int i;
        String acc;
        Scanner sc = new Scanner(System.in);
        ChildClass1 ch1 = new ChildClass1();
        ChildClass2 ch2 = new ChildClass2();
        ChildClass3 ch3 = new ChildClass3();
        ChildClass4 ch4 = new ChildClass4();
        ChildClass5 ch5 = new ChildClass5();
        ChildClass6 ch6 = new ChildClass6();
        ch1.initHarga();
        ch2.initHarga();
        ch3.initHarga();
        ch4.initHarga();
        ch5.initHarga();
        ch6.initHarga();
        
        // Mari kita mulai...
        System.out.println("RESTORAN SPESIAL");
        System.out.println("\"ANTI-MAINSTREAM\"");
        
        // Gak akan ada batas buat balik lai ke sini :v
        while (true) {
            System.out.println("====================================");
            System.out.println("Menu:");
            System.out.println("------------------------------------");
            System.out.println("1. Kwetiaw Goreng Cap Gajah (Kwetiaw+Bakso uk. sedang+Sayuran)");
            System.out.println("2. Nasi Goreng Tak Berfaedah (Nasi Goreng+Ayam+Sayur+Mie)");
            System.out.println("3. Indomie Goreng Sehat (Indomie+Sayuran)");
            System.out.println("4. Es Cemburu (Es Lemon)");
            System.out.println("5. Es Jeruk Panas");
            System.out.println("6. Es Sejuta Umat (Es Teh Manis/Tawar)");
            System.out.println(System.lineSeparator());
            System.out.print("Silakan pilih menu yang ingin Anda pesan [1..6]: ");
            i = sc.nextInt();

            switch(i) {
                case 1:
                    System.out.println("Kwetiaw Goreng Cap Gajah (Kwetiaw+Bakso uk. sedang+Sayuran)");
                    System.out.println("Harga: Rp" + ch1.showHarga() + ",-");
                    break;
                case 2:
                    System.out.println("Nasi Goreng Tak Berfaedah (Nasi Goreng+Ayam+Sayur+Mie)");
                    System.out.println("Harga: Rp" + ch2.showHarga() + ",-");
                    break;
                case 3:
                    System.out.println("Indomie Goreng Sehat (Indomie+Sayuran)");
                    System.out.println("Harga: Rp" + ch3.showHarga() + ",-");
                    break;
                case 4:
                    System.out.println("Es Cemburu (Es Lemon)");
                    System.out.println("Harga: Rp" + ch4.showHarga() + ",-");
                    break;
                case 5:
                    System.out.println("Es Jeruk Panas");
                    System.out.println("Harga: Rp" + ch5.showHarga());
                    break;
                case 6:
                    System.out.println("Es Sejuta Umat (Es Teh Manis/Tawar)");
                    System.out.println("Harga: Rp" + ch6.showHarga());
                    break;
                default:
                    System.out.println("Masukan tidak dikenali. Mohon periksa kembali masukan Anda.");
                    break;
            }
            System.out.println("");
            System.out.print("Pesan lagi (Y/N)? ");
            acc = sc.next();

            if (acc.equalsIgnoreCase("n")) {
                break;
            } else {
                for(int clear = 0; clear < 100; clear++) {
                    System.out.println("\b") ;
                }
            }
        }
    }
    
}
