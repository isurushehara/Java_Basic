package Inheritance;

//CHILD OR SUBCLASS WHICH EXTENDS WITH "Subject" CLASS
public class Maths extends Subject{

    public static void main(String[] args) {
        //CREATE MATHS OBJECT
        Maths mathemathic = new Maths();

        //USE SUPER CLASS VARIABLES AND METHOD
        mathemathic.name = "Mathematic";
            System.out.println("Subject Name: " +mathemathic.name);
        mathemathic.grade(0);
    }
}
