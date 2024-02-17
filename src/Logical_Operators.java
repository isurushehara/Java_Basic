import java.util.Scanner;

public class Logical_Operators {
    public static void main(String[] args) {

        //LOGICAL OPERATORS (AND[&&] & OR[||])
        //USER CASE: CHECK DRIVING LICENCE

        //GET USER AGE AS A INPUT
        Scanner n = new Scanner(System.in);
        System.out.print("Enter you age : ");
        int age = n.nextInt();
        System.out.print("Have you licence (true or false) : ");
        boolean licence = n.nextBoolean();

        //CHECK THE CONDITIONS
        if (age>18 && licence)
        {
            System.out.println("You are PASS");
        }
        else
        {
            System.out.println("You are FAIL");
        }
    }
}
