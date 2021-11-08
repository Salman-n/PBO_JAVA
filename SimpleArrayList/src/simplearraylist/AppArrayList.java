/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simplearraylist;
import java.util.Scanner;
import static java.util.Collections.binarySearch;
import java.util.ArrayList;

/**
 *
 * @author Salman 
 */
public class AppArrayList {
     ArrayList<String> DATA = new ArrayList<>();
    
    void Tambahkan_Data() {
        Scanner tambahkan = new Scanner(System.in);
        System.out.println("Masukkan data string : ");
        DATA.add(tambahkan.nextLine());
        System.out.println("Daftar string dalam array list :" + DATA);
        tambahkan.nextLine();
    }
    void Mencari_Data() {
        Scanner carikan = new Scanner(System.in);
        System.out.println("Silahkan String yang mau dicari  ");
        String mencari = carikan.nextLine();
        if(binarySearch(DATA,mencari) > -1){
            System.out.println("String " + mencari + " ada di index ke " + binarySearch(DATA,mencari) +" di dalam data.");
        } else {
            System.out.println("String " + mencari + " tidak ada dalam data.");
        }
        
    }
    void Menghapus_Data() {
        Scanner menghapus = new Scanner(System.in);
        System.out.println("Silahkan String yang mau dihapus : ");
        String menghps = menghapus.nextLine();
        if(binarySearch(DATA,menghps) > -1){
            DATA.remove(binarySearch(DATA,menghps));
            System.out.println("String " + menghps + " sudah dihapus di dalam data.");
        } else {
            System.out.println("String " + menghps + " tidak ada dalam data.");
        }
        
    }
    
    void Menampilkan_Data() {
        System.out.println("Daftar string dalam array list :" + DATA);
    }
}

