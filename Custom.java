import java.util.Scanner;
class AgeException extends Throwable{
	  public AgeException(String message){
		super(message);
	}
}
public class Custom {
	public static void validateAge(int age) throws AgeException{
		if(age<18) {
			throw new AgeException("Age must be greater than 18");
		}
		else {
			System.out.println("Age is valid");
		}
	}
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the age to check whether you is eligible for voting or not ");
	int age=sc.nextInt();
	try {
		validateAge(age);
	}
	catch(AgeException e){
		System.out.println("Error:"+e.getMessage());
	}
	finally {
		System.out.println("18 years of age is the required minimal age for voting");
	}
	sc.close();
}
}
