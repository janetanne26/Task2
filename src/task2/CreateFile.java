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
		try(PrintWriter pw = new PrintWriter("Sample.txt")) {
		pw.println("Programmatically created file");
		pw.println("These words were written programmatically");
		pw.println("All is Well. Be happy & enjoy the moment");

		} catch (IOException e)  {
			e.printStackTrace();
		}


	}

	public void readFile() {
		try(Scanner s = new Scanner(new File("//home//inc9//IdeaProjects//Task2//Sample.txt"))) {
			s.useDelimiter("\\Z");
			String text=s.next();
			System.out.println(text);
		} 
		catch (Exception e)  {
			e.printStackTrace();
		}
	}
}
