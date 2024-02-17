import java.lang.String;
import java.util.Arrays;

public class Data_Types {
    public static void main(String[] args) {

        //PRIMITIVE DATA TYPES AND VARIABLES
        int a = 10;
        double b = 10.11;
        float  c = 10.55f;
        char d = 'd';
        boolean e = true;

            //PRINTS
            System.out.println("int: " +a);
            System.out.println("double: " +b);
            System.out.println("float: " +c);
            System.out.println("char: " +d);
            System.out.println("boolean: " +e);

        System.out.println();

        //NON-PRIMITIVE DATA TYPES AND VARIABLES
        //STRING

        //USING CHAR ARRAY
        char[] char_string = {'s','t','r','i','n','g'};
        String char_string1 = new String(char_string);
            System.out.print("char_string1: ");
            System.out.println(char_string);

        char[] char_string2 = "string".toCharArray();
            System.out.print("char_string2.1: ");
            System.out.println(char_string2);
            System.out.println("char_string2.2: " + Arrays.toString(char_string2));

        System.out.println();

        //USING NORMAL STRING
        String normal_string1 = "string";
        String normal_string2 = "string";
        if(normal_string1 == normal_string2)
        {
            System.out.println("normal_string1: " +normal_string1);
            System.out.println("normal_string2: " +normal_string1);
            System.out.println("normal_string1 = normal_string2");
        }

        System.out.println();

        //USING OBJECT STRING
        String object_string1 = new String("string");
        String object_string2 = new String("string");
        if(object_string1.equals(object_string2))
        {
            System.out.println("object_string1: " +object_string1);
            System.out.println("object_string2: " +object_string2);
            System.out.println("object_string1 != object_string2");
        }

        System.out.println();

        //COMPARE NORMAL AND OBJECT STRING
        if(normal_string1.equals(object_string1))
        {
            System.out.println("normal_string1: " +normal_string1);
            System.out.println("object_string: " +object_string1);
            System.out.println("normal_string1 != object_string1");
        }

        System.out.println();

        //STRING WITH METHOD
        String text_1 = "Text01";
        String text_2 = "Text02";

        System.out.println("To Array: " + Arrays.toString(text_1.toCharArray()));
        System.out.println("Length: " + text_1.length());
        System.out.println("To Lover Case: " +text_1.toLowerCase());
        System.out.println("To Upper Case: " +text_1.toUpperCase());
        System.out.println("Combine: " +text_1 + " " + text_2);
        System.out.println("Combine: " +text_1.concat(" ").concat(text_2));
    }
}
