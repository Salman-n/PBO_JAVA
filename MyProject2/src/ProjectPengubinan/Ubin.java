/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProjectPengubinan;

/**
 *
 * @author asus
 */
public class Ubin {
    int panjang;
    int lebar;
    
    int hitungLuas(){
    PersegiPanjang p = new PersegiPanjang();
    return p.hitungLuas(panjang, lebar);
    }
}
