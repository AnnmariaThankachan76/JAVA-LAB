import java.util.Scanner;
public class vowelscount
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string to check the count ");
		String str=sc.nextLine();
		String str1=str.toLowerCase();
		int i,count=0,count1=0, count3=0;
		int len=str1.length();
		for(i=0;i<(len);i++)
			{
				if((str1.charAt(i)=='a')||(str1.charAt(i)=='e')||(str1.charAt(i)=='i')||(str1.charAt(i)=='o')||(str1.charAt(i)=='u'))
					{
						count++;
				}																																													
				else if(str1.charAt(i)==' ')
				{
					count1++;
				}
				else
					count3++;
			}
		System.out.println("The number of vowels in the string is  "+count);
		System.out.println("The number of consonents in the string is  "+count3);
		System.out.println("The number of spaces in the string is  "+count1);
	}
}