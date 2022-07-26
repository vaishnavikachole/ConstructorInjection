package com.springcore.ci;

public class Addition {
	private int a;
	private int b;
	
	public Addition(double a,double b)
	{
		this.a= (int) a;
		this.b = (int) b;
		System.out.println("Constructor: double, double");
	}

	public Addition(int a,int b)
	{
		this.a= a;
		this.b = b;
		System.out.println("Constructor: int, int");
	}
	public Addition(String a,String b) // by default string type constructor will execute if we didn't mention type value in config. file
	{
		this.a= Integer.parseInt(a);
		this.b = Integer.parseInt(b);
		System.out.println("Constructor: string, string");
	}
	

	public void doSum()
	{
		System.out.println("Value of a: "+this.a);
		System.out.println("Value of b: "+this.b);
		System.out.println("Sum is= "+(this.a + this.b));
	}
}
