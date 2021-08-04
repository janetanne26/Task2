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
public class RainbowTestRunner {
    public static void main(String[] args) {
		Rainbow[] rainbow= Rainbow.values();
		for(Rainbow colour : rainbow ) {
			System.out.println("The color code of  " + colour + " is: " + colour.getNumber());
		}
	}
}

