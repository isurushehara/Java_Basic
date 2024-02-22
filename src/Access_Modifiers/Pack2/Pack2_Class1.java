package Access_Modifiers.Pack2;

//IMPORT 'Pack1_Class1' CLASS FROM 'Pack1' PACKAGE
import Access_Modifiers.Pack1.Pack1_Class1;

public class Pack2_Class1 {

    public static void main(String[] args) {

        //CREATE 'Pack1_Class1' CLASS OBJECT AND USE THE VARIABLES
        Pack1_Class1 obj1_1 = new Pack1_Class1();

        obj1_1.P1C1_public = 21;      //CAN ACCESS P1C1_public
        //obj1_1.P1C1_default =21;    //CAN'T ACCESS PIC1_default
        //obj1_1.P1C1_protected = 11; //CAN'T ACCESS P1C1_protected
        //obj1_1.P1C1_private = 11;  //CAN'T ACCESS P1C1_private
    }
}

