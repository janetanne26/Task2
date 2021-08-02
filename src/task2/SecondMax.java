/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task2;
import java.util.Scanner;
import java.util.Arrays;
/**
 *
 * @author Admin
 */
public class SecondMax {
    public static void secondMaxEle(int length,int arr[]){  
        if(length<2){
            System.out.println("invalind input");
            return;
        } 
        Arrays.sort(arr);
        for(int i= length-2;i>0;i--){
            if(arr[i]!=arr[length-1]){
                System.out.println("second max "+ arr[i]);
                return;
            }
        }
        System.out.println("no second maximum");   
}    
}

