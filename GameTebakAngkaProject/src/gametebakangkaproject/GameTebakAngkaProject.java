/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gametebakangkaproject;

/**
 *
 * @author Salman
 */
import java.util.Scanner;

public class GameTebakAngkaProject {
    static Scanner scanner;

    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        print("“Hai.. nama saya Mr. Java, saya telah memilih sebuah bilangan bulat secara acak antara 0 s/d 100. Silakan tebak ya!!!”");
        int angka = (int) (Math.random() * ((100 - 0) + 1) + 0);
        Boolean tebakan_salah = true;
        while (tebakan_salah) {
            int tebakan = input("Masukan Tebakan anda : " , true);
            if (tebakan == angka) {
                print("Yeeee… Bilangan tebakan anda BENAR :-)");
                tebakan_salah = false;
            } else if (tebakan > angka && tebakan < 100) {
                print("Hehehe… Bilangan tebakan anda terlalu besar");
            }else if (tebakan < 0) {
                print("hayo, kan minimal angka 0, coba tebak lagi");
            }else if (tebakan > 100) {
                print("hayo, kan maksimal angka 100, coba tebak lagi");
            } else {
                print("Hehehe… Bilangan tebakan anda terlalu kecil");
            }
        }
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
