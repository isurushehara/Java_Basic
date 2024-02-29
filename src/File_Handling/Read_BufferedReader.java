package File_Handling;
//IMPORT CLASSES
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Read_BufferedReader {
    public static void main(String[] args) {

        //CREATE FILE OBJECT
        File file = new File("file_1.txt");

        try{
            //CREATE 'BufferedReader' OBJECT WITH 'FileReader' OBJECT ARGUMENT
            BufferedReader reader = new BufferedReader(new FileReader(file));
            //READ THE FILE
            String str; //TEMP STORE VARIABLE
            while ((str = reader.readLine()) != null)
            {
                System.out.println(str);
            }
            //CLOSE THE CONNECTION
            reader.close();
        }catch (Exception e) {
            System.out.println(e);
        }
    }
}
