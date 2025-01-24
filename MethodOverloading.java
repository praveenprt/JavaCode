public class Calculator {
	
	public int add(int a , int b) {
		return a + b;
	}
	
	public int add(int a , int b , int c ) {
		return a + b + c;
	}
	
	public String  detail(String a , String b) {
		return a + b ;
	}
}
public class Main {

	public static void main(String[] args) {
		Calculator cal = new Calculator();
		int sum1 =	cal.add(10, 20);
		int sum2 =	cal.add(25, 10, 40);
		String d =	cal.detail("Hello", " World");

		System.out.println(sum1);
		System.out.println(sum2);
		System.out.println(d);
	
	}

}
