package pari;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Scanner;

public class EmployeeManagement {
	int num;
	
	static ArrayList<Employee> empList=new ArrayList<Employee>();
	
	public void choice()
	
	{
		System.out.println("1: Add Employee");
		System.out.println("2: Display Employee");
		System.out.println("3: Delete Employee");
		System.out.println("4: Presence of Employee");
	}
	
	public void addEmployee(Employee emp)
	
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("How many Empoyees");
		num=sc.nextInt();
		
		for(int i=0;i<num;i++)
		{
			System.out.println("Enter Employee ID");
			int id=sc.nextInt();
			emp.setEmployeeId(id);
			
			System.out.println("Enter Employee Name");
			String name=sc.next();
			emp.setName(name);
			
			System.out.println("Enter the Date in dd-MM-yyyy format");
			String date = sc.next();
			SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
			Date date2=null;
			try {
			  
			    date2 = dateFormat.parse(date);
			} catch (ParseException e) {
			    e.printStackTrace();
			}
			System.out.println(date2);
			
			emp.setDob(date2);
			
			System.out.println("Enter Employee Designation");
			String designation=sc.next();
			emp.setDesignation(designation);
			
			System.out.println("Enter Employee Salary");
			double salary=sc.nextDouble();
			emp.setSalary(salary);
			empList.add(emp);
			System.out.println("Employee added successfully");
			System.out.println(empList);
			System.out.println(empList.size());
		}
	}
	
	public void diplayEmployees(Employee emp)
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name of the employee: ");
		String name1=sc.next();
		for(Employee emp1 : empList)
		{
			if(name1==emp1.getName())
			{
				System.out.println(emp1.getEmployeeId());
				System.out.println(emp1.getName());
				System.out.println(emp1.getDesignation());
				System.out.println(emp1.getDob());
				System.out.println(emp1.getSalary());
			}
		}
		
	}
	public static void main(String[] args)
	{
		
		Employee emp=new Employee();
		EmployeeManagement obj=new EmployeeManagement(); 
		
		obj.choice();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("");
		System.out.println("Enter Your choice ");
		int choice=sc.nextInt();
	
		switch (choice) 
		{
        case 1: System.out.println("Choice 1"); 
        	 	obj.addEmployee(emp);
        		break;
        case 2: System.out.println("Choice 2");
        		obj.diplayEmployees(emp);
                break;
        case 3: System.out.println("Choice 3"); 
                break;
        case 4: System.out.println("Choice 4"); 
                 break;
        default: System.out.println("Invalid choice");
		}
		//System.out.println(empList.size());
	}

}