package test;

import java.util.*;

public class EmailValidate {

	public static void check(String email, ArrayList<String> list) {
		if (list.contains(email) == false)
			System.out.println(email + " is absent ");
		else
			System.out.println(email + " is present");
	}

	public static void main(String[] args) {
		char opt;
		ArrayList<String> list = new ArrayList<String>();
		list.add("temp@gmail.com");
		list.add("pqrs@gmail.com");
		list.add("zxcv@ymail.com");

		do {
			System.out.println("Enter the email id :");
			Scanner sc = new Scanner(System.in);
			String email = sc.nextLine();
			check(email, list);
			System.out.println("Do you want to continue? Y or N");
			opt = sc.next().charAt(0);
		} while ((opt == 'y') || (opt == 'Y'));
	}
}