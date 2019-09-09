package Threads;

import java.awt.List;
import java.util.ArrayList;

public class Employee {
	public static 	 ArrayList<Employee> list = new ArrayList<Employee>();
	public int id;
	 public String name;
	 public String city;
	 public static int sal;
	 public static int count = 0;
	 
	 //zero argument constructor. Gets called by default when an object is created for the Employee class
	 public Employee(){}
	 
	 //Parameterized Constructor
	 public Employee(int id, String name,String city,int sal)
	 {
	 super();
	 this.id = id;
	 this.name = name;
	 this.city=city;
	 this.sal=sal;
	 count++;
	 }
	 
	 public int getId() {
	 return id;
	 }
	 public int getsal() {
		 return sal;
		 }
	 
	 public String getName() {
	 return name;
	 }
	 
	 public String getAddress() {
	 return city;
	 }
	class EmployeeDB
	{
		public boolean addEmployee(Employee e)
		{
			 list.add(e);
			return true;
		}
		public boolean deleteEmployee(int eCode)
		{
			list.remove(eCode);
			return true;
		}
		public int showPaySlip(int eCode)
		{
			int pos = list.indexOf(eCode);
			Employee str= list.get(pos-1);
			return Employee.sal;
		}
		
		
	}
	 
	public static void main(String[] args) throws Exception 
	 {

	 Employee e=new Employee();
	 list.add(new Employee(1, "Ravi","Delhi",15000));
	 list.add(new Employee(2, "Raj","Mumbai",789654));
	 list.add(new Employee(3, "Rekha","Chennai",15462));
	 list.add(new Employee(4, "Ram","Siliguri",78965));
	 
	 for (Employee s : list) //Iterates as long as there are elements in the list. An object s is created of type Employee class.
	 {
	 System.out.print("ID, Name and City of the employee are : ");
	 System.out.println(s.getId()+" "+s.getName()+" " +s.getAddress()+"" +s.getsal());
	 }
	 EmployeeDB db=e.new EmployeeDB();
	 db.addEmployee(new Employee(10, "pavi","Delhi",15000));
	 db.deleteEmployee(2);
	 db.showPaySlip(2);
	 for (Employee s : list) //Iterates as long as there are elements in the list. An object s is created of type Employee class.
	 {
	 System.out.print("ID, Name and City of the employee are : ");
	 System.out.println(s.getId()+" "+s.getName()+" " +s.getAddress()+"" +s.getsal());
	 }
			 
	 }//End of main() method
}
