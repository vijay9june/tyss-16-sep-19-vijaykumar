
public class TestA {
	public static int add(int a , int b) {
		System.out.println("add(int a , int b) method");
		return a + b ;
	}
	
	public static long add(long a , int b) {
		System.out.println("add(int a , int b) method");
		return a + b ;
}
	public static void add(int a , byte b) {
		System.out.println("add(int a , byte b) method");
	}
	
	public int multiply(int a , int b) {
		System.out.println("multiply(int a , int b) method");
		return a + b ;
	}
	
	public static void main(String[] args) {
		System.out.println("main(String[] args)");
		main(10);
		add(10, 12);
		add(21, 13);
		add(54, 34);
		TestA t = new TestA();
		t.multiply(2, 4);
		t.multiply(5, 4);
		
		
	}
	
	public static void main(int a) {
	System.out.println("main(int a) method");	
	}
}