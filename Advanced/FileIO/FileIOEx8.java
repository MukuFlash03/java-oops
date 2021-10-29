package Java.Advanced.FileIO;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class FileIOEx8 {

public static void main(String[] args) {
	File file=new File("C:\\Users\\MUKUL\\Downloads\\OFSS_Bootcamp\\hello.txt");
	FileOutputStream fo=null;
	PrintStream out=null;
	try {
		fo=new FileOutputStream(file);
		out=new PrintStream(fo);
		out.println("Bangalore "); //every method call it flushes the data
		out.println("Delhi");
		out.println("Mumbai");
		out.println("Chennai");
		out.close(); //should be in finally block 
		
		System.out.println("done .....");
		
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
