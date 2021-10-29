package Java.Advanced.FileIO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileIOEx5 {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\MUKUL\\Downloads\\OFSS_Bootcamp\\hello.txt");
        FileInputStream fi = null;

        try {
            fi = new FileInputStream(file);
            int ch = 0;
            while ((ch = fi.read()) != -1) 
                System.out.print((char)ch);
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
    
}
