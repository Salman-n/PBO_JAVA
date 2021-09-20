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
public class BangunRuangMain {
    public static void main(String[] args) {
    //Bola
    System.out.println("---Hasil---");
    Bola B = new Bola();
    B.R = 8;
    B.hitungVol();
    B.hitungLuasSelimut();
    System.out.println("");
    //Tabung
    Tabung TB = new Tabung();
    TB.R = 20;
    TB.T = 25;
    TB.hitungVol();
    TB.hitungLuasSelimut();
    System.out.println("");
    //Kerucut
    Kerucut KRCT = new Kerucut();
    KRCT.R = 10;
    KRCT.T = 7;
    KRCT.hitungVol();
    KRCT.hitungLuasSelimut();
    System.out.println("");
    }
    
    
}
