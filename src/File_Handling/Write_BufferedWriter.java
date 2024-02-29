package File_Handling;
//IMPORT 'BufferedWriter' AND 'FileWriter' CLASSES
import java.io.BufferedWriter;
import java.io.FileWriter;

public class Write_BufferedWriter {
    public static void main(String[] args) {

        try{
            BufferedWriter writer = new BufferedWriter(new FileWriter("file_2.txt", true));
            //WRITE THE TEXT
            writer.write("Welcome");
            //CALL THE NEW LINE METHOD
            writer.newLine();
            //ADD A TEXT
            writer.append("new");
            //CLOSE THE CONNECTION
            writer.close();
        }catch(Exception e){
            System.out.println(e);
        }

    }
}
