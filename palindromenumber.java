import java.util.Scanner;
public class palindromenumber 
{
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	int i,sum=0;
	System.out.println("Enter the numder to be checked as palindrome ");
	int n=sc.nextInt();
	int n1=n;
	while(n>0)
	{
		i=n%10;
		sum=sum*10+i;
		n=n/10;
	}
	if(n1==sum)
		System.out.println("the number is palindrome");
	else
		System.out.println("the number is not palindrome");
}
}