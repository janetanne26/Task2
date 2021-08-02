/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task2;

import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class Task2Runner {
    public static void input(int arr[],int size){
        Scanner s=new Scanner(System.in);              
         System.out.println("enter the array elements");
        for(int i=0;i<size;i++){
        arr[i]=s.nextInt();
        }
    }
        public static void main(String[] args) {
       
        Scanner s=new Scanner(System.in);
       Scanner s1=new Scanner(System.in); 
      
       while(true){
          
           
        System.out.println("enter the program choice between 1 to 6");
        int choice=s.nextInt();
        if(choice>=7){
            System.out.println("no program");
            break;
        }
        else{
        switch(choice){
     case 1:
              System.out.println("enter the array size");
                int size =s.nextInt(); 
              int array[]=new int[size];  
                Task2Runner.input(array,size);
                SecondMax.secondMaxEle(size, array);
                break;
         
     case 2:
             System.out.println("enter the array size");
                int size2 =s.nextInt(); 
              int array2[]=new int[size2];  
              System.out.println("enter the array elements in 0s and 1s");
              Task2Runner.input(array2,size2);  
              Segregate.segregateEle(array2, size2);
              break;
     case 3: 
            System.out.println("enter the array size");
                int size3 =s.nextInt(); 
              int array3[]=new int[size3];  
             Task2Runner.input(array3,size3);  
             SortMaxMin.maxMinSort(array3, size3);
             break;
     case 4:
            System.out.println("enter the string ");
             String revstring=s.next();
             int len= revstring.length();
             ReverseString.reverseString(revstring,len);
             break;
     case 5: 
             System.out.println("enter  the string");
             String message= s1.nextLine();
             int length=message.length();
              ReverseWords.reverseWords(message,length);
              break;
     case 6:
             System.out.println("enter the array size");
                int size6 =s.nextInt(); 
              int array6[]=new int[size6];  
             Task2Runner.input(array6,size6); 
             ConvertArray.convert(array6);
             break;
                      
        default:
            System.out.println("No program");
             break;
        }
        
       }
       }
        
        
        
        
        
        }     
}
