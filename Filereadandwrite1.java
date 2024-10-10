import java.util.*;
import java.io.*;
public class Filereadandwrite1 {
public static void main(String[] args) {
	try {
		File obj=new File("Register1.txt");
		obj.createNewFile();
		System.out.println("Sucessfully created the file");
		
		//write in the file
		Scanner sc=new Scanner(System.in);
		FileWriter fout=new FileWriter("Register1.txt");
		System.out.println("Enter the Keam rank no.");
		int n=sc.nextInt();
		fout.write(n+"\n");
		fout.close();

		//Read the file
		FileReader fin=new FileReader("Register1.txt");
		BufferedReader read=new BufferedReader(fin);
		String content;
		System.out.println("Content of Register1 is:");
		while((content=read.readLine())!=null)
		{
			System.out.println(content);
		}
		read.close();
	}
	catch(IOException e) {
		System.out.println(e.getMessage());
		}
	
}
}


