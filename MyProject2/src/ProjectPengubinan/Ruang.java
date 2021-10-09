/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProjectPengubinan;

/**
 *
 * @author Salman
 */
public class Ruang {
    int panjang;
    int lebar;
    
    int hitungLuas(){
        
        PersegiPanjang p = new PersegiPanjang();

        return PersegiPanjang.perkalian(this.panjang,this.lebar);
    }
}
