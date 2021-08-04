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
public class AreaTestRunner {
    public static void main(String[] args) {
        Area square = new Area(6);
		System.out.println("Area of square is " + square.area);
         Area rectangle = new Area(4,5);
		System.out.println("Area of rectangle is " + rectangle.area);
        Area circle = new Area(2.5);
		System.out.println("Area of circle is " + circle.area1);
                
    }
}
