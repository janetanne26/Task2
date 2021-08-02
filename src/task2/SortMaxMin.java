/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task2;

import java.util.Arrays;

/**
 *
 * @author Admin
 */
public class SortMaxMin {
    public static void maxMinSort(int arr[],int length){
        int resultArray[]=new int[length]; 
        Arrays.sort(arr);
        int i=length-1;
        int s=0;
        for(int j=0;j<length;j=j+2){
            resultArray[j]=arr[i--];
           
        }
        for(int j=1;j<length;j=j+2){
            resultArray[j]=arr[s++];
           
        }
        
             
         System.out.println("the resultant array is: ");
         for(int k=0;k<length;k++){
             System.out.println(resultArray[k]);
         }
    }
    
    
    
}
