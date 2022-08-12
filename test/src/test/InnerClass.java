package test;

public class InnerClass {
	
	private String msg="The Inner Class Demo\n"; 
       class Inner{  
		  void hello(){
			  System.out.println(msg+"Inside the Inner Classes");
			  }  
		 }  


		public static void main(String[] args) {

			InnerClass obj=new InnerClass();
			InnerClass.Inner test=obj.new Inner();  
			test.hello();  
		}
	}


