package BasicOfJava;

public class ClassObjectAndMethod {
	
	public int hight;
	public int weight;
	public String color;
	
	final static int i=10;
	
	static int num;
	
	public void walk(){
		System.out.println("walk()");
	}
	
	public static int sing(){
		System.out.println("sing()");
		
		return 15;
	}
	
	public void eat(int i){
		System.out.println(i);
	}
	
	public void run(){
		System.out.println("run()");	
	}
	
	public static void finalkeycheck()
	{
		System.out.println(i);
		
	}
	
	public static void main(String[] args) {
		
		
		ClassObjectAndMethod obj = new ClassObjectAndMethod();
		obj.walk();
		obj.run();
		obj.eat(5);
		System.out.println(obj.hight);
		System.out.println(obj.weight);
		System.out.println(obj.color);
		ClassObjectAndMethod obj1 = new ClassObjectAndMethod();
		obj1.eat(4);
		ClassObjectAndMethod obj2 = new ClassObjectAndMethod();
		obj2.walk();
		
		System.out.println(ClassObjectAndMethod.num+"num");
		
		System.out.println(ClassObjectAndMethod.sing()+"sing");
		
		System.out.println(ClassObjectAndMethod.i+"final");
		ClassObjectAndMethod.finalkeycheck();
		
	}

	  

}
