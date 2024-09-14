/*
    14/09/2024
    write in a File.
*/

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;;
public class FileHandeling {
    public static void main(String[] args) {
        try{
            File file = new File("File1.txt");
            FileOutputStream fout = new FileOutputStream(file);
            String str = "Hello I am writing in file";
            byte arr[] = str.getBytes();
            fout.write(arr);
        }
        catch ( IOException e ){
            System.out.println(e);
        }
    }
}