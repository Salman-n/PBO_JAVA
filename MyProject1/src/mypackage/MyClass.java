/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mypackage;

/**
 *
 * @author Salman W
 */
public class MyClass {
    public static void main(String[] args) {
        //Operasi Bil ke-1 (OP1)
        OperasiBilangan op1 = new OperasiBilangan();
        op1.bilPertama = 100;
        op1.bilKedua = 150;
        op1.hitungPenjumlahan();
        op1.hitungPengurangan();
        op1.hitungPerkalian();
        op1.hitungPembagian();

    }
    

}
