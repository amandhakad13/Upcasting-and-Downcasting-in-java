class Vehicle {
	protected String name;
	protected int model;
	protected float price;
	
	public Vehicle(String name, int model, float price) {
		this.name = name;
		this.model = model;
		this.price = price;
	}
	
	public void detailsDisplay() {
		System.out.println("Vehicle Details");
	}
}

class Car extends Vehicle {
	
	public Car(String name, int model, float price) {
		super(name, model, price);
	}
	
	public void display() {
		System.out.println("Car name = "+name);
		System.out.println("Car model = "+model);
		System.out.println("Car price = "+price);
	}
}

class TestDowncasting {
	public static void main(String[] args) {
		
		Vehicle v = new Car("Swift", 2014, 100000);
		Car c = (Car)v;
		
		c.detailsDisplay();
		c.display();
	}
}