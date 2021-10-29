/*
package Java.Advanced.FileIO;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class FileIOEx9 {
public static void main(String[] args) {
	File file=new File("D:\\oracle\\oracleBatch7_2021\\employee.ser");
	FileOutputStream fo=null;
	ObjectOutputStream objectOutput=null;
	Employee e=new Employee();
	e.setEmpId(101);
	e.setEmpName("Hritik");
	
try {
	fo=new FileOutputStream(file);
	objectOutput=new ObjectOutputStream(fo);
	
	objectOutput.writeObject(e);
	System.out.println("Success....");
	objectOutput.close();
} catch (FileNotFoundException e1) {
	e1.printStackTrace();
} catch (IOException e1) {
	// TODO Auto-generated catch block
	e1.printStackTrace();
}
}
}
*/