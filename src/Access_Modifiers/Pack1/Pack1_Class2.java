package Access_Modifiers.Pack1;

public class Pack1_Class2 {

    public static void main(String[] args) {

        //CREATE 'Pack1_Class1' CLASS OBJECT AND USE THE VARIABLES
        Pack1_Class1 obj1_1 = new Pack1_Class1();

        obj1_1.P1C1_public = 12;     //CAN ACCESS PIC1_public
        obj1_1.P1C1_default = 12;    //CAN ACCESS P1C1_default
        obj1_1.P1C1_protected = 11;  //CAN ACCESS P1C1_protected
        //obj1_1.P1C1_private = 11;  //CAN'T ACCESS P1C1_private
    }
}
