package File_Handling;
//IMPORT FILE CLASS
import java.io.File;

public class CreateFile {
    public static void main(String[] args) {

        //FILE CREATE
        File object_1 = new File("file.txt");

        try{
            //CALL FILE CLASS'S METHODS
            System.out.println("Create the file: " +object_1.createNewFile());
            System.out.println("Absolute Path: " +object_1.getAbsoluteFile());
            System.out.println("File Name: "+ object_1.getName());
            System.out.println("Exists: " +object_1.exists());
            System.out.println("Can Write: " +object_1.canWrite());
            System.out.println("Can Read: " +object_1.canRead());
            System.out.println("Length: " +object_1.length());
            System.out.println();

            //FILE DELETE
            if(object_1.delete()) {
                System.out.println("Deleted");
            }
            else{
                System.out.println("No file");
            }

        }catch (Exception e) {
            System.out.println(e);
        }

    }
}
