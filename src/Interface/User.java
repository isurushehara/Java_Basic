package Interface;

//'User' CLASS IMPLEMENTS WITH 'User_Interface' INTERFACE
//(SHOULD INITIALIZE ALL METHOD IN INTERFACE WITH 'public' TYPE)
public class User implements User_Interface{
    public void post(){
        System.out.println("Post Method");
    }
    public void share(){
        System.out.println("Share Method");
    }

    public static void main(String[] args) {

        //CREATE 'User' CLASS OBJECT
        User user_01 = new User();
        user_01.post();
        user_01.share();
        System.out.println("Platform :" +user_01.platform);
    }
}
