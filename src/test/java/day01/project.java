package day01;

public class project extends framework{

	public static void main(String[] args) {
		browser("edge");
		appUrl("https://accounts.google.com/signup");
		typeIn("//input[@name='firstName']", "testA");
		typeIn("//input[@name='lastName']", "testA");
		clickIn("//input[@type='checkbox']");
		clearAll("//input[@name='firstName']");
	}

}