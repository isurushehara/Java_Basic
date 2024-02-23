package Keywords;

//CREATE SUPERCLASS
class Super_Class{
    String name = "Super";
    void answer(){
        System.out.println("Super Answer");
    }
}
//CREATE SUBCLASS
class Sub_Class extends Super_Class{
    String name = "Sub";
    //SHOW SUPER AND SUB CLASSES NAME(VARIABLES) USING 'super' KEYWORD
    void show_name(){
        System.out.println("Superclass Name: " +super.name);
        System.out.println("Subclass Name: " +name);
    }

    //CREATE SUBCLASS METHOD AND CALL SUPERCLASS METHOD USING 'super' KEYWORD
    void answer(){
        super.answer();
        System.out.println("Sub Answer");
    }
}

public class super_Answer {

    public static void main(String[] args) {
        //CREATE SUBCLASS OBJECT AND CALL SUBCLASS'S METHOD
        Sub_Class sub_class_Object = new Sub_Class();
        sub_class_Object.show_name();
        sub_class_Object.answer();

    }
}
