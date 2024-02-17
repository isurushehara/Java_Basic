//USE CLASS AND OBJECT
//CREATE PACKAGE AND MOVE THE PLAYER CLASS
package Class_Object;

//CREATE A CLASS NAMED "PLAYER"
public class Player {

    //DECLARE VARIABLES FOR OBJECT STATES
    String name;
    int age;

    //CREATE METHOD FOR OBJECT BEHAVIOR
    public void walkRight(int steps)    //WALK RIGHT METHOD
    {
        System.out.println(name+ " can walk right and Go!");

        for (int i = 0; i<steps; i++)
        {
            System.out.println("Step " + (i+1));
        }
        System.out.println("Stop!");
        System.out.println();
    }
    public void walkLeft(int steps)     //WALK LEFT METHOD
    {
        System.out.println(name+ " can walk left and Go!");

        for (int i = 0; i<steps; i++)
        {
            System.out.println("Step " + (i+1));
        }
        System.out.println("Stop!");
        System.out.println();
    }


    //CREATE MAIN CLASSS
    public static void main(String[] args) {

        //CREATE A PLAYER OBJECT
        Player person_01 = new Player();

        //ASSIGN THE VALUES
        person_01.name = "Kamal";
        person_01.age = 22;

        //SHOW OBJECT STATES
        System.out.println("Player name: " +person_01.name);
        System.out.println("Player age: " +person_01.age);
        System.out.println();

        //USE OBJECT METHODS
        person_01.walkRight(3);
        person_01.walkLeft(5);
    }

}
