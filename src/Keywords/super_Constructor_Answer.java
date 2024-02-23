package Keywords;

//CREATE A SUPERCLASS WITH CONSTRUCTOR
class User{
    String name;
    int age;
    User(String name, int age){
        this.name = name;
        this.age = age;
    }
}

//CREATE A SUBCLASS WITH CONSTRUCTOR AND CALL SUPERCLASS CONSTRUCTOR
class User_01 extends User{
    String username;
    User_01(String name, int age){
        super(name, age);
        username = name + age;
    }
    //CREATE METHOD AS A GET METHOD
    void show_user_details(){
        System.out.println("Name: " +name);
        System.out.println("Age: " +age);
        System.out.println("Username: " +username);
    }
}

public class super_Constructor_Answer {
    public static void main(String[] args) {

        //CREATE SUBCLASS OBJECT
        User_01 user_01 = new User_01("Alex", 22);
        user_01.show_user_details();
    }
}
