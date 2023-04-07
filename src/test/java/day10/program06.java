package day10;

import org.testng.TestException;

public class program06 {

	public static void main(String[] args) throws TestException {
		 int x=10;
		 int y=0;
		
		 System.out.println(x+y);
		 System.out.println(x-y);
		 if(y==0)
		 {
			 throw new TestException("Y value is Zero");
		 }
		 System.out.println(x/y);
		 System.out.println(x*y);
		 System.out.println((x*x)+(y*y));

	}

}
