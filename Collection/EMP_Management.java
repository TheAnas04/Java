/*
	You are tasked with building a simplified employee management system that stores employees in an ArrayList. Each employee has the following attributes:

	ID (Integer): A unique identifier for the employee.
	Name (String): The name of the employee.
	Age (Integer): The age of the employee.
	Department (String): The department in which the employee works (e.g., HR, Engineering, Sales).
	Salary (Double): The salary of the employee.
	You need to perform the following tasks:

	Sort the employees by salary in descending order.
	Find the employee with the highest salary.
	Group employees by their department (output a map where the keys are department names, and the values are lists of employees).
	Filter employees who earn more than a certain amount and return a list of their names.
	Remove employees who are under 30 years of age.
	Print the details of all employees who work in a specified department, sorted by their age in ascending order.
*/

import java.util.List;
import java.util.Set;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collections;
import java.util.Map;
import java.util.HashMap;
class Test{
	public static void main(String args[]){
		List <Employee> l = new ArrayList<Employee>();
		
		Employee e1 = new Employee(1,23, 56000, "A", "Developer");
		Employee e2 = new Employee(2,30, 9000, "B", "QA");
		Employee e3 = new Employee(3,21, 89000, "C", "QA");
		Employee e4 = new Employee(6,45, 6000, "D", "QA");
		Employee e5 = new Employee(1,23, 67000, "E", "Developer");
		
		l.add(e1);
		l.add(e2);
		l.add(e3);
		l.add(e4);
		l.add(e5);
		
		// SORTING THE EMPLOYEE ON THE BASIS OF SALARY (DESCENDING ORDER)
		Collections.sort(l,new Employee());
		
		// EMPLOYEE WITH MAXIMUM SALARY
		Employee maxSalaryEmployee = findMax(l);
		System.out.println(maxSalaryEmployee);
		
		// GROUPING THE EMPLOYEES ON THE BASIS OF DEPARTMENT
		Map m = departmentWise(l);
		System.out.println(m);
		
		// REMOVING THE EMPLOYEES WITH LESS SALARY THAN X
		List EmpWith_X_salary = removeEmployeeBySalary(l);
		System.out.println(EmpWith_X_salary);
		
		// EMPLOYEE WIHT MINIMUM AGE=30
		showEmpWith_X_age(l);
		
		System.out.println(l);
		// SORT EMPLOYEE (DEPARTMENT WISE) ON THE BASIS OF THEIR SALARY
		sortDepartmentWiseOnSalary(l);
		
	}
	
	// SORT EMPLOYEE ON SALARY OF A DEPARTMENT
	public static void sortDepartmentWiseOnSalary(List og){
		List <Employee> l = new ArrayList<Employee>(og);
		for(int i=0 ; i<l.size() ; i++ ){
			Employee emp = (Employee) l.get(i);
			if(!((emp.getDepartment()).equals("QA"))) l.remove(emp);
		}
		
		//System.out.println(l);
		
		for(int i=0 ; i<l.size() ; i++ ){
			for(int j=i+1 ; j<l.size() ; j++ ){
				Employee e1 = (Employee) l.get(i);
				Employee e2 = (Employee) l.get(j);
				if(e1.getSalary()>e2.getSalary()){
					l.set(i,e2);
					l.set(j,e1);
				}
			}
		}
		
		System.out.println(l);
		
	}
	
	// EMPLOYEE WITH AGE > 30 
	public static void showEmpWith_X_age(List l){
		for(int i=0 ; i<l.size() ; i++ ){
			Employee emp = (Employee) l.get(i);
			if(emp.getAge()>=30){
				System.out.println(emp);
			}
		}
	}
	
	// LIST OF EMPLOYEE WIHT MINIMUM SALARY=70000
	public static List removeEmployeeBySalary(List og){
		List<Employee> l = new ArrayList<Employee>(og);
		for(int i=0 ; i<l.size() ; i++ ){
			Employee emp = (Employee)l.get(i);
			if(emp.getSalary()<=70000) l.remove(emp);
		}
		return l;
	}
	
	// EMPLOYEE GROUPED BY DEPARTMENT
	public static Map departmentWise(List l){
		Map <String, ArrayList<Employee>> map = new HashMap<String, ArrayList <Employee> >();
		
		for( int i=0 ; i<l.size() ; i++ ){
			Employee emp = (Employee) l.get(i);
			ArrayList <Employee> empList = new ArrayList<Employee>();
			if( !map.containsKey(emp.getDepartment()) ){
				empList.add(emp);
				map.put(emp.getDepartment(), empList);
			}
			else {
				empList = map.get(emp.getDepartment());
				empList.add(emp);
				
				map.put(emp.getDepartment(), empList);
			}
		}
		return map;
	}
	
	// EMPLOYEE WITH THE HIGHEST SALARY
	public static Employee findMax(List l){
		Employee emp = (Employee)l.get(0);
		double max = emp.getSalary();
		for( int i=0 ; i<l.size() ; i++ ){
			Employee temp = (Employee)l.get(i);
			if(temp.getSalary()>max){
				emp = (Employee)l.get(i);
			}
		}
		return emp;
	}
}

class Employee implements Comparable<Employee>, Comparator<Employee>{
	private int id;
	private String name;
	private int age;
	private double salary;
	private String department;
	
	public Employee(){}
	
	public Employee(int id, int age, double salary, String name, String department){
		this.id = id;
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.department = department;
	}
	
	public int compare(Employee e1, Employee e2){
		if(e1.getSalary()>e2.getSalary()) return -1;
		else if (e1.getSalary()<e2.getSalary()) return +1;
		else return 0;
	}
	
	public int compareTo(Employee e){
		//return this.getId().compare(e.getId());/
		if(this.getId()>e.getId()) return +1;
		else if (this.getId()<e.getId()) return -1;
		else return 0;
	}
	
	public String toString(){
		return "\nId: "+this.getId()+"\nName: "+this.getName()+"\nAge: "+this.getAge()+"\nSalary: "+this.getSalary()+"\nDepartment: "+this.getDepartment()+"\n\n";
	}
	
	//EMPLOYEE WITH MAXIMUM SALARY
	
	public int getId(){
		return this.id;
	}
	public String getName(){
		return this.name;
	}
	public int getAge(){
		return this.age;
	}
	public double getSalary(){
		return this.salary;
	}
	public String getDepartment(){
		return this.department;
	}
}