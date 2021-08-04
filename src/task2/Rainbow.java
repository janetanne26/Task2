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
public enum Rainbow {
		VIOLET(1), 
		INDIGO(2), 
		BLUE(3),
		GREEN(4),
		YELLOW(5),
		ORANGE(6),
		RED(7);
	private int value;
		Rainbow(int value) {

			this.value=value;
		}
		public int getNumber() {

			return value;
		}
	}

