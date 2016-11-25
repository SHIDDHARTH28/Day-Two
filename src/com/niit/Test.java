package com.niit;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		Emp eobj;
		
		String Etype;
System.out.println("Enter employee type:Trainee/Confirmed ?");
		Scanner sc = new Scanner(System.in);
		Etype=sc.next();

		switch(Etype){
			case "Trainee":	eobj= new Trainee();
							eobj.display();
							break;
			case "Confirmed": eobj = new Confirmed();
							  eobj.display();
							  break;
			default: System.out.println("Employe class");
		
	}
	}
}
