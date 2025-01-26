
abstract class Employee {

	private String name;
	private int id;
	private double salary;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public Employee(String name, int id, double salary) {
		super();
		this.name = name;
		this.id = id;
		this.salary = salary;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Employee() {
	}
	
	public void details() {
		System.out.println("Id "+id);
		System.out.println("Name "+name);
		System.out.println("Salary "+salary);
	}
	
	
	public abstract void roleJob();
	
	
}
class Manager extends Employee {
	
	private String department;
	
	public Manager(String name, int id, double salary, String department) {
		super(name, id, salary);
		this.department = department;
	}


	public String getDepartment() {
		return department;
	}


	public void setDepartment(String department) {
		this.department = department;
	}

	@Override
	public void roleJob() {

		System.out.println( "Department is " + department);
	
	}

	
		
	
}
class Intern extends Employee {

	
	private int duration;
	
	public int getDuration() {
		return duration;
	}


	public void setDuration(int duration) {
		this.duration = duration;
	}


	public Intern(String name, int id, double salary, int duration) {
		super(name, id, salary);
		this.duration = duration;
	}


	@Override
	public void roleJob() {
		System.out.println( "Intern for " + duration + " months");
	}
	

}


public class Main {

	public static void main(String[] args) {
		
		Manager m1 = new Manager("Rohan",105,5000,"Manager");
		m1.details();
		m1.roleJob();
	
		Intern intern = new Intern("Rohit",115,2000,5);
		intern.details();
		intern.roleJob();
		
	
	}

	
}
