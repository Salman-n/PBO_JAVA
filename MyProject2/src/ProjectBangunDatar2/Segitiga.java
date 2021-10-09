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
public class Segitiga {
     void segitiga(int a ,int t ) {
        double luas = 0;
        double keliling = 0;
        double s =  Math.sqrt((a * a)+(t * t));
        luas = a * t / 2;
        keliling = a + t + s;
        System.out.println("Luas: " + luas );
        System.out.println("Keliling: " + keliling ); 
    }
  void segitiga(double a ,int t ) {
        double luas = 0;
        double s =  Math.sqrt((a * a)+(t * t));
        double keliling = 0;
        luas = a * t / 2;
        keliling = a + t + s;
        System.out.println("Luas: " + luas  ); 
        System.out.println("Keliling: " + keliling ); 
    }
  void segitiga(int a ,double t ) {
        double luas = 0;
        double s =  Math.sqrt((a * a)+(t * t));
        double keliling = 0;
        luas = a * t / 2;
        keliling = a + t + s;
        System.out.println("Luas: " + luas  ); 
        System.out.println("Keliling: " + keliling ); 
    }
  void segitiga(double a ,double t ) {
        double luas = 0;
        double s =  Math.sqrt((a * a)+(t * t));
        double keliling = 0;
        luas = a * t / 2;
        keliling = a + t + s;
        System.out.println("Luas: " + luas  ); 
        System.out.println("Keliling: " + keliling ); 
    }
}

