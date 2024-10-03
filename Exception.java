import  java.util.Scanner;
public class Exception {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	char confirmation;
	System.out.println("1.Arithmetic operation ");
	System.out.println("2.Array acess");
	System.out.println("Enter your choice");
	int choice=sc.nextInt();
	do {
	switch(choice) {
	case 1:
		try{
			System.out.println("Enter the number to be divided");
			int divident=sc.nextInt();
			System.out.println("Enter the divisor");
			int divisior=sc.nextInt();
			int result=divident/divisior;
			System.out.println("The result is "+result);
			}
		catch(ArithmeticException e){
			System.out.println("Caught an exception "+e.getMessage());
		}
		break;
	case 2:
		try {
			int array[]= {2,5,8,9};
			System.out.println("Enter the index you want to acess ");
			int index=sc.nextInt();
			System.out.println("The number in "+index +" is "+array[index]);
		    }
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Caught an exception "+e.getMessage());
			}
		break;
		default:
			System.out.println("Invalid choice");
			break;
		}
	System.out.println("dO YOU WANT TO CONTINUE : type Y or N ");
	confirmation=sc.next().charAt(0);
	}
	while(confirmation=='y' || confirmation=='Y');
	
		
}
}
