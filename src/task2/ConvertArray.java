/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task2;
import java.util.Arrays;
import java.util.ArrayList;
/**
 *
 * @author Admin
 */
public class ConvertArray {
   public static void convert(int arr[]){
       ArrayList<Integer> al = 
                new ArrayList<Integer>();
  
        // Using add() method to add elements in array_list
        for (int i = 0; i < arr.length; i++)
            al.add(new Integer(arr[i]));
        System.out.print(al);
        System.out.println(" ");
    }
   
}

