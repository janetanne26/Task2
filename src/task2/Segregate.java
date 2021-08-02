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
public class Segregate {
    public static void segregateEle(int arr[],int length){
        int left=0, right =length-1;
        for(int i=0;i<length;i++){
            if(arr[i]==0){
                arr[left]=0;
                left++;
            }
          if(arr[i]==1){
              arr[right]=1;
              right--;
          }  
        }
    
    for(int i=0;i<length;i++){
        System.out.println("After segregation:  "+arr[i]);
    }
    }
    
    
    
}
