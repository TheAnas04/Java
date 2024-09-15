/*
    15/09/2024
    Reading from a file
*/
import java.io.File;
import java.io.IOException;
import java.io.FileInputStream;
class FileHandeling2 {
    public static void main(String args[]){
        try {
            File f = new File("File2.txt");
            FileInputStream fin = new FileInputStream(f);
            for( int i=0 ; i<f.length() ; i++ )
                System.out.print((char)fin.read());
        }
        catch( IOException e ){
            e.printStackTrace();
        }
    }
}
