package test;

public class ConstructorExample {
	
	int a,b;
	
	ConstructorExample() // Default
	{
		a=20;
		b=10;
		System.out.println("Printing values in Default Constuctor\n"+a +"\n" +b);
		
		
		
	}

	ConstructorExample(int x, int y) //Parameterized
	{
	   a=x;
	   b=y;
	   System.out.println("Printing values in Parameterized Constuctor\n"+a +"\n" +b);
	 
	}
	
	void ConstructorExample()
	{
		System.out.println("ConstructorExample = "+(a+b));
	}

    public static void main(String[] args) {
		
		ConstructorExample obj1=new ConstructorExample();
		obj1.ConstructorExample();
		
		ConstructorExample obj2=new ConstructorExample(10,50);
		obj2.ConstructorExample();
		
	}
	
	
}
