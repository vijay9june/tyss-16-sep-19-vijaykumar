
public class TestD {
	public static void main(String[] args) {
		Father f = new Father();
		f.property();
		f.marry();
		System.out.println("*****************");
		Son s = new Son();
		s.marry();
		s.property();
		System.out.println("=======================");
	}
	
}
