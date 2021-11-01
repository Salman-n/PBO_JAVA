/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pythagorasproject;

/**
 *
 * @author Salman 
 */
import java.util.Scanner;
import java.lang.Math;
public class PythagorasProject {
    static Scanner scanner;

    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        print("Menu Program Phytagoras");
        print("[1] Cek Triple Phytagoras");
        print("[2] Menentukan Sisi Miring segitiga");
        print("[3] Menentukan sisi siku-siku seigitga");
        print("[4] Exit");
        String masukan = String.valueOf(input("Pilih Opsi : ", true));

        switch(masukan) {
            case "1":
                triple() ;
            case "2":
                miring();
            case "3":
                siku();
            case "4":
                System.exit(0);
                default:
                    print("Input Tidak Valid");
        };
    }

    static void triple() {
        int pertama = input("Masukan Nilai A : ",true);
        int kedua = input("Masukan Nilai B : ",true);
        int ketiga = input("Masukan Nilai C : ",true);
        if ( (pertama * pertama) + (kedua * kedua) == (ketiga * ketiga) ) {
            print("Angka tersebut merupakan phytagoras");
        }else {
            print("Angka tersebut bukan phytagoras");
        }
    }

    static void miring() {
        int pertama = input("Masukan Nilai A : ",true);
        int kedua = input("Masukan Nilai B : ",true);
        Double hasil = Math.sqrt((pertama * pertama) + (kedua * kedua));
        print("Sisi Miring : " + hasil);
    }

    static void siku() {
        int pertama = input("Masukan Nilai A : ",true);
        int kedua = input("Masukan Nilai C : ",true);
        Double 	hasil = Math.sqrt((kedua * kedua) - (pertama * pertama) );
        print("Sisi Miring : " + hasil);
    }

    static String input(String text) {
        System.out.print(text);
        String string = scanner.nextLine();
        return string;
    }
    static int input(String text,Boolean integers) {
        System.out.print(text);
        int integer = scanner.nextInt();
        return integer;
    }
    static void print(String text) {
        System.out.println(text);
    }
}