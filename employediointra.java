package employee_mgmt;

interface employediointra
{
	public void createEmploye(Employe_assign emp);
	public void showallEmploye();
	public void showemployeBaseonID(int empid);
	public void updateemploye(int empid,String name);
	public void deleteemploye(int empid);
}
