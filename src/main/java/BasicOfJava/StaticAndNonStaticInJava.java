package BasicOfJava;

public class StaticAndNonStaticInJava {
	
	int i;
	int j;
	
	String str;
	
	boolean blr;
	
	char ch;
	
	float fl;
	
	static byte bt;
	
	static long lg;
	
	static short st;
	
	static double de;
	
	static int p;
	static int k;
	
	public void test1(){
		System.out.println("test 1 non static");
	}
	
	public static void test2(){
		System.out.println("test 2 static");
	}
	
	public void test3(){
		System.out.println("test 1 non static");
	}
	
	public static void test4(){
		System.out.println("test 4 static");
	}
	
	public static void main(String[] args) {
		
		StaticAndNonStaticInJava obj = new StaticAndNonStaticInJava();
		obj.test1();
		obj.test3();
		System.out.println(obj.i);
		System.out.println(obj.j);
		
		StaticAndNonStaticInJava.test2();
		StaticAndNonStaticInJava.test4();
		System.out.println(StaticAndNonStaticInJava.k);
		System.out.println(StaticAndNonStaticInJava.p);
		
		System.out.println("777777777777777777777");
		System.out.println(obj.str);
		System.out.println(obj.ch);
		System.out.println(obj.blr);
		System.out.println(obj.fl);
		
		System.out.println("satuisvvss");
		
		System.out.println("double"+StaticAndNonStaticInJava.de);
		System.out.println("long"+StaticAndNonStaticInJava.lg);
		System.out.println("byte"+StaticAndNonStaticInJava.bt);
		System.out.println("short"+StaticAndNonStaticInJava.st);
		System.out.println("int"+StaticAndNonStaticInJava.p);

		
		
		
	}

}
