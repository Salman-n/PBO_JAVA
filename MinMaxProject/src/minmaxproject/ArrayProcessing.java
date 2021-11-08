/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minmaxproject;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class ArrayProcessing {
    int [] dataBil = new int[100];
    int n,i;
    
    void input(){
        Scanner input = new Scanner(System.in);
        System.out.println("Masukan Input data : ");
        this.n = input.nextInt();
            for(i = 0; i < n; i++){
                System.out.println("Masukan bil ke - " + (i+1)+ " : ");
                this.dataBil[i] = input.nextInt();
            }
    }
    double hitungRerata(int[] arr){
        double sum = 0;
        for(i=0;i<this.n;i++){
            sum += arr[i];
        }
        double rerata = sum/this.n;
        return rerata;
    }
     int cariMin(int[] arr){
        int min = arr[0];
        for(int i=1;i<this.n;i++){
            if (min>arr[i]){
                min = arr[i];
            }
        }
        return min;
    }
    int cariMax(int[] arr){
        int max = arr[0];
        for(int i=1;i<this.n;i++){
            if (max<arr[i]){
                max = arr[i];
            }
        }
        return max;
    }
   
    void output(){
    System.out.println("Rerata      : " + this.hitungRerata(this.dataBil));
    System.out.println("Nilai min   : " + this.cariMin(this.dataBil));
    System.out.println("Milai max   : " + this.cariMax(this.dataBil));
    }   
}
