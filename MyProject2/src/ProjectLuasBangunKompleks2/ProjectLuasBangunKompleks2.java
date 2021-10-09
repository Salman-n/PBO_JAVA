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
public class ProjectLuasBangunKompleks2 {
   public static void main(String[] args) {
   
   int diameter = 28;
   int diameter2 = 14;
   Lingkaran BLing = new Lingkaran();
   double Lingbesar = BLing.hitungLuas(diameter)*0.5;
   double Lingkecil = BLing.hitungLuas(diameter2)*2*0.5;
   
   double LuasTotal = Lingbesar - Lingkecil;
   System.out.println("Luas Total :" + LuasTotal + " cm");
   
}
}
