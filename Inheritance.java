import java.util.Scanner;
class Employee{
	String name;
	int age;
	long phoneNumber;
	String address;
	double salary;
	
	Employee(String name,int age,long phoneNumber,String addres,double salary){
		this.name=name;
		this.age=age;
		this.phoneNumber=phoneNumber;
		this.address=addres;
		this.salary=salary;
	}
	void printEmployee(){
		System.out.println("The name of employee is"+name+"\n");
		System.out.println("The age  of employee is"+age+"\n");
		System.out.println("The Phone Number of employee is"+phoneNumber+"\n");
		System.out.println("The address of employee is"+address+"\n");
	
	}
	void printSalary(){
		System.out.println("The salary of the employee is "+salary+"\n");
	}
}
class Officer extends Employee{
	String specialzation;
	Officer(String name,int age,long phoneNumber,String address,double salary,String specilization1){
		super(name,age,phoneNumber,address,salary);
	}
	void printSpecification(){
		System.out.println("The specilization  of the  employee is"+specialzation+"\n");	
	}
		
}


class Manager extends Employee{
	String department;
	Manager(String name,int age,long phoneNumber,String address,double salary,String department){
		super( name, age, phoneNumber,address,salary);
	}
	void printdepartment(){
		System.out.println("The department   of the  employee is"+department+"\n");
	}
	
}
	

public class Inheritance {
	public static void main(String args[]){
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Details of the  Officer");
		
		System.out.println("Enter the name of employee");
		String name=sc.next();
		System.out.println("Enter the age of employee");
		int age=sc.nextInt();
		System.out.println("Enter the phone number of employee");
		long phoneNumber=sc.nextLong();
		System.out.println("Enter the address of employee");
		String address=sc.next();
		System.out.println("Enter the salary  of employee");
		double salary=sc.nextDouble();
		System.out.println("Enter the specilication  of employee");
		String specilication=sc.next();
		
		System.out.println("Details of the  Manager");
		System.out.println("Enter the name of empolyee");
		String nameManager=sc.next();
		System.out.println("Enter the age of employee");
		int ageManager=sc.nextInt();
		System.out.println("Enter the phone number of employee");
		long phoneNumberManager=sc.nextLong();
		System.out.println("Enter the address  of employee");
		String addressManger=sc.next();	
		System.out.println("Enter the salary of employee");
		double salaryManager=sc.nextDouble();
		System.out.println("Enter the  department of employee");
		String department=sc.next();
		System.out.println("Details of the  employee\n");
		Officer officer = new Officer(name,age,phoneNumber,address,salary,specilication);
		officer.printEmployee();
		officer.printSpecification();
		System.out.println("Details of the  Manager\n");
		Manager manager=new Manager(nameManager,ageManager,phoneNumberManager,addressManger,salaryManager,department);
		manager.printEmployee();
		manager.printdepartment();
	
		sc.close();
	}
	
}
