/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pbo2.pkg10118063.latihan54;

/**
 *
 * @author 
 * NAMA   : Naufal Asha
 * KELAS  : IF-2
 * NIM    : 10118063
 */
public class Tester {

    /**
     * @param args
     */
      public static void main(String[] args){
          WarnaKoordinat wk = new WarnaKoordinat(10,4, "Jingga");
          
          System.out.println("Warna Koordinat : " +wk.getNamaWarna());
          System.out.println("Koordinat Sumbu x : " +wk.getX()+ ", y : " +wk.getY());
    }
}
