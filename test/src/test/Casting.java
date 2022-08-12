package test;

public class Casting {

	public static void main(String[] args) {

		// Implicit Typecasting
		
      System.out.println("Implicit Typecasting\n");   
		byte a = 18;

		System.out.println("Value of A = " +a);

		int b = a;

		System.out.println("Value of B = " + b);

		long c = b;

		System.out.println("Value of C = " + c);

		float d = c;

		System.out.println("Value of D = " + d);

		double e = d;

		System.out.println("Value of E = " + e);
		
		// Explicit Typecasting

		 System.out.println("Explicit Typecasting\n");
		 
		 double x=10.25;
		 double y=11.21;
		System.out.println("Value of x ="+x);
		System.out.println("Value of y ="+y);
		System.out.println("Sum in float = "+(x+y));
		
		 int p=(int)x;
		 int q=(int)y;
		 
		 System.out.println("Sum on int = "+(p+q));
		
	}
	
	

}
