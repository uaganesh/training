package test;

	
	abstract class Anonymous {
		   public abstract void display();
		}


		public class InnerClass3 {
			
			public static void main(String[] args) 
			{
				Anonymous i = new Anonymous() 
				{

				         public void display() 
				         {
				            System.out.println("Anonymous Inner Class");
				         }
				      };
				      
				      i.display();
				   }
				}



