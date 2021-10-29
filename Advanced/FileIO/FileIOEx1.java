package Java.Advanced.FileIO;

import java.io.File;
import java.io.IOException;

public class FileIOEx1 {
    public static void main(String[] args) {
	File file=new File("C:\\Users\\MUKUL\\Documents\\OFSS_Training_Java");
	System.out.println(file.exists());
	
	if(!file.exists()) {
			try {
				boolean status=file.createNewFile();
				System.out.println("File creation "+status);
			} 
            catch (IOException e) {
				e.printStackTrace();
			}
	}
}
}
