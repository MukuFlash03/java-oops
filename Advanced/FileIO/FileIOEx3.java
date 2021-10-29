package Java.Advanced.FileIO;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileIOEx3 {
    public static void main(String[] args) {
        File file=new File("C:\\Users\\MUKUL\\Downloads\\OFSS_Bootcamp\\hello.txt");
        FileOutputStream fo=null;
        
        try {
            // fo=new FileOutputStream(file);
            fo=new FileOutputStream(file, true);
            fo.write('A');
            fo.write('B'); //exceptions ==>u hv no permission write or file is already closed
            fo.write('C');

            String msg = "Hi there!";
            fo.write(msg.getBytes());
    
            fo.close();
            System.out.println("Done .....");
        } 
        catch (FileNotFoundException e) {
            e.printStackTrace();
        } 
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
