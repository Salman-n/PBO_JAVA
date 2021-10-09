/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProjectOverloading;

/**
 *
 * @author Salman
 */

public class MyClass1 {
    void myMethod(){
        System.out.println("Hello");
    }
    
    void myMethod(int x){
        System.out.println("Holla");
    }
    
    void myMethod(int x, int y){
        System.out.println("Hollo");
    }
    
    void myMethod(double x){
        System.out.println("Hilli");
    }
    
    void myMethod(int x, double y){
        System.out.println("Hullo");
    }
    String myMethods(){
        return "Hello";
    }
    
    void myMethod(int a, int b,int c){
        System.out.println("Holli");
    }
}