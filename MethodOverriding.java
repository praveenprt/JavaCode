
public class Animal {
	public void sound() {
		System.out.println(" animal can sound ");
	}
}

public class Dog extends Animal {
	
	@Override
	public void sound() {
		System.out.println("dog can sound ");
	}
}


public class Main {
	public static void main(String[] args) {
		Dog dog = new Dog();
		
			dog.sound();
		
		
	}
}
