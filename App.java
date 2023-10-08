/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany;

/**
 *
 * @author Ваня
 */
public class App {

    public static void main(String[] args) {
       int n1=20;
       int n2=50;
       System.out.println("Fibonacci("+n1+") = "+fibonacci(n1));
       System.out.println("Fibonacci("+n2+") = "+fibonacci(n2));
    }
    public static long fibonacci(int n){
        if(n<=1){
            return 1;
        }
        return fibonacci(n-1)+fibonacci(n-2);
    }
}
