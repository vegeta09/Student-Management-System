package studentManager;

import java.util.Scanner;

public class Enroll {
	private static int a = 1400, b = 1200, c= 1000, d = 800;
	String Course;
	public String Enroll()
	{
		System.out.println("\nHERE, WE OFFER MINI COURSES IN :- \n 1- Website Development (Type 1) \n 2- Android Development (Type 2) \n 3- Cyber Security (Type 3)\n");
		System.out.print("Enter your choice :- ");
		Scanner in = new Scanner(System.in);
		int n = in.nextInt(); 
		
		if(n == 1) {
			Course = "WebDev";
		}
		else if(n==2) {
			Course = "Android";
		}
		else if(n==3) {
			Course = "CyberSc";
		}
		return Course;
		
	}
	private int cost;
	public int tuitionfee(int gradeyear) {
		
		if(gradeyear==1) {
			cost = a;
		}
		else if(gradeyear==2) {
			cost = b;
		}
		else if(gradeyear==3) {
			cost = c;
		}
		else if(gradeyear==4) {
			cost = d;
		}
		return cost;
	}
}