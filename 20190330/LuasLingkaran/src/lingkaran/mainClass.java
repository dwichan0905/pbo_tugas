/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lingkaran;

/**
 *
 * @author Dwi Candra Permana
 * 18.11.0004
 * TI 2018 A
 * 
 */
public class mainClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double r = 12; // Jari-jari
        
        double luas = Math.PI * Math.pow(r, 2);
        double keliling = 2 * Math.PI * r;
        
        // ceil: bulatkan ke angka terdekat
        System.out.println("Jari-jari Lingkaran: " + r + "cm");
        System.out.println("Luas Lingkaran: " + Math.ceil(luas) + "cm");
        System.out.println("Keliling Lingkaran: " + Math.ceil(keliling) + "cm");
    }
    
}
