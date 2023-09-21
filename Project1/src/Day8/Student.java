package Day8;

class Student {
	
	int id;
	public String name;
	
	Student(String name){

		this.name= name;
	}
	Student(int i, String n){
		id = i;
		name = n;
	}
	void display() {
		System.out.println("Student ID: " + id + ", Name: "+name);
	}
	
	void display(char type) {
		
		System.out.println("Name: "+name);
	}

}
