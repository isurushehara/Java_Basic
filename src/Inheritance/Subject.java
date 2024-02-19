package Inheritance;

//PARENT OR SUPER CLASS
public class Subject {
    //VARIABLE FOR SUBJECT NAME
    String name;

    //WHETHER CHECK PASS OR FAIL
    void grade(int mark){
        if(mark >= 35 && mark>=0 && mark<=100 )
            System.out.println("You are Pass!");
        else if(mark<35 && mark>=0 && mark<=100)
            System.out.println("You are Fail!");
        else
            System.out.println("Error!");
    }
}
