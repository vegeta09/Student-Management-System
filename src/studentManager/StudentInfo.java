package studentManager;

import java.util.Scanner;
import studentDB.*;

public class StudentInfo {
	private String firstname;
	private String lastname;
	private int gradeyear;
	private String courses = "";
	private int tuitionbalance;
	//private static int costofcourses = 600;
	private static int id = 1000;
	private String studentID;
	private String age;
	addToDB a=new addToDB();
	public StudentInfo() {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the FIRST name of the student: ");
		this.firstname=sc.nextLine();
		System.out.print("Enter the LAST name of the student: ");
		this.lastname=sc.nextLine();
		System.out.print("Enter Student's DOB(DD/MM/YYYY): ");
		this.age=sc.next();
		System.out.print("1 - Freshmen\n2 - Sophmore\n3 - Junior\n4 - Senior\nEnter the class level of student : ");
		this.gradeyear=sc.nextInt();
		setStudentID();
		}
	private void setStudentID() {
		id++;
		this.studentID=gradeyear + "" +id;
	}
	public void enroll() {
		Enroll stu = new Enroll();
		courses = stu.Enroll();
		tuitionbalance = stu.tuitionfee(gradeyear);
	}
	public void viewbalance()
	{
		System.out.println("FEE due : Rs." + tuitionbalance);
	}
	public void payTuition()
	{
		viewbalance();
		System.out.print("Enter the payment made by student in Rs.: ");
		payment pay = new payment();
		int Pay = pay.payment();
		tuitionbalance = tuitionbalance - Pay;
		System.out.println("Payment done - Rs." + Pay);
		viewbalance();
		System.out.println();
	}
	
	public void viewProfile()
	{
		ViewPro studentpro = new ViewPro();
		studentpro.tostring(firstname,lastname,age,gradeyear,courses,tuitionbalance,id,studentID);
		a.addStudent(studentID, firstname, lastname, age, courses, gradeyear,tuitionbalance);
	}
	
	
	
}