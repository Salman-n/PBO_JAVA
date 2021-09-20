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
public class Kerucut {
    int R,T,S;
    double phi = 3.14;
        public void hitungVol(){
        double hasilnya =  phi * R * R * T /3;
        System.out.println("Volumenya adalah \t: " + hasilnya);
        }
        public void hitungLuasSelimut(){
        S = (int) Math.sqrt((R * R) + (T * T));
        double hasilnya = phi * R * S;
         System.out.println("Luas Selimutnya adalah \t: " + hasilnya);
        }
}
