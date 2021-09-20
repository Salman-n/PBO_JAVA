/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bangundatar;

/**
 *
 * @author Salman W
 */
public class PersegiPanjang {
    //atribut panjang dan lebar tipe integer
   int P;
   int L;
     public void hitungLuas(){
         int hasilnya = P * L;
         System.out.println("Luasnya adalah     : " + hasilnya);
     }
     public void hitungKeliling(){
         int hasilnya = 2 + (P * L);
         System.out.println("Kelilingnya adalah : " + hasilnya);
     }
}
