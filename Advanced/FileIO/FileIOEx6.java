package Java.Advanced.FileIO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileIOEx6 {
    public static void main(String[] args) {
        File file1 = new File("C:\\Users\\MUKUL\\Downloads\\OFSS_Bootcamp\\hello.txt");
        File file2 = new File("C:\\Users\\MUKUL\\Downloads\\OFSS_Bootcamp\\world.txt");
        FileInputStream fi = null;
        FileOutputStream fo = null;

        try {
            fi = new FileInputStream(file1);
            fo = new FileOutputStream(file2);
            int ch = 0;
            while ((ch = fi.read()) != -1) {
                fo.write((char)ch);
                // System.out.print((char)ch);
            }
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
