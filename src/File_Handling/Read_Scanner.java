package File_Handling;
//IMPORT 'File' and 'Scanner' CLASSES
import java.io.File;
import java.util.Scanner;

public class Read_Scanner {
    public static void main(String[] args) {

        //CREATE FILE OBJECT
        File file = new File("file_1.txt");
        try{
            //CREATE SCANNER OBJECT
            Scanner reader = new Scanner(file);

            //READ THE ALL LINES
            while ((reader.hasNextLine())){
                System.out.println(reader.nextLine());
            }
            //READ THE CONNECTION
            reader.close();

        }catch (Exception e){
            System.out.println(e);
        }

    }
}
