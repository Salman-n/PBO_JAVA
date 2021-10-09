/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProjectBangunDatar2;

/**
 *
 * @author Salman
 */
public class ProjectBangunDatar2 {

    public static void main(String[] args) {

        PersegiPanjang m = new PersegiPanjang();
        System.out.println("A. Keliling dan Luas Persegi panjang :");
        m.persegipanjang(10,5);
        m.persegipanjang(3.6,8);
        m.persegipanjang(6,8.3);
        m.persegipanjang(5.6,8.8);

        Persegi m1 = new Persegi();
        System.out.println("B. Keliling dan Luas Persegi :");
        m1.persegi(4.5);
        m1.persegi(7);

        Lingkaran m2 = new Lingkaran();
        System.out.println("C. Keliling dan Luas Lingkaran :");
        m2.lingkaran(5);
        m2.lingkaran(7.4);

        Segitiga m3 = new Segitiga();
        System.out.println("D. Keliling dan Luas Segitiga :");
        m3.segitiga(8,10);
        m3.segitiga(8,11.5);
        m3.segitiga(12.2,9);
        m3.segitiga(13.9,20.7);
       
    
}
    
}