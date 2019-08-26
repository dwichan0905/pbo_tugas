/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dwichan;

import java.util.Scanner;

/**
 *
 * @author Dwi Candra Permana
 */
public class FunWithArray {
    private void urutkan(int larik[]) {
        for (int i = 0; i < larik.length; i++) {
            for (int j = 1; j <= (larik.length - 1); j++) {
                if (larik[j - 1] > larik[j]) {
                    tukar(larik, j - 1, j);
                }
            }
        }
    }
    
    private void tukar(int[] larik, int kiri, int kanan) {
        int tamp;
        tamp = larik[kiri];
        larik[kiri] = larik[kanan];
        larik[kanan] = tamp;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // Deklarasi Variabel dan Inisialisasi Objek
        Scanner sc = new Scanner(System.in);
        FunWithArray fwa = new FunWithArray();
        int x[] = new int[10];
        int jumlah = 0;
        double rerata;
        
        // Input Elemen Array
        System.out.println("Masukkan elemen array");
        System.out.println("====================");
        for (int i = 0; i < x.length; i++) {
            System.out.print("Elemen ke-" + (i + 1) + ": ");
            x[i] = sc.nextInt();
        }
        System.out.println("");
        
        // Menampilkan semua elemen array
        System.out.println("Isi Elemen Array");
        System.out.println("====================");
        for (int i = 0; i < x.length; i++) {
            if (i != (x.length - 1))
                System.out.print(x[i] + ", ");
            else
                System.out.println(x[i] + ".");
        }
        System.out.println("");
        
        // Menjumlahkan seluruh selemen array
        for (int i = 0; i < x.length; i++) {
            jumlah += x[i];
        }
        System.out.println("Hasil deret elemen tersebut: " + jumlah);
        
        // Menghitung rerata array
        rerata = (double) jumlah / x.length;
        System.out.println("Jumlah rerata elemen tersebut: " + rerata);
        
        // Mengurutkan dan menentukan elemen terbesar dan terkecil!
        for (int i = 0; i < x.length; i++) {
            fwa.urutkan(x);
        }
        System.out.println("Elemen terkecil: " + x[0]);
        System.out.println("Elemen terbesar: " + x[x.length - 1]);
    }
    
}
