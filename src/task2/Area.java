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
public class Area {
    int area;
     int area1;
    double area2;
    Area(int side){
        
        area=side*side;
    }
    Area(int length,int breadth){
        
        area1=length*breadth;
    }
    Area(double radius){
        
        area2= 3.14*radius*radius;
    }
}
