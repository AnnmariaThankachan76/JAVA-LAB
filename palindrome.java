import java.util.Scanner;
public class palindrome 
{
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the string to check whether it is palindrome or not ");
	String str1=sc.nextLine();
	int i,flag=0;
	int len=str1.length();
	for(i=0;i<(len/2);i++)
	{
		if(str1.charAt(i) !=  str1.charAt(len-i-1))
		{
			flag=1;
			break;
		}
		
	}
	if(flag==0)
		System.out.println("Palindrome");
	else
		System.out.println("not Palindrome");
}


}
