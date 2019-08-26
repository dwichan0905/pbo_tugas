/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dwichan.Bersepeda;

/**
 *
 * @author Dwi Candra Permana
 * 18.11.0004
 * TI 2018 A
 * 
 */
public class Sepeda {
    
    protected String jenis;
    protected String deskripsi;
    protected int harga;
    
    public String showDeskripsi() {
        return deskripsi;
    }
    
    public String showJenis() {
        return jenis;
    }
    
    public int showHarga() {
        return harga;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Balap spd1 = new Balap();
        Gunung spd2 = new Gunung();
        BMX spd3 = new BMX();
        
        System.out.println("Mari mengenal Jenis Sepeda!");
        System.out.println("------------------------------");
        System.out.println("1. " + spd1.showJenis());
        System.out.println(spd1.showDeskripsi());
        System.out.println("Harga: Rp" + spd1.showHarga());
        System.out.println();
        System.out.println("2. " + spd2.showJenis());
        System.out.println(spd2.showDeskripsi());
        System.out.println("Harga: Rp" + spd2.showHarga());
        System.out.println();
        System.out.println("3. " + spd3.showJenis());
        System.out.println(spd3.showDeskripsi());
        System.out.println("Harga: Rp" + spd3.showHarga());
        System.out.println();
        System.out.println("Sumber: Wikipedia, harga asal ketik :v");
    }
}
