package Java.Advanced.FileIO;

import java.io.File;
import java.util.Date;

public class FileIORecurEx1 {
    public static void main(String[] args) {
        File file=new File("C:\\Users\\MUKUL\\Downloads\\OFSS_Bootcamp\\Assignments\\Resources\\Dashboards");
        System.out.println(file.isDirectory());
        System.out.println(file.isFile());

        displayFiles(file);
    }

    public static void displayFiles (File file) {

        if(file.isDirectory()) {
            File fileList[]=file.listFiles();
            System.out.println("No. of files/folders is "+fileList.length);
            
            for(File f:fileList) {
                String s=(f.isDirectory())?"Folder" :"File";
                long size=f.length();
                Date lastModified=new Date(f.lastModified());
                System.out.println(f.getName()  +"  \t\t "+ s+"  "+size+"\t"+lastModified);

                if(f.isDirectory())
                displayFiles(f);
            }
        }
    }
}