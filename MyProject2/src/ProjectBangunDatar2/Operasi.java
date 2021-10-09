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
public class Operasi {
    void persegipanjang(int a ,int b ) {
        double luas = 0;
        double keliling = 0;
        luas = a * b;
        keliling = (a * 2) + (b*2);
        System.out.println("Luas: " + luas + " | Keliling :" + keliling); 
    }
    void persegipanjang(double a ,int b ) {
        double luas = 0;
        double keliling = 0;
        luas = a * b;
        keliling = (a * 2) + (b*2);
        System.out.println("Luas: " + luas + " | Keliling :" + keliling); 
    }
    void persegipanjang(int a ,double b ) {
        double luas = 0;
        double keliling = 0;
        luas = a * b;
        keliling = (a * 2) + (b*2);
        System.out.println("Luas: " + luas + " | Keliling :" + keliling); 
    }
    void persegipanjang(double a ,double b ) {
        double luas = 0;
        double keliling = 0;
        luas = a * b;
        keliling = (a * 2) + (b*2);
        System.out.println("Luas: " + luas + " | Keliling :" + keliling); 
    }

       void persegi(double a ) {
        double luas = 0;
        double keliling = 0;
        luas = a * a;
        keliling = (a * 4) ;
        System.out.println("Luas: " + luas + " | Keliling :" + keliling); 
    }
      void persegi(int a ) {
        double luas = 0;
        double keliling = 0;
        luas = a * a;
        keliling = (a * 4) ;
        System.out.println("Luas: " + luas + " | Keliling :" + keliling); 
    }
     void lingkaran(int a ) {
        double luas = 0;
        double keliling = 0;
        keliling = 22/7 * 2 * a;
        luas = 22/7 * a * a ;
        System.out.println("Luas: " + luas + " | Keliling :" + keliling); 
    }
    void lingkaran(double a ) {
        double luas = 0;
        double keliling = 0;
        keliling = 22/7 * 2 * a;
        luas = 22/7 * a * a ;
        System.out.println("Luas: " + luas + " | Keliling :" + keliling); 
    }
  void segitiga(int a ,int b ) {
        double luas = 0;
        double keliling = 0;
        luas = a * b / 2;
        System.out.println("Luas: " + luas ); 
    }
  void segitiga(double a ,int b ) {
        double luas = 0;
        double keliling = 0;
        luas = a * b / 2;
        System.out.println("Luas: " + luas  ); 
    }
  void segitiga(int a ,double b ) {
        double luas = 0;
        double keliling = 0;
        luas = a * b / 2;
        System.out.println("Luas: " + luas  ); 
    }
  void segitiga(double a ,double b ) {
        double luas = 0;
        double keliling = 0;
        luas = a * b / 2;
        System.out.println("Luas: " + luas  ); 
    }

}