package Try_Catch_Finally;

public class Intro {
    String name;
    int age;
    int temp_id;
    Intro(String name, int age) {
        this.name = name;
        this.age = age;
        if (age > 0)
            System.out.println("My name is " + name + ", and I'm " + age + " years old.");
        else
            System.out.println("My name is " + name + ".");
    }

    //CREATE METHOD FOR FIND 'temp_id' USING TRY CATCH BLOCKS
    void Id() {
        try {
            temp_id = 2024 / age + 2024 - age;
            System.out.println("ID: " + temp_id); 
        } catch (Exception e) {
            System.out.println("Error: " + e);
        } finally {
            System.out.println("Good Day!");
        }
        System.out.println();
    }


    public static void main(String[] args) {

        //CREATE OBJECT WITH VALID DETAILS
        Intro user1 = new Intro("Alex", 22);
        user1.Id();

        //CREATE OBJECT WITH INVALID DETAILS
        Intro user2 = new Intro("Bee", 0);
        user2.Id();
    }
}


