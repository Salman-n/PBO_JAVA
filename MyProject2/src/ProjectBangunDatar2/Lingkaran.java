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
public class Lingkaran {
    void lingkaran(int r) {
        double luas = 0;
        double keliling = 0;
        keliling = 3.14 * 2 * r;
        luas = 3.14 * r * r ;
        System.out.println("Luas: " + luas + " | Keliling :" + keliling); 
    }
    void lingkaran(double r) {
        double luas = 0;
        double keliling = 0;
        keliling = 3.14 * 2 * r;
        luas = 3.14 * r * r ;
        System.out.println("Luas: " + luas + " | Keliling :" + keliling); 
    }
}
