/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task2;

/**
 *
 * @author Admin
 */
public class ReverseString {
    public static void reverseString(String x,int n){
        char[] g= x.toCharArray();
          System.out.println("the reversed string is : ");
       for(int i=n-1;i>=0;i--){
           System.out.print( g[i]);
           
       } 
        System.out.println(" ");
    }
    
}
