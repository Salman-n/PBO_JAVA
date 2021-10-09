/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProjectLuasBangunKompleks;

/**
 *
 * @author Salman
 */
public class ProjectLuasBangunKompleks {
    public static void main(String[] args) {
    int diameter = 42;
    int Sisi = 42;
    //BPer (BentukPersegi)
    Persegi BPer;
        BPer = new Persegi();
    //BLing (BentukLingkaran)
    Lingkaran BLing;
        BLing = new Lingkaran();
    double luas = BPer.hitungLuas(Sisi) + (BLing.hitungLuas(diameter)*4*1/2);
    System.out.println("Maka Jumlah Total Luasnya : " + luas + " cm");
    
          
}
}