package sortingproject;

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
    double hitungRerata(int[] arr){
        double sum = 0;
        for(a=0;a<this.n;a++){
            sum += arr[a];
        }
        double rerata = sum/this.n;
        return rerata;
    }
     int cariMax(int[] arr){
        int max = arr[0];
        for( a=0;a<this.n;a++){
            if (max<arr[a]){
                max = arr[a];
            }
        }
        return max;
    }
    int cariMin(int[] arr){
        int min = arr[0];
        for(a=0;a<this.n;a++){
            if (min>arr[a]){
                min = arr[a];
            }
        }
        return min;
    }
    int []urutkan(){
       int[] arr = this.dataBil;
       for (a = this.n - 1; a >= 0; a--) {
            for (j = 0; j < a; j++) {
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1]=temp;
                }
            }
        
        } 
        for(int i=0;i<n;i++){
           System.out.println(arr[i]);
        }
       return arr;
    }
  








    void output(){
    System.out.println("Rerata        : " + this.hitungRerata(this.dataBil));
    System.out.println("Nilai min     : " + this.cariMin(this.dataBil));
    System.out.println("Nilai max     : " + this.cariMax(this.dataBil));
    System.out.println("Sort : ");
    int[] arr = this.urutkan();
    
    }


}