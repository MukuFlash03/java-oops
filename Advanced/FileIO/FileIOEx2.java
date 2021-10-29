package Java.Advanced.FileIO;

import java.io.File;
import java.util.Date;

public class FileIOEx2 {

	public static void main(String[] args) {
		File file=new File("C:\\Users\\MUKUL\\Documents\\OFSS_Training_Java");
		System.out.println(file.isDirectory());
		System.out.println(file.isFile());
		if(file.isDirectory()) {
			File fileList[]=file.listFiles();
			System.out.println("No of files/folders is "+fileList.length);
			
			for(File f:fileList) {
				String s=(f.isDirectory())?"Folder" :"File";
				long size=f.length();
				Date lastModified=new Date(f.lastModified());
				System.out.println(f.getName()  +"  \t\t "+ s+"  "+size+"\t"+lastModified);
			}
		}
	}
}

