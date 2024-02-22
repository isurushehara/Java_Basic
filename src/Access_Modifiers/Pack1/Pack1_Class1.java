package Access_Modifiers.Pack1;

//IMPORT 'Pack2_Class1' CLASS AND 'Pack2_Class2' CLASS FROM 'Pack2' PACKAGE
import Access_Modifiers.Pack2.Pack2_Class1;
import Access_Modifiers.Pack2.Pack2_Class2;

public class Pack1_Class1 {

    //CREATE VARIABLES FOR EACH MODIFIER
    public int P1C1_public;
    int P1C1_default;
    protected int P1C1_protected;
    private int P1C1_private;

    public static void main(String[] args) {

        //CREATE 'Pack1_Class1' CLASS OBJECT AND USE THE VARIABLES
        Pack1_Class1 obj1_1 = new Pack1_Class1();

        obj1_1.P1C1_public = 11;
        obj1_1.P1C1_default = 11;
        obj1_1.P1C1_protected = 11;
        obj1_1.P1C1_private = 11;

        //CREATE OBJECTS USING OTHER CLASSES
        Pack1_Class2 obj1_2 = new Pack1_Class2();
        Pack2_Class1 obj2_1 = new Pack2_Class1();
        Pack2_Class2 obj2_2 = new Pack2_Class2();


    }
}
