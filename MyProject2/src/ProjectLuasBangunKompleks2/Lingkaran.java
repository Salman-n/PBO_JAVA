/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProjectLuasBangunKompleks2;

/**
 *
 * @author Salman
 */
public class Lingkaran {
    double hitungLuas(int diameter){
        double r = 0.5 * diameter;
        double luas = 0;
        
        if(r % 7 == 0){
            luas = 22 * (r*r/7);
        }else{
            luas = 3.14 * r * r;
        }
        return luas;
        
    }
}
