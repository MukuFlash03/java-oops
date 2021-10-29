package Java.Advanced.FileIO;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileIOEx4 {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\MUKUL\\Downloads\\OFSS_Bootcamp\\hello.txt");
        FileOutputStream fo = null;
        BufferedOutputStream buffer = null;

        try {
            fo = new FileOutputStream(file);
            // buffer = new BufferedOutputStream(fo);
            buffer = new BufferedOutputStream(fo,2);

            buffer.write('A');
            buffer.write('B');
            buffer.write('C');
            buffer.close();
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
