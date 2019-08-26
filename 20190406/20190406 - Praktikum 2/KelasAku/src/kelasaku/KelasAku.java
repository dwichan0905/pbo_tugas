/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kelasaku;

import java.util.Scanner;

/**
 *
 * @author Dwi Candra Permana
 * 18.11.0004
 * TI 2018 A
 * 
 */
public class KelasAku {
    
    private int tambahkeun(int a, int b){
        return a + b;
    }
    
    private int kurangan(int a, int b) {
        return a - b;
    }
    
    private int kalikeun(int a, int b) {
        return a * b;
    }
    
    private double bagikeun(double a, double b) {
        return a / b;
    }
    
    private double pangkatkeun(double a, double pangkat) {
        return Math.pow(a, pangkat);
    }
    
    private double akaran(double a) {
        return Math.sqrt(a);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // inisialisasi object ke dalam class
        KelasAku obj = new KelasAku();
        Scanner sc = new Scanner(System.in);
        System.out.println("Selamat datang!");
        
        // Minta identitas terlebih dahulu
        System.out.print("Masukkan NIM Anda: ");
        String nim = sc.nextLine();
        
        System.out.print("Masukkan Nama Anda: ");
        String nama = sc.nextLine();
        
        System.out.print("Masukkan Kelas Anda: ");
        String kelas = sc.nextLine();
        
        System.out.println("Oke, mari kita mulai sekarang :)\n");
        
        // Let's begin to using mathematic functions!
        double a, b;
        
        System.out.print("Masukkan Nilai Pertama: ");
        a = sc.nextDouble();
        System.out.print("Masukkan Nilai Kedua: ");
        b = sc.nextDouble();
        
        System.out.println();
        
        int tambah, kurang, kali;
        double bagi, pangkat, akar;
        
        tambah = obj.tambahkeun((int) a, (int) b);
        kurang = obj.kurangan((int) a, (int) b);
        kali = obj.kalikeun((int) a, (int) b);
        bagi = obj.bagikeun(a, b);
        pangkat = obj.pangkatkeun(a, b);
        akar = obj.akaran(a);
        
        // Outputs
        System.out.println("Halo " + nama + " (NIM " + nim + ") dari kelas " + kelas.toUpperCase() + "!");
        System.out.println("Hasil " + a + " + " + b + " = " + tambah);
        System.out.println("Hasil " + a + " - " + b + " = " + kurang);
        System.out.println("Hasil " + a + " x " + b + " = " + kali);
        System.out.println("Hasil " + a + " : " + b + " = " + bagi);
        System.out.println("Hasil " + a + "^" + b + " = " + pangkat);
        System.out.println("Hasil akar^2 dari " + a + " = " + akar);
    }
    
}
