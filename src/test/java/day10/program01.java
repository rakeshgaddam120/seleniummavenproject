package day10;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

public class program01 {

	public static void main(String[] args) {
		 int x=10;
		 int y=0;
		 
		 System.out.println(x+y);
		 System.out.println(x-y);
		 try
		 {
		 System.out.println(x/y);
		 FileUtils.copyFile(new File(""), new File (""));
		 } 
		 catch(IOException e)
		 {
			 System.out.println("IOException "+e.getMessage());
		 }
		 catch(ArithmeticException e)
		 {
			 System.out.println("ArithmeticException : "+e.getMessage());
		 }
		 catch(Exception e)
		 {
			 System.out.println(e.getMessage());
		 }
		 System.out.println(x*y);
		 System.out.println((x*x)+(y*y));

	}

}