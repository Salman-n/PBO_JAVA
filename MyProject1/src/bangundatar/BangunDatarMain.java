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
public class BangunDatarMain {
    public static void main(String[] args) {
        System.out.println("--- Hasil ---");
        //Persegi_panjang
        PersegiPanjang PP = new PersegiPanjang();
        PP.P = 25;
        PP.L = 38;
        PP.hitungLuas();
        PP.hitungKeliling();
        System.out.println("");
        //Persegi A
        Persegi PA = new Persegi();
        PA.S = 10;
        PA.hitungLuas();
        PA.hitungKeliling();
        System.out.println("");
        //Persegi B
        Persegi PB = new Persegi();
        PB.S = 5;
        PB.hitungLuas();
        PB.hitungKeliling();
        System.out.println("");
        //Lingkaran A
        Lingkaran LA = new Lingkaran();
        LA.R = 25;
        LA.hitungLuas();
        LA.hitungKeliling();
        System.out.println("");
         //Lingkaran B
        Lingkaran LB = new Lingkaran();
        LB.R = 37;
        LB.hitungLuas();
        LB.hitungKeliling();
        System.out.println("");
        
    }
}