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
public class ReverseWords {
    public static void reverseWords(String message,int n){
       String word[]=message.split(" ");
        System.out.println("the reversed order of words is");
       for(int i=word.length-1;i>=0;i--){
           String reverseMessage= word[i];
           StringBuffer sb=new StringBuffer(reverseMessage);
           System.out.print(sb+" ");
       }
        System.out.println(" ");
    }
    
}
