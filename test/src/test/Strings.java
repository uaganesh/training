package test;

public class Strings {

	public static void main(String[] args) {
		//String Methods
		
		System.out.println("String Methods");
		
		String str=new String("Hello World");
		System.out.println(str.length()); //length 

		//Substring
		String substr=new String("Welcome");
		System.out.println(substr.substring(2));

		//String Comparison 
		String x1="Welcome";
		String x2="Welpome";
		System.out.println(x1.compareTo(x2));

		//IsEmpty
		String y="";
		System.out.println(y.isEmpty());

		//toLowerCase
		String p="EDUCATION";
		System.out.println(p.toLowerCase());
		
		//replace
		String edu="EDUCATION";
		String replace=edu.replace('I', 'Q');
		System.out.println(replace);

		//equals
		String x12="Welcome to String";
		String y1="WeLcOmE tO StRing";
		System.out.println(x12.equals(y));
 
		System.out.println("\n");
		System.out.println("Creating StringBuffer");
		//Creating StringBuffer and append method
		StringBuffer s12=new StringBuffer("Welcome to Strings!");
		s12.append("Explore String Functions");
		System.out.println(s12);

		//insert method
		s12.insert(0, 'w');
		System.out.println(s12);

		//replace method
		StringBuffer sq=new StringBuffer("Education");
		sq.replace(0, 2, "EDU");
		System.out.println(sq);

		//delete method
		sq.delete(0, 1);
		System.out.println(sq);
		
		//StringBuilder
		System.out.println("\n");
		System.out.println("Creating StringBuilder");
		StringBuilder sb1=new StringBuilder("Happy");
		sb1.append("Learning");
		System.out.println(sb1);

		System.out.println(sb1.delete(0, 1));

		System.out.println(sb1.insert(1, "Welcome"));

		System.out.println(sb1.reverse());
				
		//conversion	
		System.out.println("\n");
		System.out.println("Conversion of Strings to StringBuffer and StringBuilder");
		
		String str12 = "Hello"; 
        
        // conversion from String object to StringBuffer 
        StringBuffer sbr = new StringBuffer(str); 
        sbr.reverse(); 
        System.out.println("String to StringBuffer");
        System.out.println(sbr); 
          
        // conversion from String object to StringBuilder 
        StringBuilder sbl = new StringBuilder(str); 
        sbl.append("world"); 
        System.out.println("String to StringBuilder");
        System.out.println(sbl);              		
	}
	
}
