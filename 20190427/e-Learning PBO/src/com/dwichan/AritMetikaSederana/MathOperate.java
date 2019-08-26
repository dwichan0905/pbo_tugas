/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dwichan.AritMetikaSederana;

/**
 *
 * @author Dwi Candra Permana
 */
public class MathOperate {
    
   public double showTambah(Object firstValue, Object secondValue) {
       return (double) firstValue + (double) secondValue;
   }
   
   public double showKurang(Object firstValue, Object secondValue) {
       return (double) firstValue - (double) secondValue;
   }
   
   public double showKali(Object firstValue, Object secondValue) {
       return (double) firstValue * (double) secondValue;
   }
   
   public double showBagi(Object firstValue, Object secondValue) {
       return (double) firstValue / (double) secondValue;
   }
   
   public double showMod(Object firstValue, Object secondValue) {
       return (double) firstValue % (double) secondValue;
   }
    
}
