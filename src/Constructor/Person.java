package Constructor;
import java.util.Objects;

public class Person {

    //DECLARE VARIABLES
    String user_type;
    String name;
    int age;

    //CONSTRUCTOR
    //THIS CONSTRUCTOR ASSIGN VALUES AS A GUEST
    Person(){
        user_type = "Guest";
        name = "User";
        age = 25;
    }

    //CONSTRUCTOR WITH PARAMETER (CONSTRUCTOR OVERLOADING)
    //THIS CONTRACTOR ASSIGN VALUES FROM USER'S INPUT
    Person(String user_name, int user_age){
        user_type = "User";
        this.name = user_name;
        this.age = user_age;
    }

    //CHOOSE USER TYPE (WHETHER GUEST OR USER)
    void showUserType(){
        if(Objects.equals(user_type, "Guest"))
            System.out.println("Your are " + user_type);
        else if(Objects.equals(user_type, "User"))
            System.out.println("Hi " +name);
        else
            System.out.println("Error");
    }

    //SHOW OBJECT ATTRIBUTES USING 'showUserType' METHOD
    void showDetail(){
        showUserType();
        System.out.println("Name: " +name);
        System.out.println("Age: " +age);
        System.out.println();
    }

    public static void main(String[] args){

        //CREATE OBJECTS AS A GUEST AND USER
        Person user1 = new Person();
        Person user2 = new Person("Isuru", 22);

        //CALL 'showDetail' METHOD FOR SHOW OBJECT ATTRIBUTES
        user1.showDetail();
        user2.showDetail();


    }

}
