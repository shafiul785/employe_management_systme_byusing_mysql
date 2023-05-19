package employee_mgmt;

import java.util.Scanner;

public class MainApp extends connnectDB
{
	public static void menu() {
		System.out.println("Please chose operation: \n"
				+ "1 for Add employee \n"
				+ "2 for show all employee \n"
				+ "3 for search based on id \n"
				+ "4 for modifi employee \n"
				+ "5 for delete employee \n"
				+ "6 for exit \n");
	}
public static void main(String[] args)
{	
	Scanner sc=new Scanner(System.in);
	employediointra eintra=new employedio();
	do {
		menu();
		System.out.println("enter your choice: ");
		int choice=sc.nextInt();
		switch(choice) {
		case 1:
			Employe_assign emp=new Employe_assign();
			System.out.println("Plaese enter emplo id: ");
			int id=sc.nextInt();
			System.out.println("Please enter emplo name:");
			String name=sc.next();
			System.out.println("Please enter emplo department:");
			String depart=sc.next();
			System.out.println("Please enter emplo salary:");
			double salary=sc.nextDouble();
			System.out.println("Please enter emplo age");
			int age=sc.nextInt();
			emp.setEmpId(id);
			emp.setName(name);
			emp.setDepartment(depart);
			emp.setSalary(salary);
			emp.setAge(age);
			eintra.createEmploye(emp);
			
		case 2:
			eintra.showallEmploye();
		
		case 3: 
			System.out.println("Enter employee id");
			int empid=sc.nextInt();
			eintra.showemployeBaseonID(empid);
		case 4:
			try {
			System.out.println("Enter  id");
			int empid1=sc.nextInt();
			System.out.println("Enter new name");
			String Newname=sc.next();
			
			
			
			eintra.updateemploye(empid1, Newname);}
			catch(Exception e) {
				System.out.println("input mismatch");
			}
		case 5:
			System.out.println("Enter employee id to delete");
			int empid1=sc.nextInt();
			eintra.deleteemploye(empid1);
			
			
			
		}
		
	}while(true);
	
}
}
