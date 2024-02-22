package Polymorphism;

public class Method_Overloading {

    //CREATE METHODS WITH SAME NAME, BUT WITH DIFFERENT PARAMETERS
    public void overload_method(){
        System.out.println("Default Overload Method");
    }
    public void overload_method(char x){
        System.out.println("Char Overload Method");
    }
    public void overload_method(int x){
        System.out.println("Integer Overload Method");
    }
    public void overload_method(double x){
        System.out.println("Double Overload Method");
    }
    public void overload_method(double x,double y){
        System.out.println("Double Overload Method with Two Parameters");
    }

    public static void main(String[] args) {

        //CREATE OBJECT
        Method_Overloading Overload_object = new Method_Overloading();

        //CALL ALL 'overload_method' METHODS
        Overload_object.overload_method();
        Overload_object.overload_method('A');
        Overload_object.overload_method(5);
        Overload_object.overload_method(5.5);
        Overload_object.overload_method(1.1, 2.2);
    }
}
