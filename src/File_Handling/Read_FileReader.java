package File_Handling;
//IMPORT 'FileReader' CLASS
import javax.print.DocFlavor;
import java.io.FileReader;

public class Read_FileReader {
    public static void main(String[] args) {

        try{
            //CREATE FILE READER OBJECT
            FileReader reader = new FileReader("file_1.txt");
            //GET CHAR VALUE AS A NUMBER IN THE READ FILE
            int i;
            while ((i = reader.read()) != -1)
            {
                //CONVERT THE CHAR VALUE TO CHAR AND PRINT
                System.out.print((char)i);
            }
            //CLOSE THE CONNECTION
            reader.close();
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
