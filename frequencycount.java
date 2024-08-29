import java.util.Scanner;
public class frequencycount
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string to check the count ");
		String str1=sc.nextLine();
		System.out.println("Enter the character to be searched");
		char ch=sc.nextLine().charAt(0);
		int i,count=0;
		int len=str1.length();
		for(i=0;i<(len);i++)
		{
			if(str1.charAt(i)==ch)
			{
				count++;
			
			}
		}
		System.out.println("The charater "+ ch +" is found "+count+" times in the word "+str1);
	}
}