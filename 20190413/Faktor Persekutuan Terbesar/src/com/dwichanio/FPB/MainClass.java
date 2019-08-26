/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dwichanio.FPB;

import java.util.Scanner;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

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
        int a, b, c, p, q;
        try {
            // Coba mode GUI
            String aa, bb;
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel"); // Gunakan Look and Feel milik Windows
            
            // Tampilkan pesan dialog dan input dialog
            JOptionPane.showMessageDialog(null, "Selamat datang di Kalkulator FPB!\n\nCreated by Dwi Candra Permana, 2019", "Welcome, dear <3", JOptionPane.INFORMATION_MESSAGE);
            aa = JOptionPane.showInputDialog(null, "Silakan masukkan nilai pertama:");
            bb = JOptionPane.showInputDialog(null, "Silakan masukkan nilai kedua:");
            
            // Verifikasi apabila input telah dimasukkan
            if (!aa.equals("") || !bb.equals("")) {
                // Ubah tipe data STRING ke INTEGER
                a = Integer.parseInt(aa);
                b = Integer.parseInt(bb);
                
                p = a;
                q = b;

                c = a % b;

                while (c != 0) {
                    a = b;
                    b = c;
                    c = a % b;
                }

                JOptionPane.showMessageDialog(null, "FPB dari bilangan " + p + " dan " + q + " adalah " + b);
            } else {
                System.out.println("Keluar...");
            }
            System.out.println("Terimakasih telah menggunakan program ini.\nSedang menutup program...");
        } catch (Exception ex) {
            // Mode Command Line Interface (CLI)
            System.err.println("ERROR: Tidak dapat menerapkan Look and Feel. Masuk ke mode CLI...\n");
            
            Scanner sc = new Scanner(System.in);
            System.out.println("Selamat datang di Kalkulator FPB!");
            System.out.print("Silakan masukkan nilai pertama: ");
            a = sc.nextInt();
            System.out.print("Silakan masukkan nilai kedua: ");
            b = sc.nextInt();
            p = a;
            q = b;
            
            c = a % b;

            while (c != 0) {
                a = b;
                b = c;
                c = a % b;
            }
            
            System.out.println("\nFPB dari " + p + " dan " + q + " adalah " + b);
        }
    }
    
}
