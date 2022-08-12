package test;

public class ArrayCheck {
	
	public static void main(String[] args) {

		//single-dimensional array
		int x[]= {10,20,30,40,50,60};
		for(int i=0;i<6;i++) {
		System.out.println("Elements of array x: "+x[i]);
		}


		//multidimensional array
		int[][] q = {
		            {2, 4, 6, 8 ,10}, 
		            {3, 6, 9,12} };
		      
		      System.out.println("\nLength of row 1: " + q[0].length);
		      }

}
