
public class Student {
	String name;
	int id;
	String branch;
	String cname;
	int yop;
	
	public Student(String name,int id,String branch,String cname,int yop ) {
		this.name = name;
		this.id = id;
		this.branch = branch;
		this.cname = cname;
		this.yop = yop;
		
	}
	
	void display() {
		System.out.println("Student name is "+name);
		System.out.println("Student id is "+id);
		System.out.println("Student branch is "+branch);
		System.out.println("Student cname is "+cname);
		System.out.println("Student yop is "+yop);
		System.out.println("");
	}

	public static void main(String[] args) {

		Student s1 = new Student("vijay",111,"ece","annamalai university",2016);
		s1.display();
		
		Student s2 = new Student("ajay",222,"cs","anna university",2016);
		s2.display();
		
		Student s3 = new Student("lalit",333,"ece","satyabhama university",2017);
		s3.display();
		
		Student s4 = new Student("amit",444,"mechanical","annamalai university",2016);
		s4.display();
		
		Student s5 = new Student("vibuti",555,"ece","srm university",2018);
		s5.display();
		
		Student s6 = new Student("sumit",666,"eee","annamalai university",2015);
		s6.display();
		
		Student s7 = new Student("sanjit",777,"ece","annamalai university",2016);
		s7.display();
		
		Student s8 = new Student("amit",888,"cs","LNCT university",2019);
		s8.display();
		
		Student s9 = new Student("ankit",999,"it","mithila university",2016);
		s9.display();
		
		Student s10 = new Student("aayush",123,"ece","galgotiya university",2016);
		s10.display();
	}
}


