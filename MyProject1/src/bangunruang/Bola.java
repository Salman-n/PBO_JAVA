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
public class Bola {
   int R;
   double phi = 3.14;
        public void hitungVol(){
        double hasilnya = 4/3 * phi * R * R * R;
        System.out.println("Volumenya adalah       : " + hasilnya);
        }
        public void hitungLuasSelimut(){
        double hasilnya = 4 * phi * R * R;
        System.out.println("Luas Selimutnya adalah : " + hasilnya);
        }
}
