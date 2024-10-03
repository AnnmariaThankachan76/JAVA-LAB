import java.io.*;
public class Fileoperators1 {
	public static void main(String[] args) {
		try {
			FileInputStream fin=new FileInputStream("filename1.txt");
			FileOutputStream fout=new FileOutputStream("filename2.txt");
			int i;
			while((i=fin.read())!=-1) {
				fout.write(i);
			}
			System.out.println("Succesfully wrote the code to filename2 file");
			fin.close();
			fout.close();
		}
		catch(FileNotFoundException e) {
			System.out.println(e.getMessage());
		}
		catch(IOException e) {
			System.out.println(e.getMessage());
		}
	}

}