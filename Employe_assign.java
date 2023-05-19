package employee_mgmt;

public class Employe_assign
{
	private int empId;
	private String name;
	private String department;
	private double salary;
	private int age;
	
	public int getEmpId()
	{
		return empId;
	}
	public void setEmpId(int empId)
	{
		this.empId = empId;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public String getDepartment()
	{
		return department;
	}
	public void setDepartment(String department)
	{
		this.department = department;
	}
	public double getSalary()
	{
		return salary;
	}
	public void setSalary(double salary)
	{
		this.salary = salary;
	}
	public int getAge()
	{
		return age;
	}
	public void setAge(int age)
	{
		this.age = age;
	}
	public Employe_assign() {
		
	}
	
	public Employe_assign(int empId, String name, String department, double salary, int age)
	{
		this.empId		= empId;
		this.name			= name;
		this.department	= department;
		this.salary		= salary;
		this.age			= age;
	}
	public String toString() {
		String s=String.format("%d,%s,%s,%.2f,%d",empId,name,department,salary,age);
		return s;
	}
	

}
