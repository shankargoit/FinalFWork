package javatest;

public class Child1 extends Parent1{
	
	public static void parent1(int a)
	{
		System.out.println("public static void parent1()");
	}

	public void parent2(String s)
	{
		System.out.println("public void parent2()");
	}
	
	public void child2(String s)
	{
		System.out.println("public void parent2()");
	}
	
	public static void main(String[] args) 
	{
	
		Child1 ch=new Child1();
		
		
		Parent1 p1=new Parent1();
		
		
	}
}
