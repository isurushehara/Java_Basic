package Encapsulation;

public class Viewer {

    public static void main(String[] args) {

        //CREATE 'User' CLASS OBJECT
        User user_1 = new User();
        //SET THE NAME AND GET THE NAME
        user_1.setName("Kevin");
        System.out.println(user_1.getName());
        //SET THE USERNAME AND CAN'T GET THE USERNAME
        user_1.setUsername("kevin11");
    }
}
