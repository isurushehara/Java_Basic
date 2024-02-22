package Abstract;

//ABSTRACT CLASS
//(BECAUSE THIS CLASS HAS ABSTRACT METHOD)
abstract public class Abstract_Class {

    //CREATE ABSTRACT METHOD
    abstract void show_name();

    //NORMAL METHOD
    void show_normal_name(){
        System.out.println("Normal Name");
    }

    public static void main(String[] args) {
        //CAN'T CREATE ABSTRACT CLASS OBJECT
        //Abstract_Class abstract_object = new Abstract_Class();
    }
}

