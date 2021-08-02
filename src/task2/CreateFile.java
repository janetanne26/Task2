/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task2;
import java.io.*;
import java.util.Scanner;
/**
 *
 * @author Admin
 */
public class CreateFile {
    public void createFile() {
		try {
		File file = new File("Sample.txt");
		PrintWriter pw = new PrintWriter(file);
		pw.println("All is Well. Be happy & enjoy the moment");
		pw.close();
		} catch (IOException e)  {
			e.printStackTrace();
		}
	}

	public void readFile() {
		try {
			File file = new File("C:\\Users\\Admin\\Documents\\NetBeansProjects\\Task2\\Sample.txt");
			Scanner scan = new Scanner(file);
			scan.useDelimiter("\\Z");
			System.out.println(scan.next());
		} 
		catch (Exception e)  {
			e.printStackTrace();
		}
	}
}
