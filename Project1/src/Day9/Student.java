package Day9;

import java.util.*;
import java.util.stream.Collectors;
import java.util.ArrayList;

public class Student {

	public static Scanner sc = new Scanner(System.in);

	private String firstName; // Changed from static to instance variables
	private String lastName; // Changed from static to instance variables
	private int age; // Changed from static to instance variables
	private String city; // Changed from static to instance variables

	public Student(String firstName, String lastName, int age, String city) {
		this.firstName = firstName; // Use "this" to refer to instance variables
		this.lastName = lastName;
		this.age = age;
		this.city = city;

		System.out.println("New student created");
	}

	// Getter and setter methods for the instance variables
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	static Student getStudents(List<Student> students, String firstName, String lastName) {

		for (Student student : students) {
			if (student.getFirstName().equals(firstName) && student.getLastName().equals(lastName)) {
				return student;
			}
		}
		return null;

	}

	public static void main(String[] args) {
		List<Student> students = new ArrayList<>();
		String line = " ";

		while (!line.equals("end")) {
			// Get Inputs
			System.out.print("Enter first name: ");
			String firstName = sc.next();

			System.out.print("Enter last name: ");
			String lastName = sc.next();

			System.out.print("Enter city: ");
			String city = sc.next();

			System.out.print("Enter age: ");
			int age = sc.nextInt();

			// Check if Student Exists
			Student existingStudent = getStudents(students, firstName, lastName);

			if (existingStudent != null) {
				existingStudent.setAge(age);
				existingStudent.setCity(city);
			} else {
				Student s = new Student(firstName, lastName, age, city);
				students.add(s);
			}

			System.out.print("\n-- Enter 'ok' to continue or 'end' to terminate --\n");
			line = sc.next();
		}

		// Group students by city
		Map<String, List<Student>> studentsByCity = students.stream().collect(Collectors.groupingBy(Student::getCity));

		int count = 0;
		for (Map.Entry<String, List<Student>> entry : studentsByCity.entrySet()) {
			String city = entry.getKey();
			List<Student> cityStudents = entry.getValue();

			System.out.println("#" + ++count + " "+ city + ":");

			for (Student s : cityStudents) {
				System.out.println(s.getFirstName() + " " + s.getLastName());
			}

			System.out.println();
		}
		int x = 0;
		do {
			x = 3;
		}while(true);
	}

}
