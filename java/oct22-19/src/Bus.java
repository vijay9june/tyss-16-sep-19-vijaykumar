
public class Bus {
	int seats;
	String color;
	
	Bus(int seats, String color) {
		this.seats = seats;
		this.color = color;
	}
	Bus() {
		this(40);
	}
	Bus(int seats) {
		this(seats,"red");
	}
	void getDetails() {
		System.out.println("Welcome to red bus,bus seat capacity is "+seats);
		
	}
}
