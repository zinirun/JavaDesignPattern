package designPattern;

class Person{
	void show() {
		System.out.println("Person");
	}
}

class Student extends Person{
	void show() {
		System.out.println("Student");
	}
}

class Teacher extends Person{
	void show() {
		System.out.println("Teacher");
	}
}
public class Ch5_method_override {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s = new Student();
		Student s1;
		Person p1= new Person();
		Person p = s;
		p.show();
		s.show();
		
		s1 = (Student)p1;
	}

}
