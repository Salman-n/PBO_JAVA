/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simplearraylist;

import java.util.Scanner;

/**
 *
 * @author Salman 
 */
public class SimpleArrayList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        AppArrayList app = new AppArrayList();
        while(true){
            int inp;
            System.out.println("---- Menu Data ArrayList App ----");
            System.out.println("1.Tambah data");
            System.out.println("2.Cari Data");
            System.out.println("3.Hapus Data");
            System.out.println("4.Tampil Data");
            System.out.println("5.Keluar");
            
            Scanner input = new Scanner(System.in);
            System.out.println("");
            System.out.println("Pilih nomor yang diinginkan = ");
            inp = input.nextInt();

            switch (inp) {
                case 1:
                    app.Tambahkan_Data();
                    break;
                case 2:
                    app.Mencari_Data();
                    break;
                case 3:
                    app.Menghapus_Data();
                    break;
                case 4:
                    app.Menampilkan_Data();
                    break;
                case 5:
                    System.out.println("Terimakasih Sudah memakai Data ArrayList App.");
                    System.exit(0);
            }
        }
    }
}