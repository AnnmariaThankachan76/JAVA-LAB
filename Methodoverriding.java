package over;
import java.util.Scanner;
class Employee{
	float salary,DA,HRA;
	double grosssalary;
	void display() {
		System.out.println("......EMPLOYEE......");
		}
	void calcSalary(float salary,float DA,float HRA ) {
		grosssalary=salary+(salary*(DA/100))+(salary*(HRA/100));
		System.out.println("The gross salary="+grosssalary);
	}
}
class Engineer extends Employee{
	
	void calcSalary(float salary,float DA,float HRA ) {
		super.display();
		super.calcSalary(salary, DA, HRA);
		//grosssalary = grosssalary*2;
		
	}
	void display() {
		System.out.println("......ENGINEER......");
		grosssalary = grosssalary*2;
		System.out.println("The Salary of the Engineer="+grosssalary);
		}

	
}
public class Methodoverriding {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the basic salary of the Employee");
		float basicsalary=sc.nextFloat();
		System.out.println("Enter ths DA% allowance");
		float DA=sc.nextFloat();
		System.out.println("Enter the HRA% of thr Employee");
		float HRA=sc.nextFloat();
		Engineer engineer = new Engineer();
		engineer.calcSalary(basicsalary, DA,HRA );
		engineer.display();
	}

}
