package matrix;

import java.util.*;

class Employee{
	String name ;
	int age;
	
	// constructor
	Employee(String name,int age){
		this.name=name;
		this.age=age;
	}
}

public class EmployeeList {
	ArrayList<Employee> employees;
	
	// initialize arraylist
	EmployeeList(){
		employees = new ArrayList<Employee>();
	}
	
	void add(){
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the name of the employee: ");
		String name = s.next();
		
		System.out.print("Enter the Age of the employee: ");
		int age = s.nextInt();
		
		// create a new employee object 
		Employee e = new Employee(name,age);
		
		// add this employee to list
		employees.add(e);
	}
	
	void print(){
		for(int i=0;i<employees.size();i++){
			System.out.println(employees.get(i).name+" "+employees.get(i).age);
		}
	}
	
	public static void main(String[] argv){
		EmployeeList el = new EmployeeList();
		
		System.out.print("How many employees do u want to insert?\nAns: ");
		Scanner s = new Scanner(System.in);
		
		int n=s.nextInt();
		
		for(int i=0;i<n;i++){
			
			el.add();
			
		}
	}
}
