class School {
	protected int id;
	protected String name;
	
	public School(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public void schoolDisplay() {
		System.out.println("Student Details");
	}
}

class Student extends School {
	public Student(int id, String name) {
		super(id, name);
	}
	
	public void display() {
		System.out.println("Id = "+id);
		System.out.println("Name = "+name);
	}
}

class TestUpcasting {
	public static void main(String[] args) {
		School s = new Student(1, "Rohit");
		
		Student s1 = new Student(2, "Vijay");
		School s2 = s1;
		
		s.schoolDisplay();
		s2.schoolDisplay();
	}
}