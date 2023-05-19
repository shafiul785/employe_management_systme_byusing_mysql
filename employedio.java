package employee_mgmt;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;



public class employedio implements employediointra
{
	
	
	Connection con;
	@Override
	public void createEmploye(Employe_assign emp)                                                                     
	{
		Scanner sc=new Scanner(System.in);
		con=connnectDB.createDBconnection();
		String query="insert into employee values(?,?,?,?,?)";
		try {
		PreparedStatement ps=con.prepareStatement(query);
		ps.setInt(1, emp.getEmpId());
		ps.setString(2, emp.getName());
		ps.setString(3, emp.getDepartment());
		ps.setDouble(4, emp.getSalary());
		ps.setInt(5, emp.getAge());
		int cont=ps.executeUpdate();
		if(cont!=0) {
			System.out.println("Entry inserted successfully");
			
		}
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void showallEmploye()
	{	con=connnectDB.createDBconnection();
	String query="select * from employee";
	System.out.println("employee details as folowes");
	System.out.println("........................................................................");
	System.out.format("%s\t%s\t\t%s\t%s\t\t%s\n" ,"ID", "Name", "department", "salary", "age");
	System.out.println("........................................................................");
		try {
			java.sql.Statement str=con.createStatement();
			ResultSet rs=str.executeQuery(query);
			while(rs.next()) {
				System.out.format("%d\t%s\t\t%s\t\t%.2f\t%d\n",rs.getInt(1),rs.getString(2),
						rs.getString(3),rs.getDouble(4),rs.getInt(5));
				System.out.println("........................................................");
			}
			System.out.println("***************************************************\n");
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}

	@Override
	public void showemployeBaseonID(int empid)
	{
		String query=("select *from employee where empid="+empid);
		con=connnectDB.createDBconnection();
		try {
		java.sql.Statement str=con.createStatement();
		ResultSet rs=str.executeQuery(query);
		System.out.println("Employee detail as follow based on id");
		System.out.format("%s\t%s\t\t%s\t%s\t\t%s\n","ID","Name","Department","Salary","age");
		while(rs.next()) {
			System.out.format("%d\t%s\t\t%s\t\t%.2f\t%d\n",rs.getInt(1),rs.getString(2),
					rs.getString(3),rs.getDouble(4),rs.getInt(5));
			System.out.println("........................................................");
		}
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void updateemploye(int empid1,String Newname)
	{	
		con=connnectDB.createDBconnection();
		String query="Update  employee set name=? where empid=?";
		try
		{
		PreparedStatement psd=con.prepareStatement(query);
		psd.setString(1, Newname);
		psd.setInt(2, empid1);
		
		int  rs=psd.executeUpdate();
		
		if(rs!=0) {
			System.out.println("employe updated successfully");
		}
		
		}catch(Exception e) {
			System.out.println("some thing wrong");
		}
		
		
	}

	@Override
	public void deleteemploye(int empid1)
	{
		con=connnectDB.createDBconnection();
		String query="delete from  employee where empid="+empid1;
		try {
			java.sql.Statement str=con.createStatement();
		
			int rs=str.executeUpdate(query);
			if(rs!=0) {
				System.out.println("Entery delete success");
			}
			
		
		}
		catch(Exception e) {
			System.out.println("deleteion not done"+e);
		}
		
		
	}

	
	

}
