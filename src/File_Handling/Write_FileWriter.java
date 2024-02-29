package File_Handling;
//IMPORT FILE WRITER CLASS
import java.io.FileWriter;

public class Write_FileWriter {
    public static void main(String[] args) {

        //CREATE STRING FOR ADD TO THE CREATED FILE
        String txt = "First Line";

        try{
            FileWriter writer = new FileWriter("file_1.txt", true);
            //WRITE THE TEXT
            writer.write(txt);
            //ADD THE TEXT
            writer.append("\nSecond Line");
            //CLOSE THE CONNECTION
            writer.close();
        }catch (Exception e) {
            System.out.println(e);
        }


    }
}
