public class Person {
	
	String name;
	int age;
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	
}
public class Student extends Person {
	
	int studentId;
	String course;
	
	public Student(String name,int age, int studentId, String course) {
		super(name,age);
		this.studentId = studentId;
		this.course = course;
	}

	@Override
	public String toString() {
		return "Student  [studentId=" + studentId + ", course=" + course + ", name=" + name + ", age=" + age + "]";
	}	

}
public class Main {

	public static void main(String[] args) {
	Student st = new Student ("Rahul", 25,110,"BCA");
	System.out.println(st);
	
	Student st2 = new Student ("Rohan", 20,110,"BE");
	System.out.println(st2);
	
	}

}



