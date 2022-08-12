package test;

class Default {
	void display() // Default
	{
		System.out.println("Printing Function with default access.");
	}

	private void display1() // Private
	{
		System.out.println("Printing Function with private access");
	}

	protected void display2() // Protected
	{
		System.out.println("Printing Function with protected access");
	}

	public void display3() // public
	{
		System.out.println("Printing function with public access");
	}
}

public class TypesOfAccess extends Default{

	public static void main(String[] args) {

		Default obj1 = new Default();
		obj1.display(); // default
		// obj1.display1(); cant access since declared in private
        obj1.display2();  // protected
        obj1.display3();  // public
	}

}
