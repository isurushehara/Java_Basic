package Polymorphism.Method_Overriding;

//INHERIT WITH 'Old' CLASS
public class New extends Old{

    //CREATE METHOD WITH SAME NAME WHICH 'Old' CLASS METHOD
    public void latest_update(){
        System.out.println("2024-01-01");
    }

    public static void main(String[] args) {

        //CREATE OBJECT AND CALL 'latest_update' METHOD
        New news = new New();
        news.latest_update();
    }
}
