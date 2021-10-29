/*
package Java.Advanced.FileIO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class FileIOEx10 {

public static void main(String[] args) {
	File file=new File("D:\\oracle\\oracleBatch7_2021\\employee.ser");
	FileInputStream fi=null;
	ObjectInputStream objectInput=null;
	try {
		fi=new FileInputStream(file);
		objectInput=new ObjectInputStream(fi);
		Employee e=(Employee) objectInput.readObject();
		System.out.println("Object restored succesfully :)");
		System.out.println(e.getEmpId()+"  "+e.getEmpName());
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
}
}
*/