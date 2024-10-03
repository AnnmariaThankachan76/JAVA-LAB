import java .io.File;
import java.io.IOException;
public class FileOperators {
	public static void main(String[] args) {
		try {
		File obj=new File("filename2.txt");
		obj.createNewFile();
		}
		catch(IOException e) {
			System.out.println(e.getMessage());
		}
	}

}
