/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProjectAdvancedOperasi;

/**
 *
 * @author Salman
 */
public class ProjectAdvancedOperasi {

    public static void main(String[] args) {

        Operasi m = new Operasi();
        
        System.out.println(m.jumlahkan(3,4));
        System.out.println(m.jumlahkan(4,7,-9));
        System.out.println(m.jumlahkan(3.4,-0.002,1.12313));
        
        System.out.println(m.jumlahkanX(3,4));
        System.out.println(m.jumlahkanX(3,-0.002,1.12313));
        
    }
}