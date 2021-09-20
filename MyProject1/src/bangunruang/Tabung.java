/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bangunruang;

/**
 *
 * @author Salman W
 */
public class Tabung {
   int R, T;
   double phi = 3.14;
        public void hitungVol(){
        double hasilnya = phi * R * R * T;
        System.out.println("Volumenya adalah       : " + hasilnya);
        }
        public void hitungLuasSelimut(){
        double hasilnya = 2 * phi * R * T;
        System.out.println("Luas Selimutnya adalah : " + hasilnya);
        }
        
}
