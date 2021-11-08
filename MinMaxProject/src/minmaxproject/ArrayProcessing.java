/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minmaxproject;

import java.util.Scanner;

/**
 *
 * @author Salman
 */
public class ArrayProcessing {
    int [] dataBil = new int[100];
    int n,a,j;
    
    void input(){
        Scanner input = new Scanner(System.in);
        System.out.println("Masukan Input data : ");
        this.n = input.nextInt();
            for(a = 0; a < n; a++){
                System.out.println("Masukan bil ke - " + (a+1)+ " : ");
                this.dataBil[a] = input.nextInt();
            }
    }
    double hitungRerata(int[] dataArray){
        double sum = 0;
        for(a=0;a<this.n;a++){
            sum += dataArray[a];
        }
        double rerata = sum/this.n;
        return rerata;
    }
    int cariMax(int[] dataArray){
        int max = dataArray[0];
        for( a=0;a<this.n;a++){
            if (max<dataArray[a]){
                max = dataArray[a];
            }
        }
        return max;
    }
    int cariMin(int[] dataArray){
        int min = dataArray[0];
        for(a=0;a<this.n;a++){
            if (min>dataArray[a]){
                min = dataArray[a];
            }
        }
        return min;
    }
	
    
    
    
   
    void output(){
    System.out.println("Rerata      : " + this.hitungRerata(this.dataBil));
    System.out.println("Nilai min   : " + this.cariMin(this.dataBil));
    System.out.println("Nilai max   : " + this.cariMax(this.dataBil));
    
    }   
}