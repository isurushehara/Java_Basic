package Abstract;

//'Normal_Class' CLASS INHERIT WITH 'Abstract_Class' CLASS
public class Normal_Class extends Abstract_Class{

    //USE ABSTRACT METHOD ('show_name') AFTER ASSIGN A CONTENT
    void show_name(){
        System.out.println("Show Name");
    }

    public static void main(String[] args) {

        //CREATE 'Normal_Class' OBJECT AND USE METHODS
        Normal_Class normal_object = new Normal_Class();
        normal_object.show_name();
        normal_object.show_normal_name();
    }
}
