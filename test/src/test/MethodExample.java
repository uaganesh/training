package test;

public class MethodExample {

	public int add(int x, int y) {
		int z = x + y;
		return z;
	}

	int val = 150;

	int manipulate(int val) {

		val = val * 1000 / 800;
		return (val);

	}

	// Method Overloading /

	public void area(int b, int h) {
		System.out.println("Area of Triangle : " + (0.5 * b * h));
	}

	public void area(int r) {
		System.out.println("Area of Circle : " + (3.14 * r * r));
	}
	

	public static void main(String[] args) {

		MethodExample obj1 = new MethodExample();
		MethodExample obj2 = new MethodExample();
		int sum = obj1.add(10, 20);
		System.out.println("Sum = " + sum);

		// Call by Value

		System.out.println("Before Operation the value of data is " + obj2.val);
		obj2.manipulate(200);
		System.out.println("After Operation the value of data is " + obj2.val);

		
		//Method Overloading
		MethodExample obj3 = new MethodExample();
		obj3.area(9,7);
		obj3.area(7);
	}
}
