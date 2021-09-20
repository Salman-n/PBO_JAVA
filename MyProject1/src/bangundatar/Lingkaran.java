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
public class Lingkaran {
    int R;
    double phi = 3.14;
        public void hitungLuas(){
            double hasilnya = phi * R * R;
            System.out.println("Luasnya adalah     : " + hasilnya);
        }
        public void hitungKeliling(){
            double hasilnya = 2 * phi * R;
            System.out.println("Kelilingnya adalah : " + hasilnya);
        }
}
