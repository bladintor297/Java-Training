package Day8;

public class StudentTest {
	
	public static void main(String[] args) {

		Student s1 = new Student ("Samsul");
		Student s2 = new Student (222, "Saadia");
//		char 
		s1.display();
		System.out.println(s1.name);
		s2.display('a');
	}

}
