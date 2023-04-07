package day10;

public class program04 {
	
	int a=1;
	int b=2;
	
	public program04()
	{
		System.out.println("Program4 is Started");
	}
	
	private program04(int a, int b)
	{
		this.a=a;
		this.b=b;
	}

	public static void main(String[] args) {
		
		program04 pro1 = new program04();
		System.out.println(pro1.a+pro1.b);
		
		program04 pro2 = new program04(20,30);
		System.out.println(pro2.a+pro2.b);

	}

}